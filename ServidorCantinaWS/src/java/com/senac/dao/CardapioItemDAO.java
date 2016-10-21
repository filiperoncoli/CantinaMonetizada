package com.senac.dao;

import com.senac.bean.CardapioItem;
import com.senac.crud.CrudGenerico;
import com.senac.crud.MockBancoDados;
import java.util.List;

public class CardapioItemDAO implements CrudGenerico<CardapioItem>{

    @Override
    public CardapioItem consultar(CardapioItem bean) {
        return MockBancoDados.getInstance().getCardapioItem(bean.getCodigo());
    }

    @Override
    public boolean excluir(CardapioItem bean) {
        return MockBancoDados.getInstance().getCardapio().remove(bean);
    }

    @Override
    public CardapioItem salvar(CardapioItem bean) {
        MockBancoDados.getInstance().getCardapio().add(bean);
        return bean;
    }

    @Override
    public CardapioItem alterar(CardapioItem bean) {
        excluir(bean);
        return salvar(bean);
    }

    @Override
    public List<CardapioItem> pesquisar() {
        return MockBancoDados.getInstance().getCardapio();
    }
    
}
