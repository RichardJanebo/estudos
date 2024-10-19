package devdojo.javacore.ZZBcomportamento.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import devdojo.javacore.ZZBcomportamento.dominio.Car;

public class ComportamentoPorParametroTeste01 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {

        System.out.println(filterColorCars(cars, "Red"));
        System.out.println(filterColorCars(cars, "Green"));
        System.out.println(filterColorCars(cars, "Black"));

        System.out.println(filterCarsByYear(cars,10));

    }

    private static List<Car> filterColorCars(List<Car> cars, String color) {
        List<Car> carrosVerdes = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carrosVerdes.add(car);
            }
        }
        return carrosVerdes;

    }

    private static List<Car> filterCarsByYear(List<Car> cars, int year) {
        LocalDate localDate = LocalDate.now();
        List<Car> carrosVerdes = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear()  >= localDate.getYear() - year) {
                carrosVerdes.add(car);
            }
        }
        return carrosVerdes;

    }

}
