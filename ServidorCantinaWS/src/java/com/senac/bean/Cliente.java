package com.senac.bean;

import java.util.Objects;

public class Cliente {
    private Integer matricula;
    private String senha;
    private String nome;
    private double saldo;

    public Cliente() {
    }

    public Cliente(Integer matricula, String senha, String nome, double saldo) {
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.matricula);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "matricula=" + matricula + ", senha=" + senha + ", saldo=" + saldo + '}';
    }
    
}
