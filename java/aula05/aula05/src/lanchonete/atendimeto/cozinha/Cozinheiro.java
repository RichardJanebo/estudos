package lanchonete.atendimeto.cozinha;

import lanchonete.atendimeto.Garçom;

public class Cozinheiro {
    String nome ;
    int idade ;

    public void cozinheiro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    
    public void adicionarLancheNoBalcao(){
        System.out.println("LANCHE ADICIONADO NO BALCÃO");
    }

    public void adicionarSucoNoBAlcao(){
        System.out.println("SUCO ADICIONADO NO BALCÃO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBAlcao();
    }

    private void prepararLanche(){
        System.out.println("LANCHE PREPARADO");
    }

    private void prepararVitamina(){
        System.out.println("VITAMINA PREPARADA");
    }

    private void prepararComboVitLanc(){
        prepararLanche();
        prepararVitamina();
    }

    

    void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();

    }
    
}
