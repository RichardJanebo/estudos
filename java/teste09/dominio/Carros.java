package teste09.dominio;

public class Carros {
    private String nome;
    private String marca;
    private int portas;

    public void init(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public void init(String nome, String marca,int portas ){
        this.init(nome, marca);
        this.portas = portas;
    }

    public void somar(int... numeros){
        int soma = 0;
        for(int i: numeros){
            soma += i;
        }
        System.out.println(soma);
    }

    public void imprimir(){
        System.out.println(nome);
        System.out.println(marca);
    }

}
