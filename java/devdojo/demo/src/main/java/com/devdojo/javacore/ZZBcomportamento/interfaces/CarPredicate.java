package com.devdojo.javacore.ZZBcomportamento.interfaces;

import com.devdojo.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    abstract boolean test(Car car);

}
