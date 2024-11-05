package teste09.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import teste09.dominio.Conta;

public class Teste {

    public static void main(String[] args) {
        Conta conta01 = new Conta("Osvaldo", 1000, "SP");
        Conta conta02 = new Conta("Mariana", 2000, "RJ");
        Conta conta03 = new Conta("Carlos", 3000, "MG");
        Conta conta04 = new Conta("Beatriz", 4000, "SP");
        Conta conta05 = new Conta("Fernando", 5000, "RJ");
        Conta conta06 = new Conta("Ana", 6000, "MG");
        Conta conta07 = new Conta("João", 7000, "SP");
        Conta conta08 = new Conta("Clara", 8000, "RJ");
        Conta conta09 = new Conta("Paulo", 9000, "MG");
        Conta conta10 = new Conta("Sofia", 10000, "SP");

        List<Conta> contas = new ArrayList<>(
                List.of(conta01, conta02, conta03, conta04, conta05, conta06, conta07, conta08, conta09, conta10));

        List<String> nomes = new ArrayList<>(List.of("sdgfadgfhjkashdfvs"));

        Map<String,List<Conta>> dados = contas.stream()
            .collect(Collectors.groupingBy(Conta::getEstado));

        for(Map.Entry<String,List<Conta>>  entry : dados.entrySet()){
            String estado = entry.getKey();
            List<Conta> contasEstados = entry.getValue();

            System.out.println("Estado: " + estado);
            for(Conta conta : contasEstados){
                System.out.println("Nome: " + conta.getProprientario() + " Sado: " + conta.getSaldo());
            }
        }

        Long teste = nomes.stream()
        .mapToLong(e -> e.chars()
                    .filter(Character::isLetter)
                    .count())
                    .sum();

        System.out.println(teste);
                    


        
        

    }

}
