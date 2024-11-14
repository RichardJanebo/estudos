package com.devdojo.javacore.Oexcepition.test;

import java.io.FileNotFoundException;

import com.devdojo.javacore.Oexcepition.dominio.Funcionario;
import com.devdojo.javacore.Oexcepition.dominio.Pessoa;
import com.devdojo.javacore.Oexcepition.exception.LoginInvalidoExcepition;

public class SobreEscritaException {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try{

            funcionario.salvar();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(LoginInvalidoExcepition e){
            e.printStackTrace();
        }
    }
}
