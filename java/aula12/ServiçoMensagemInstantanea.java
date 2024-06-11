package aula12;

public class ServiçoMensagemInstantanea {
    public void sendMessage(){
        validateInternetConection();
        System.out.println("Sending Menssage");
        saveHistory();
    }

    public void reciveMessage(){
        System.out.println("Sending Message");
    }


    private void validateInternetConection(){
        System.out.println("Validating Internet Connection");
    }


    private void saveHistory(){
        System.out.println("Saving at History of Messager");
    }
}
