package com.senac.ws;

import com.senac.bean.CardapioItem;
import com.senac.bean.Cliente;
import com.senac.bean.Pedido;
import com.senac.crud.RNException;
import com.senac.rn.CardapioItemRN;
import com.senac.rn.ClienteRN;
import com.senac.rn.PedidoAguardandoRN;
import com.senac.rn.PedidoRN;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServidorCantinaWS")
public class ServidorCantinaWS {
    private static CardapioItemRN cardapioItemRN;
    private static ClienteRN clienteRN;
    private static PedidoRN pedidoRN;
    private static PedidoAguardandoRN pedidoAguadandoRN;

    public ServidorCantinaWS() {
        cardapioItemRN = new CardapioItemRN();
        clienteRN = new ClienteRN();
        pedidoRN = new PedidoRN();
        pedidoAguadandoRN = new PedidoAguardandoRN();
    }
        
    @WebMethod(operationName = "autenticarCliente")
    public List<CardapioItem> autenticarCliente(@WebParam(name = "matricula") Integer matricula, 
            @WebParam(name = "senha") String senha) {
        boolean existe = false;
        
        for (Cliente c : clienteRN.pesquisar()) {
            if (c.getMatricula().equals(matricula) && c.getSenha().equals(senha)) {
                existe = true;
                break;
            }
        }
        
        if (existe) {
            return cardapioItemRN.pesquisar();
        } else {
            throw new RNException(RNException.Tipo.MATRICULA_SENHA_INCORRETO, "Matricula e/ou Senha incorretos.");
        }
    }
    
    @WebMethod(operationName = "buscarDadosCliente")
    public Cliente buscarDadosCliente(@WebParam(name = "cliente") Cliente cliente) {
        Cliente clienteRetorno = clienteRN.consultar(cliente);
        
        if (clienteRetorno == null) {
            throw new RNException(RNException.Tipo.CLIENTE_INEXISTENTE, "Cliente inexistente.");
        }
        
        return clienteRetorno; 
    }
    
    @WebMethod(operationName = "enviarPedido")
    public double enviarPedido(@WebParam(name = "pedido") Pedido pedido) {
        double saldoCliente;
        double valorPedido = 0;
        
        if (pedido == null) {
            throw new NullPointerException("Erro ao enviar pedido. Pedido não informado.");
        }
        
        saldoCliente = pedido.getCliente().getSaldo();
        
        for (CardapioItem item : pedido.getItensPedido()) {
            valorPedido += item.getValor();
        }
        
        if (valorPedido > saldoCliente) {
            throw new RNException(RNException.Tipo.SALDO_INSUFICIENTE, "Saldo insuficiente.");
        }
        
        saldoCliente -= valorPedido;
        pedido.getCliente().setSaldo(saldoCliente);

        clienteRN.alterar(pedido.getCliente());
        pedidoRN.salvar(pedido);
        
        return saldoCliente;
    }
    
    @WebMethod(operationName = "solicitarPedido")
    public Pedido solicitarPedido() {  
        if (pedidoRN.pesquisar().isEmpty()) {
            throw new RNException(RNException.Tipo.NAO_HA_PEDIDOS, "Não há pedidos na fila.");
        }
        
        Pedido pedido = pedidoRN.pesquisar().get(0);
        pedidoRN.excluir(pedido);
        pedidoAguadandoRN.salvar(pedido);
        return pedido;
    }
    
    @WebMethod(operationName = "buscarFilaPedidos")
    public List<Pedido> buscarFilaPedidos() {
        return pedidoRN.pesquisar();
    }
    
    @WebMethod(operationName = "fecharPedido")
    public String fecharPedido(@WebParam(name = "numeroPedido") Integer numeroPedido) {
        Pedido pedido;
        
        if (numeroPedido.equals("")) {
            throw new NullPointerException("Erro ao fechar o pedido. Número do pedido não informado.");
        }
        
        pedido = pedidoAguadandoRN.consultar(numeroPedido);
        
        if (pedidoAguadandoRN.excluir(pedido)) {
            return "Pedido fechado.";
        } else {
            throw new RNException(RNException.Tipo.PEDIDO_NAO_FECHADO, "Não foi possível fechar o pedido.");
        }
    }
    
}
