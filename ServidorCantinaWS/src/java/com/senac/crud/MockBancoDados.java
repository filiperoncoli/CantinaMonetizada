package com.senac.crud;

import com.senac.bean.CardapioItem;
import com.senac.bean.Cliente;
import com.senac.bean.Pedido;
import java.util.ArrayList;
import java.util.List;

public class MockBancoDados {
    private static List<Cliente> clientes;
    private static List<CardapioItem> cardapio;
    private static List<Pedido> pedidos;
    private static List<Pedido> pedidosAguardando;

    private MockBancoDados() {
        clientes = new ArrayList<>();
        cardapio = new ArrayList<>();
        pedidos = new ArrayList<>();
        pedidosAguardando = new ArrayList<>();
        
        Cliente c = new Cliente(631420069, "P1234", "Filipe", 20.00);
        clientes.add(c);
        
        CardapioItem ci1 = new CardapioItem(1, "Filé com Fritas", 17.90);
        CardapioItem ci2 = new CardapioItem(2, "Ala Minuta", 15.90);
        CardapioItem ci3 = new CardapioItem(3, "Xis-Salada", 14.90);
        cardapio.add(ci1);
        cardapio.add(ci2);
        cardapio.add(ci3);
    }
    
    public static MockBancoDados getInstance() {
        return MockBancoDadosHolder.INSTANCE;
    }
    
    private static class MockBancoDadosHolder {
        private static final MockBancoDados INSTANCE = new MockBancoDados();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public Cliente getCliente(Integer pk) {
        for (Cliente cliente : clientes) {
            if (cliente.getMatricula().equals(pk)) {
                return cliente;
            }
        }
        return null;
    }
    
    public List<CardapioItem> getCardapio() {
        return cardapio;
    }
    
    public CardapioItem getCardapioItem(Integer pk) {
        for (CardapioItem item : cardapio) {
            if (item.getCodigo().equals(pk)) {
                return item;
            }
        }
        return null;
    }
    
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    
    public Pedido getPedido(Integer pk) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumero().equals(pk)) {
                return pedido;
            }
        }
        return null;
    }

    public List<Pedido> getPedidosAguardando() {
        return pedidosAguardando;
    }
    
    public Pedido getPedidoAguardando(Integer pk) {
        for (Pedido pedido : pedidosAguardando) {
            if (pedido.getNumero().equals(pk)) {
                return pedido;
            }
        }
        return null;
    }

}
