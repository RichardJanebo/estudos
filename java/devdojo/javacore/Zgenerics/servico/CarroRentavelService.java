package devdojo.javacore.Zgenerics.servico;

import java.util.ArrayList;
import java.util.List;

import devdojo.javacore.Zgenerics.dominio.Carro;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));


    public Carro buscarCarrosDisponiveis(){
        System.out.println("Buscando caro Dispooniveis");
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro" + c);
        System.err.println("Carros disponiveis para alugar");
        System.err.println(carrosDisponiveis);
        return c;
    }


    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo Carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(carrosDisponiveis);
    }
}
