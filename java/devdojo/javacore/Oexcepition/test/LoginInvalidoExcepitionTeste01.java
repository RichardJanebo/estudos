package devdojo.javacore.Oexcepition.test;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

import devdojo.javacore.Oexcepition.exception.LoginInvalidoExcepition;

public class LoginInvalidoExcepitionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        }catch(LoginInvalidoExcepition e){
            e.printStackTrace();
        }
        
    }

    public static void logar() throws LoginInvalidoExcepition {
        Scanner teclado = new Scanner(System.in);
        String userName = "Goku";
        String senhaDB = "Ssj";
        System.out.println("Usuario");
        String nomeDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        teclado.close();

        if(!userName.equals(nomeDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoExcepition("Usuario ou senha invalidas");
        }

        System.out.println("Usuario Logado com sucesso");

        


    }
}
