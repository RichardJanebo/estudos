package aula11.msnMensager;

public class MsnMenssager {
    private void validarConectadoInternet(){
        System.out.println("VALIDANDO SE ESTA CONECTADO A INTERNET");
    }

    public void receberMensagem(){
        System.out.println("RECEBENDO MENSAGEM");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("SALVANDO NO HISTORICO DE MENSAGENS");
    }
    
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM");
        salvarHistoricoMensagem();
    }
}
