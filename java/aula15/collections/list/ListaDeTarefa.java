package aula15.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefa {
    private List<Tarefas> tarefaList;

    public ListaDeTarefa(){
        this.tarefaList = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefas(descricao));
    }

    

    public void removerTarefas(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t:tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }


    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }


    public void obterDescricaoDeListasDeTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaDeTarefa listaDeTarefa = new ListaDeTarefa();

        listaDeTarefa.adicionarTarefa("Tarefa 1");
        listaDeTarefa.adicionarTarefa("Tarefa 1");

        listaDeTarefa.obterDescricaoDeListasDeTarefas();

        listaDeTarefa.removerTarefas("Tarefa 1");

        System.out.println(listaDeTarefa.obterNumeroTotalDeTarefas());

    }
}
