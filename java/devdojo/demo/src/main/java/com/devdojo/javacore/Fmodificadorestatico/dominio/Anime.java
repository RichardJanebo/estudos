package com.devdojo.javacore.Fmodificadorestatico.dominio;




public class Anime {
    private String nome;
    private static int [] episodios;

    static{
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
       

        for(int i:Anime.episodios){
            System.out.print(i);
        }
        
        
    }

    public String getNome(){
        return nome;
    }
    public int[] getEpsódios(){
        return episodios;
    }
}
