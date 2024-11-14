package com.devdojo.javacore.ZZBcomportamento.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.devdojo.javacore.ZZBcomportamento.dominio.Car;
import com.devdojo.javacore.ZZBcomportamento.interfaces.CarPredicate;

public class ComportamentoPorParametroTeste02 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {

        int ano = 10;
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green")); 

            
            
      

        List<Car> carByYear = filter(cars, new Predicate<Car>() {
            
            @Override
            public boolean test(Car car){
                return  car.getYear() >= LocalDate.now().getYear() - ano;
            }
        });
        

        System.out.println(greenCars);

        System.out.println("---------");

        System.out.println(carByYear);

    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filteCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteCars.add(car);
            }
        }
        return filteCars;

    }


}
