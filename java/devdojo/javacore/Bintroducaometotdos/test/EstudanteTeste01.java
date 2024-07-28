package devdojo.javacore.Bintroducaometotdos.test;

import devdojo.javacore.Bintroducaometotdos.dominio.ClasseTemporaria;
import devdojo.javacore.Bintroducaometotdos.dominio.Estudante;
import devdojo.javacore.Bintroducaometotdos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        ClasseTemporaria classeTemporaria = new ClasseTemporaria();

        estudante.setNome("Goku");
        estudante.setIdade(50);
        estudante.setSexo('m');

        estudante2.setNome("Gamora");
        estudante2.setIdade(32);
        estudante2.setSexo('f');
        
        classeTemporaria.imprime(estudante);
        impressora.imprime(estudante2);


        
        
    }
}
