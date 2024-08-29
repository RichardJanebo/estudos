package teste09.dominio;

public class LoginValidation extends Exception {
    public LoginValidation(){
        super("Login invalido");
    }
    public LoginValidation(String txt){
        super(txt);
    }
    
}
