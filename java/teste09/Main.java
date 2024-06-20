package teste09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    List<Produto> meusProdutos;

    public Main(){
        meusProdutos = new ArrayList<>();
    }

    public void addProdutos(String nome, int codigo){
        meusProdutos.add(new Produto(nome, codigo));
    }

    public List<Produto> ordenarPorCodigo(){
        List<Produto> produtosOdenados = new ArrayList<>(meusProdutos);
        Collections.sort(produtosOdenados);
        return produtosOdenados;
    }

    public List<Produto> ComparadorPornome(){
        List<Produto> produtosOdenados = new ArrayList<>(meusProdutos);
        Collections.sort(produtosOdenados,new ComparadorPornome());
        return produtosOdenados;
    }
 


    public static void main(String[] args) {
        Main main = new Main();

        main.addProdutos("Bombril", 2);
        main.addProdutos("Amaciante", 1);


        System.out.println(main.ordenarPorCodigo());
    }
     
}