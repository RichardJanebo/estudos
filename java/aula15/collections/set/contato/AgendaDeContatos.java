package aula15.collections.set.contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    private Set<Contato> contatosSet;

    public AgendaDeContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }

        }
        return contatosPorNome;

    }

    public Contato atualizarContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(numero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();

        agendaDeContatos.addContato("João", 357);
        agendaDeContatos.addContato("Nascimento", 478);
        agendaDeContatos.addContato("Danilo", 460);


        agendaDeContatos.exibirContatos();
        System.out.println("-------------------------------------------");
        System.out.println(agendaDeContatos.pesquisarPorNome("João"));

        System.out.println(agendaDeContatos.atualizarContato("Danilo", 300));

        agendaDeContatos.exibirContatos();
    }

}