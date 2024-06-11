package aula12;

public class Pc {
    public static void main(String[] args){
        FaceboolMenssager faceboolMenssager = new FaceboolMenssager();

        faceboolMenssager.sendMenssage();

        MsnMenssager menssager = new MsnMenssager();

        menssager.sendMessage();

        Telegram telegram = new Telegram();

        telegram.sendMessage();
    }
}
