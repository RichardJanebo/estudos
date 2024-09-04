package teste09.dominio;

public class RevisãoSoma {
    public void soma(int [] n){
        int soma = 0;
        for(int i = 0; i < n.length -1; soma +=n[i]){
            i++;
        }
        System.out.println( soma);
    }
}
