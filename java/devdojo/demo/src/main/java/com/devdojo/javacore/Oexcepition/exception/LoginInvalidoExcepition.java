package com.devdojo.javacore.Oexcepition.exception;

public class LoginInvalidoExcepition extends Exception{
    public LoginInvalidoExcepition(){
        super("Login invalido");
    }

    public LoginInvalidoExcepition(String message){
        super(message);

    }
}
