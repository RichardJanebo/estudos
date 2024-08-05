package devdojo.javacore.Gassociacao.test;

import devdojo.javacore.Gassociacao.dominio.Estudante;
import devdojo.javacore.Gassociacao.dominio.Local;
import devdojo.javacore.Gassociacao.dominio.Professor;
import devdojo.javacore.Gassociacao.dominio.Seminarios;

public class SeminarioTeste {
    public static void main(String[] args) {
        Local local = new Local("Patio central");
        Estudante estudante = new Estudante("Edmundo");
        Estudante estudante2 = new Estudante("Sergin");
        Seminarios seminario = new Seminarios("Biologia");
        Professor professor = new Professor("Paulão da mecanica", "Biologo");

        estudante.setSeminario(seminario);

        seminario.setAlunos(new Estudante[] { estudante, estudante2 });

        professor.setSeminarios(new Seminarios[] { seminario });

        seminario.setLocal(local);

        professor.imprimir();

    }
}
