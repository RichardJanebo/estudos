package devdojo.javacore.Gassociacao.dominio;

public class Seminarios {
    private String nome;
    private Estudante[] alunos;
    private Local local;

    public Seminarios(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Estudante[] getAlunos() {
        return alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Estudante[] alunos) {
        this.alunos = alunos;
    }

    public Estudante[] getEstudantes() {
        return alunos;
    }

}
