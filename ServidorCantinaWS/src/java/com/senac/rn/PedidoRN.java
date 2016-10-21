package com.senac.rn;

import com.senac.bean.Pedido;
import com.senac.crud.CrudGenerico;
import com.senac.dao.PedidoDAO;
import java.util.List;

public class PedidoRN implements CrudGenerico<Pedido> {
    private static PedidoDAO dao;

    public PedidoRN() {
        dao = new PedidoDAO();
    }
    
    @Override
    public Pedido consultar(Pedido bean) {
        return dao.consultar(bean);
    }

    @Override
    public boolean excluir(Pedido bean) {
        return dao.excluir(bean);
    }

    @Override
    public Pedido salvar(Pedido bean) {
        return dao.salvar(bean);
    }

    @Override
    public Pedido alterar(Pedido bean) {
        return dao.alterar(bean);
    }

    @Override
    public List<Pedido> pesquisar() {
        return dao.pesquisar();
    }
    
}
