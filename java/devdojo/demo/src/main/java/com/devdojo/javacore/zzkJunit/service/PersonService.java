package com.devdojo.javacore.zzkJunit.service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.devdojo.javacore.zzkJunit.dominio.Person;

public class PersonService {
    public static boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }

    public static List<Person> filterRemovingNotAdult(List<Person> persons){
        return persons.stream().filter(PersonService::isAdult).collect(Collectors.toList());
    }
}
