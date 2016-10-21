package com.senac.crud;

import java.util.List;

public interface CrudGenerico<T> {
    
    T consultar(T bean);

    boolean excluir(T bean);
    
    T salvar(T bean);    

    T alterar(T bean);
    
    List<T> pesquisar();
    
}
