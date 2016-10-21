package com.senac.dao;

import com.senac.bean.Pedido;
import com.senac.crud.CrudGenerico;
import com.senac.crud.MockBancoDados;
import java.util.List;

public class PedidoDAO implements CrudGenerico<Pedido> {

    @Override
    public Pedido consultar(Pedido bean) {
        return MockBancoDados.getInstance().getPedido(bean.getNumero());
    }

    @Override
    public boolean excluir(Pedido bean) {
        return MockBancoDados.getInstance().getPedidos().remove(bean);
    }

    @Override
    public Pedido salvar(Pedido bean) {
        MockBancoDados.getInstance().getPedidos().add(bean);
        return bean;
    }

    @Override
    public Pedido alterar(Pedido bean) {
        excluir(bean);
        return salvar(bean);
    }

    @Override
    public List<Pedido> pesquisar() {
        return MockBancoDados.getInstance().getPedidos();
    }
    
}
