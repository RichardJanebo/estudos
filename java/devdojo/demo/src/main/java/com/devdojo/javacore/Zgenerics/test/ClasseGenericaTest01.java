package com.devdojo.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import com.devdojo.javacore.Zgenerics.dominio.Barco;
import com.devdojo.javacore.Zgenerics.dominio.Carro;
import com.devdojo.javacore.Zgenerics.servico.CarroRentavelService;
import com.devdojo.javacore.Zgenerics.servico.VeiculoRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
      Carro carro = new Carro("BMW");
      Carro carro2 = new Carro("Chevete");
      Carro carro3 = new Carro("Maverik");
      Barco barco = new Barco("Lancha");
      Barco barco2 = new Barco("Navio");
      Barco barco3 = new Barco("Prancha");
      
      List<Carro> carros = new ArrayList<>(List.of(carro,carro2,carro3));
      List<Barco> barcos = new ArrayList<>(List.of(barco,barco2,barco3));

      VeiculoRentavelService<Carro>  rentavelService = new VeiculoRentavelService<>(carros);

      VeiculoRentavelService<Barco> rentavelService2 = new VeiculoRentavelService<>(barcos);


      Carro carro4 = rentavelService.buscarObjetoDisponiveis();
      System.out.println("Usando Carro por um mes...");
      rentavelService.retornarObjetoAlugado(carro4);

      System.out.println("-----------------------------");

      Barco barco4 = rentavelService2.buscarObjetoDisponiveis();
      System.out.println("Usando barco por um mes...");
      rentavelService2.retornarObjetoAlugado(barco4);
      


    }
}
