package aula12.apps;

public class FaceboolMenssager  extends ServiçoMensagemInstantanea{
    public void sendMessage() {
        validarConectadoInternet();
        System.out.println("This message are sent via Facebook Menssager");        
    }
  
    public void reciveMessage(){
        System.out.println("This Message are recive via Facebook Menssager");
    }


}
