package aula12;

public class FaceboolMenssager {
    public void sendMenssage(){
        validateMenssage();
        System.out.println("sending menssage via facebook menssager");
        saveHistory();
    }
    public void saveHistory(){
        System.out.println("Saving to history menssage");
    }
    public void validateMenssage(){
        System.out.println("Validating message");
    }
    public void reciveMessage(){
        System.out.println("Reciving messages");
    }


}
