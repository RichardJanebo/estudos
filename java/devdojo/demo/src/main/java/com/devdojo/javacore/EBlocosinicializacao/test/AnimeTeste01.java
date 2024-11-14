package com.devdojo.javacore.EBlocosinicializacao.test;

import com.devdojo.javacore.EBlocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime =new Anime("one piece");

        for(int episodios : anime.getEpsódios()){
            System.out.println(episodios);
        }
        
    }
}
