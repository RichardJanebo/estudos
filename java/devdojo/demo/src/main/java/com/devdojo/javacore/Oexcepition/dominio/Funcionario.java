package com.devdojo.javacore.Oexcepition.dominio;

import java.io.FileNotFoundException;

import com.devdojo.javacore.Oexcepition.exception.LoginInvalidoExcepition;

public class Funcionario extends Pessoa {
    public void salvar() throws FileNotFoundException, LoginInvalidoExcepition{
        System.out.println("Salvando Funcionario");
    }
}
