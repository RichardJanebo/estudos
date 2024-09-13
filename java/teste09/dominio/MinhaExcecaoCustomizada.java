package teste09.dominio;

public class MinhaExcecaoCustomizada extends RuntimeException {
     public MinhaExcecaoCustomizada(){
        super("Voce caiu na minha execepition");
     }
}
