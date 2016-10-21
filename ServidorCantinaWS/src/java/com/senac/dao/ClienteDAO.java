package com.senac.dao;

import com.senac.bean.Cliente;
import com.senac.crud.CrudGenerico;
import com.senac.crud.MockBancoDados;
import java.util.List;

public class ClienteDAO implements CrudGenerico<Cliente> {

    @Override
    public Cliente consultar(Cliente bean) {
        return MockBancoDados.getInstance().getCliente(bean.getMatricula());
    }

    @Override
    public boolean excluir(Cliente bean) {
        return MockBancoDados.getInstance().getClientes().remove(bean);
    }

    @Override
    public Cliente salvar(Cliente bean) {
        MockBancoDados.getInstance().getClientes().add(bean);
        return bean;
    }

    @Override
    public Cliente alterar(Cliente bean) {
        excluir(bean);
        return salvar(bean);
    }

    @Override
    public List<Cliente> pesquisar() {
        return MockBancoDados.getInstance().getClientes();
    }
    
}
