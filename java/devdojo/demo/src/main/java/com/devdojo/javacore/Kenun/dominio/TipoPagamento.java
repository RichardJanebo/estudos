package com.devdojo.javacore.Kenun.dominio;

public enum TipoPagamento {
    CREDITO {

        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }

    },
    DEBITO {

        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }

    };

    public abstract double calcularDesconto(double valor);

}
