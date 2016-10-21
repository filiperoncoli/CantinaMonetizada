package com.senac.ws;

import com.senac.bean.CardapioItem;
import com.senac.bean.Cliente;
import com.senac.bean.Pedido;
import com.senac.crud.MockBancoDados;
import com.senac.rn.CardapioItemRN;
import com.senac.rn.ClienteRN;
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

    public ServidorCantinaWS() {
        cardapioItemRN = new CardapioItemRN();
        clienteRN = new ClienteRN();
        pedidoRN = new PedidoRN();
    }
        
    @WebMethod(operationName = "autenticarCliente")
    public List<CardapioItem> autenticarCliente(@WebParam(name = "matricula") Integer matricula, @WebParam(name = "senha") String senha) {
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
            return null;
        }
    }
    
    @WebMethod(operationName = "enviarPedido")
    public void enviarPedido(@WebParam(name = "pedido") Pedido pedido) {
        double saldoCliente;
        double valorPedido = 0;
        
        saldoCliente = pedido.getCliente().getSaldo();
        
        for (CardapioItem item : pedido.getItensPedido()) {
            valorPedido += item.getValor();
        }
        
        if (valorPedido <= saldoCliente) {
            int numeroPedido;
            numeroPedido = pedidoRN.pesquisar().size() + 1;
            pedido.setNumero(numeroPedido);
            pedidoRN.salvar(pedido);
        }
    }
    
    @WebMethod(operationName = "solicitarPedido")
    public Pedido solicitarPedido() {
        Pedido pedido = pedidoRN.pesquisar().get(0);
        pedidoRN.excluir(pedido);
        MockBancoDados.getInstance().getPedidosAguardando().add(pedido);
        return pedido;
    }
    
    @WebMethod(operationName = "fecharPedido")
    public void fecharPedido(@WebParam(name = "numeroPedido") Integer numeroPedido) {
        Pedido pedido;
        pedido = MockBancoDados.getInstance().getPedidoAguardando(numeroPedido);
        MockBancoDados.getInstance().getPedidosAguardando().remove(pedido);
    }
    
}
