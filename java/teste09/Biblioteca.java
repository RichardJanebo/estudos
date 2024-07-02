package teste09;
public class Biblioteca implements Livro {
    public void folear(){
        System.out.println("Folenado o livros");
    }
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.folear();        
    }
    
}