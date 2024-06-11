package aula12;

public class MsnMenssager {
    public void sendMessage(){
        validateInternetConection();
        System.out.println("Sending Message via Msn Menssager");
        saveHistory();
    }

    public void validateMenssage(){
        System.out.println("Validating message");
    }

    public void validateInternetConection(){
        System.out.println("Validating connection with internet");
    }

    public void saveHistory(){
        System.out.println("Saving at history message");
    }
}
