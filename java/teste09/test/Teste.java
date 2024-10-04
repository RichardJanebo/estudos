package teste09.test;

import teste09.dominio.InterfaceTeste01;

public class Teste implements InterfaceTeste01 {

    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.returnHelloWord();

        
    }

    public void metodo(){
        System.out.println("Dentro do metodo da interface");
    }
}