package devdojo.javacore.ZZBcomportamento.interfaces;

import devdojo.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    abstract boolean test(Car car);

}
