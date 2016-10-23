package com.senac.dao;

import com.senac.bean.Pedido;
import com.senac.crud.MockBancoDados;

public class PedidoAguardandoDAO {
    
    public Pedido consultar(Integer numeroPedido) {
        return MockBancoDados.getInstance().getPedidoAguardando(numeroPedido);
    }
    
    public boolean excluir(Pedido pedido) {
        return MockBancoDados.getInstance().getPedidosAguardando().remove(pedido);
    }
    
    public Pedido salvar(Pedido pedido) {
        MockBancoDados.getInstance().getPedidosAguardando().add(pedido);
        return pedido;
    }
    
}
