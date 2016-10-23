package com.senac.crud;

public class RNException extends RuntimeException {
    private Tipo tipo;

    public RNException(Tipo tipo) {
        super(tipo.toString());
        this.tipo = tipo;
    }
    
    public RNException(Tipo tipo, String message) {
        super(message);
        this.tipo = tipo;
    }

    public RNException(Tipo tipo, String message, Throwable cause) {
        super(message, cause);
        this.tipo = tipo;
    }

    public RNException(Tipo tipo, Throwable cause) {
        super(cause);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public enum Tipo {
        MATRICULA_SENHA_INCORRETO("Matrícula e/ou senha incorretos."),
        CLIENTE_INEXISTENTE("Cliente inexistente."),
        SALDO_INSUFICIENTE("Saldo insuficiente."),
        NAO_HA_PEDIDOS("Não há pedidos na fila."),
        PEDIDO_NAO_FECHADO("Não foi possível fechar o pedido");
        
        private String value;
        
        private Tipo(String mensagem) {
            this.value = mensagem;
        }
        
        @Override        
        public String toString() {
            return this.value;
        }
    }
}
