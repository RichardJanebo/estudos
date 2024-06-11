package aula12.apps;

public class MsnMenssager extends ServiçoMensagemInstantanea {
   public void sendMessage() {
       validarConectadoInternet();
       System.out.println("This message are sent via MSN menssager");
       
   }

   public void reciveMessage(){
        System.out.println("This message are recive via MSN Menssager");
   }
}
