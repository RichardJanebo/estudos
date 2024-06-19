package aula15.collections.set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> meusConvidados;

    public ConjuntoConvidados(){
        this.meusConvidados= new HashSet<>();
    }

    public void addConvidados(String nome,int codigoConvite){
        meusConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadosDaListaPorCodConvite(int codigo){
        Convidado convidadosParaRemover = null;
        for(Convidado c:meusConvidados){
            if(c.getCodigo() == codigo){
                convidadosParaRemover = c;
                break;
            }
        }
        meusConvidados.remove(convidadosParaRemover);
    }


    public int contarConvidados(){
        return meusConvidados.size();
    }


    public void exibirConvidados(){
        System.out.println(meusConvidados);
    }



    public static void main(String[] args){
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        
        conjuntoConvidados.addConvidados("Maria", 10);
        conjuntoConvidados.addConvidados("Osvaldo", 20);
        conjuntoConvidados.addConvidados("Josicleia", 23);
        conjuntoConvidados.addConvidados("Clementina", 30);

        conjuntoConvidados.exibirConvidados();

        System.out.println("--------------------------------------------");
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados");

        conjuntoConvidados.removerConvidadosDaListaPorCodConvite(20);
        System.out.println("--------------------------------------------");


        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados");

        conjuntoConvidados.exibirConvidados();


    }

}
