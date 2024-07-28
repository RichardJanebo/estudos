package devdojo.javacore.Bintroducaometotdos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        estudante.setNome("Gohan");
        System.out.println("----------------");
        System.out.println("| Idade: " + estudante.getIdade() + "    |");
        System.out.println("| Nome: " + estudante.getNome() + "   |");
        System.out.println("| Sexo: " + estudante.getSexo() + "      |");
        System.out.println("----------------");
    }
}
