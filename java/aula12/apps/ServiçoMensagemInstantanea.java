package aula12.apps;

public abstract class ServiçoMensagemInstantanea {
    public abstract void sendMessage();
    public abstract void reciveMessage();

    protected void validarConectadoInternet(){
        System.out.println("Validating internet connection");
    }
}
