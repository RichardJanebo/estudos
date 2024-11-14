package com.devdojo.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminarios[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }

    public void imprimir() {
        System.out.println("-----------");
        System.out.println("Professor: " + nome);
        if (seminarios == null)
            return;
        System.out.println("Seminarios Cadastrados");
        for (Seminarios seminario : seminarios) {
            System.out.println("Nome do seminario " + seminario.getNome());
            System.out.println("Endereço " + seminario.getLocal().getEndereço());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0)
                continue;

            System.out.println("*** Alunos ***");
            for (Estudante estudante : seminario.getAlunos()) {
                System.out.println("Estudantes " + estudante.getNome());
            }
            System.out.println("*** -- FIM DO PROGRAMA -- ***");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
