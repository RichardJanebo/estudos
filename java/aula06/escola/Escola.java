package aula06.escola;

public class Escola {
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.setIdade(10);
        aluno.setNome("Raul");
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getnome());
    }
    
}