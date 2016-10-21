package com.senac.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {
    private Integer numero;
    private Cliente cliente;
    private List<CardapioItem> itensPedido;

    public Pedido() {
        this.itensPedido = new ArrayList<>();
    }

    public Pedido(Integer numero, List<CardapioItem> itensPedido) {
        this.numero = numero;
        this.itensPedido = itensPedido;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<CardapioItem> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<CardapioItem> itensPedido) {
        this.itensPedido = itensPedido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + '}';
    }
    
}
