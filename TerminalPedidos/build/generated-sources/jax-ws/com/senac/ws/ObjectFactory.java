
package com.senac.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.senac.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SolicitarPedidoResponse_QNAME = new QName("http://ws.senac.com/", "solicitarPedidoResponse");
    private final static QName _EnviarPedidoResponse_QNAME = new QName("http://ws.senac.com/", "enviarPedidoResponse");
    private final static QName _BuscarDadosClienteResponse_QNAME = new QName("http://ws.senac.com/", "buscarDadosClienteResponse");
    private final static QName _FecharPedidoResponse_QNAME = new QName("http://ws.senac.com/", "fecharPedidoResponse");
    private final static QName _SolicitarPedido_QNAME = new QName("http://ws.senac.com/", "solicitarPedido");
    private final static QName _EnviarPedido_QNAME = new QName("http://ws.senac.com/", "enviarPedido");
    private final static QName _BuscarFilaPedidos_QNAME = new QName("http://ws.senac.com/", "buscarFilaPedidos");
    private final static QName _BuscarFilaPedidosResponse_QNAME = new QName("http://ws.senac.com/", "buscarFilaPedidosResponse");
    private final static QName _AutenticarClienteResponse_QNAME = new QName("http://ws.senac.com/", "autenticarClienteResponse");
    private final static QName _BuscarDadosCliente_QNAME = new QName("http://ws.senac.com/", "buscarDadosCliente");
    private final static QName _AutenticarCliente_QNAME = new QName("http://ws.senac.com/", "autenticarCliente");
    private final static QName _FecharPedido_QNAME = new QName("http://ws.senac.com/", "fecharPedido");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.senac.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarDadosClienteResponse }
     * 
     */
    public BuscarDadosClienteResponse createBuscarDadosClienteResponse() {
        return new BuscarDadosClienteResponse();
    }

    /**
     * Create an instance of {@link FecharPedidoResponse }
     * 
     */
    public FecharPedidoResponse createFecharPedidoResponse() {
        return new FecharPedidoResponse();
    }

    /**
     * Create an instance of {@link SolicitarPedido }
     * 
     */
    public SolicitarPedido createSolicitarPedido() {
        return new SolicitarPedido();
    }

    /**
     * Create an instance of {@link EnviarPedido }
     * 
     */
    public EnviarPedido createEnviarPedido() {
        return new EnviarPedido();
    }

    /**
     * Create an instance of {@link SolicitarPedidoResponse }
     * 
     */
    public SolicitarPedidoResponse createSolicitarPedidoResponse() {
        return new SolicitarPedidoResponse();
    }

    /**
     * Create an instance of {@link EnviarPedidoResponse }
     * 
     */
    public EnviarPedidoResponse createEnviarPedidoResponse() {
        return new EnviarPedidoResponse();
    }

    /**
     * Create an instance of {@link AutenticarCliente }
     * 
     */
    public AutenticarCliente createAutenticarCliente() {
        return new AutenticarCliente();
    }

    /**
     * Create an instance of {@link FecharPedido }
     * 
     */
    public FecharPedido createFecharPedido() {
        return new FecharPedido();
    }

    /**
     * Create an instance of {@link BuscarFilaPedidos }
     * 
     */
    public BuscarFilaPedidos createBuscarFilaPedidos() {
        return new BuscarFilaPedidos();
    }

    /**
     * Create an instance of {@link BuscarFilaPedidosResponse }
     * 
     */
    public BuscarFilaPedidosResponse createBuscarFilaPedidosResponse() {
        return new BuscarFilaPedidosResponse();
    }

    /**
     * Create an instance of {@link AutenticarClienteResponse }
     * 
     */
    public AutenticarClienteResponse createAutenticarClienteResponse() {
        return new AutenticarClienteResponse();
    }

    /**
     * Create an instance of {@link BuscarDadosCliente }
     * 
     */
    public BuscarDadosCliente createBuscarDadosCliente() {
        return new BuscarDadosCliente();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link CardapioItem }
     * 
     */
    public CardapioItem createCardapioItem() {
        return new CardapioItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "solicitarPedidoResponse")
    public JAXBElement<SolicitarPedidoResponse> createSolicitarPedidoResponse(SolicitarPedidoResponse value) {
        return new JAXBElement<SolicitarPedidoResponse>(_SolicitarPedidoResponse_QNAME, SolicitarPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "enviarPedidoResponse")
    public JAXBElement<EnviarPedidoResponse> createEnviarPedidoResponse(EnviarPedidoResponse value) {
        return new JAXBElement<EnviarPedidoResponse>(_EnviarPedidoResponse_QNAME, EnviarPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDadosClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "buscarDadosClienteResponse")
    public JAXBElement<BuscarDadosClienteResponse> createBuscarDadosClienteResponse(BuscarDadosClienteResponse value) {
        return new JAXBElement<BuscarDadosClienteResponse>(_BuscarDadosClienteResponse_QNAME, BuscarDadosClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FecharPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "fecharPedidoResponse")
    public JAXBElement<FecharPedidoResponse> createFecharPedidoResponse(FecharPedidoResponse value) {
        return new JAXBElement<FecharPedidoResponse>(_FecharPedidoResponse_QNAME, FecharPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "solicitarPedido")
    public JAXBElement<SolicitarPedido> createSolicitarPedido(SolicitarPedido value) {
        return new JAXBElement<SolicitarPedido>(_SolicitarPedido_QNAME, SolicitarPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "enviarPedido")
    public JAXBElement<EnviarPedido> createEnviarPedido(EnviarPedido value) {
        return new JAXBElement<EnviarPedido>(_EnviarPedido_QNAME, EnviarPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFilaPedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "buscarFilaPedidos")
    public JAXBElement<BuscarFilaPedidos> createBuscarFilaPedidos(BuscarFilaPedidos value) {
        return new JAXBElement<BuscarFilaPedidos>(_BuscarFilaPedidos_QNAME, BuscarFilaPedidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFilaPedidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "buscarFilaPedidosResponse")
    public JAXBElement<BuscarFilaPedidosResponse> createBuscarFilaPedidosResponse(BuscarFilaPedidosResponse value) {
        return new JAXBElement<BuscarFilaPedidosResponse>(_BuscarFilaPedidosResponse_QNAME, BuscarFilaPedidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "autenticarClienteResponse")
    public JAXBElement<AutenticarClienteResponse> createAutenticarClienteResponse(AutenticarClienteResponse value) {
        return new JAXBElement<AutenticarClienteResponse>(_AutenticarClienteResponse_QNAME, AutenticarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDadosCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "buscarDadosCliente")
    public JAXBElement<BuscarDadosCliente> createBuscarDadosCliente(BuscarDadosCliente value) {
        return new JAXBElement<BuscarDadosCliente>(_BuscarDadosCliente_QNAME, BuscarDadosCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "autenticarCliente")
    public JAXBElement<AutenticarCliente> createAutenticarCliente(AutenticarCliente value) {
        return new JAXBElement<AutenticarCliente>(_AutenticarCliente_QNAME, AutenticarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FecharPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.senac.com/", name = "fecharPedido")
    public JAXBElement<FecharPedido> createFecharPedido(FecharPedido value) {
        return new JAXBElement<FecharPedido>(_FecharPedido_QNAME, FecharPedido.class, null, value);
    }

}
