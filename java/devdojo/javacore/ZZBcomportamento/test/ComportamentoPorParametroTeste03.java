package devdojo.javacore.ZZBcomportamento.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import devdojo.javacore.ZZBcomportamento.dominio.Car;



public class ComportamentoPorParametroTeste03 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {

        int ano = 10;
        List<Car> greenCars = filter(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });

        List<Car> carByYear = filter(cars, new Predicate<Car>() {

            @Override
            public boolean test(Car car) {
                return car.getYear() >= LocalDate.now().getYear() - ano;
            }
        });


        List<Integer> nuns = List.of(1,96,6,10,18,96,20,40);

        List<Integer> numerosMaiorDezoito = filter(nuns, new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
              return n > 18;
            }
            
        });

        System.out.println(numerosMaiorDezoito);

        System.out.println("____________");

        System.out.println(greenCars);

        System.out.println("---------");

        System.out.println(carByYear);

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> listaGenerica = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                listaGenerica.add(t);
            }
        }
        return listaGenerica;
    }

}
