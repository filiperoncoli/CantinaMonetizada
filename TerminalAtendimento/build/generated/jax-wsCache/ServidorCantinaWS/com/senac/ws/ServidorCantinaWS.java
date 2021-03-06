
package com.senac.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServidorCantinaWS", targetNamespace = "http://ws.senac.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServidorCantinaWS {


    /**
     * 
     * @param senha
     * @param matricula
     * @return
     *     returns java.util.List<com.senac.ws.CardapioItem>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "autenticarCliente", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.AutenticarCliente")
    @ResponseWrapper(localName = "autenticarClienteResponse", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.AutenticarClienteResponse")
    @Action(input = "http://ws.senac.com/ServidorCantinaWS/autenticarClienteRequest", output = "http://ws.senac.com/ServidorCantinaWS/autenticarClienteResponse")
    public List<CardapioItem> autenticarCliente(
        @WebParam(name = "matricula", targetNamespace = "")
        Integer matricula,
        @WebParam(name = "senha", targetNamespace = "")
        String senha);

    /**
     * 
     * @param cliente
     * @return
     *     returns com.senac.ws.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarDadosCliente", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.BuscarDadosCliente")
    @ResponseWrapper(localName = "buscarDadosClienteResponse", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.BuscarDadosClienteResponse")
    @Action(input = "http://ws.senac.com/ServidorCantinaWS/buscarDadosClienteRequest", output = "http://ws.senac.com/ServidorCantinaWS/buscarDadosClienteResponse")
    public Cliente buscarDadosCliente(
        @WebParam(name = "cliente", targetNamespace = "")
        Cliente cliente);

    /**
     * 
     * @return
     *     returns java.util.List<com.senac.ws.Pedido>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarFilaPedidos", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.BuscarFilaPedidos")
    @ResponseWrapper(localName = "buscarFilaPedidosResponse", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.BuscarFilaPedidosResponse")
    @Action(input = "http://ws.senac.com/ServidorCantinaWS/buscarFilaPedidosRequest", output = "http://ws.senac.com/ServidorCantinaWS/buscarFilaPedidosResponse")
    public List<Pedido> buscarFilaPedidos();

    /**
     * 
     * @return
     *     returns com.senac.ws.Pedido
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solicitarPedido", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.SolicitarPedido")
    @ResponseWrapper(localName = "solicitarPedidoResponse", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.SolicitarPedidoResponse")
    @Action(input = "http://ws.senac.com/ServidorCantinaWS/solicitarPedidoRequest", output = "http://ws.senac.com/ServidorCantinaWS/solicitarPedidoResponse")
    public Pedido solicitarPedido();

    /**
     * 
     * @param pedido
     */
    @WebMethod
    @RequestWrapper(localName = "enviarPedido", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.EnviarPedido")
    @ResponseWrapper(localName = "enviarPedidoResponse", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.EnviarPedidoResponse")
    @Action(input = "http://ws.senac.com/ServidorCantinaWS/enviarPedidoRequest", output = "http://ws.senac.com/ServidorCantinaWS/enviarPedidoResponse")
    public void enviarPedido(
        @WebParam(name = "pedido", targetNamespace = "")
        Pedido pedido);

    /**
     * 
     * @param numeroPedido
     */
    @WebMethod
    @RequestWrapper(localName = "fecharPedido", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.FecharPedido")
    @ResponseWrapper(localName = "fecharPedidoResponse", targetNamespace = "http://ws.senac.com/", className = "com.senac.ws.FecharPedidoResponse")
    @Action(input = "http://ws.senac.com/ServidorCantinaWS/fecharPedidoRequest", output = "http://ws.senac.com/ServidorCantinaWS/fecharPedidoResponse")
    public void fecharPedido(
        @WebParam(name = "numeroPedido", targetNamespace = "")
        Integer numeroPedido);

}
