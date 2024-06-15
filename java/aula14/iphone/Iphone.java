package aula14.iphone;

import aula14.BreakThroughInternetCommunicator.BreakThroughInternetCommunicator;
import aula14.ipod.Ipod;
import aula14.phone.Phone;

public class Iphone implements Phone, Ipod, BreakThroughInternetCommunicator {
    public void onCall() {
        System.out.println("calling");
    }

    public void offCall() {
        System.out.println("turning off");
    }

    public void startVoicemail() {
        System.out.println("starting voicemail");
    }

    public void play() {
        System.out.println("playng");
    }

    public void pause() {
        System.out.println("pausing");
    }

    public void selectMusic() {
        System.out.println("selecting");
    }

    public void showPage() {
        System.out.println("Showing page");
    }

    public void addNewTab() {
        System.out.println("adding page");
    }

    public void updateTab() {
        System.out.println("updating page");
    }
}