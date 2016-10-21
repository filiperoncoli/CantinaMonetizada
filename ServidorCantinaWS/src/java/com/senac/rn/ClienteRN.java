package com.senac.rn;

import com.senac.bean.Cliente;
import com.senac.crud.CrudGenerico;
import com.senac.dao.ClienteDAO;
import java.util.List;

public class ClienteRN implements CrudGenerico<Cliente> {
    private static ClienteDAO dao;

    public ClienteRN() {
        dao = new ClienteDAO();
    }

    @Override
    public Cliente consultar(Cliente bean) {
        return dao.consultar(bean);
    }

    @Override
    public boolean excluir(Cliente bean) {
        return dao.excluir(bean);
    }

    @Override
    public Cliente salvar(Cliente bean) {
        return dao.salvar(bean);
    }

    @Override
    public Cliente alterar(Cliente bean) {
        return dao.alterar(bean);
    }

    @Override
    public List<Cliente> pesquisar() {
        return dao.pesquisar();
    }
    
}
