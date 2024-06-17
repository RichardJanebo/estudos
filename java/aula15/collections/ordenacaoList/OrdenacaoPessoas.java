package aula15.collections.ordenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> cadastro;

    public OrdenacaoPessoas(){
        this.cadastro = new ArrayList<>();
    }

    public void addPessoas(String nome,int idade,double altura){
        cadastro.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(cadastro);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public List<Pessoa> ordenarPorAutura(){
        List<Pessoa> pessoaAutura = new ArrayList<>(cadastro);
        Collections.sort(pessoaAutura,new ComparatorPorAltura());
        return pessoaAutura;
    }

    
    public static void main(String[] args) {
        OrdenacaoPessoas pessoa = new OrdenacaoPessoas();
        pessoa.addPessoas("Xaulim Matador de pordco ", 15, 1.70);
        pessoa.addPessoas("Pedrin do chinelo virado", 13, 1.50);
        pessoa.addPessoas("Jão catarrento", 17, 1.76);

        System.out.println(pessoa.ordenadoPorIdade());
        System.out.println("------------------------------");
        System.out.println(pessoa.ordenarPorAutura());

    }
}
