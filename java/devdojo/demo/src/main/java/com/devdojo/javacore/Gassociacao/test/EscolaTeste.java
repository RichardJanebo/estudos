package com.devdojo.javacore.Gassociacao.test;

import com.devdojo.javacore.Gassociacao.dominio.Escola;
import com.devdojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Tsunade");

       Professor [] professores = {professor1,professor2};
        

        Escola escola = new Escola("Konoha",new Professor[]{professor1,professor2});

        escola.imprimir();

    }
}
