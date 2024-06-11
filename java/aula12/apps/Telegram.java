package aula12.apps;

public class Telegram extends ServiçoMensagemInstantanea {
    public void sendMessage(){
        validarConectadoInternet();
        System.out.println("This message are sent via Telegram");
    }

    public void reciveMessage(){
        System.out.println("This menssage are recive via Telegram");
    }
    
}
