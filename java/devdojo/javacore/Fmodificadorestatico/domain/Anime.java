package devdojo.javacore.Fmodificadorestatico.domain;




public class Anime {
    private String nome;
    private int [] episodios;

    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];

        for(int i = 0; i < episodios.length;i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];

        for(int i = 0; i < episodios.length;i++){
            episodios[i] = i+1;
            System.out.print(episodios[i]);
        }
        
        System.out.println();
        
    }

    public String getNome(){
        return nome;
    }
    public int[] getEpsódios(){
        return episodios;
    }
}
