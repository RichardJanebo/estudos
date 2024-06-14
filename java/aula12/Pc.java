package aula12;

import aula12.apps.FaceboolMenssager;
import aula12.apps.MsnMenssager;
import aula12.apps.ServiçoMensagemInstantanea;
import aula12.apps.Telegram;

public class Pc {
    public static void main(String[] args){
        ServiçoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")){
            smi = new MsnMenssager();
        }else if(appEscolhido.equals("fbm")){
            smi = new FaceboolMenssager();
        }else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.sendMessage();
        smi.reciveMessage();
    }
}
