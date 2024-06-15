package aula14;

import aula14.iphone.Iphone;

public class User {
    public static void main(String[] args){
        Iphone iphone = new Iphone();

        iphone.onCall();
        iphone.offCall();
        iphone.startVoicemail();

        iphone.play();
        iphone.pause();
        iphone.selectMusic();

        iphone.showPage();
        iphone.addNewTab();
        iphone.updateTab();
    }
}
