package com.senac.rn;

import com.senac.bean.Pedido;
import com.senac.dao.PedidoAguardandoDAO;

public class PedidoAguardandoRN {
    private static PedidoAguardandoDAO dao;

    public PedidoAguardandoRN() {
        dao = new PedidoAguardandoDAO();
    }
    
    public Pedido consultar(Integer numeroPedido) {
        return dao.consultar(numeroPedido);
    }
    
    public boolean excluir(Pedido pedido) {
        return dao.excluir(pedido);
    }
    
    public Pedido salvar(Pedido pedido) {
        return dao.salvar(pedido);
    }
    
}
