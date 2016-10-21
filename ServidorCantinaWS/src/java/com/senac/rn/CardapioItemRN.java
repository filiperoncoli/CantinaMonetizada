package com.senac.rn;

import com.senac.bean.CardapioItem;
import com.senac.crud.CrudGenerico;
import com.senac.dao.CardapioItemDAO;
import java.util.List;

public class CardapioItemRN implements CrudGenerico<CardapioItem> {
    private static CardapioItemDAO dao;

    public CardapioItemRN() {
        dao = new CardapioItemDAO();
    }
    
    @Override
    public CardapioItem consultar(CardapioItem bean) {
        return dao.consultar(bean);
    }

    @Override
    public boolean excluir(CardapioItem bean) {
        return dao.excluir(bean);
    }

    @Override
    public CardapioItem salvar(CardapioItem bean) {
        return dao.salvar(bean);
    }

    @Override
    public CardapioItem alterar(CardapioItem bean) {
        return dao.alterar(bean);
    }

    @Override
    public List<CardapioItem> pesquisar() {
        return dao.pesquisar();
    }
    
}
