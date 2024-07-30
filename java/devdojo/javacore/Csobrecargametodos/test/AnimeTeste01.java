package devdojo.javacore.Bintroducaometotdos.Csobrecargametodos.test;

import devdojo.javacore.Bintroducaometotdos.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudame Drive", "tv", 23);

        anime.init("Akudame Drive", "tv", 23,"Ação");
        anime.setGenero("Ação");
      
        anime.imprimir();
        

    }
}
