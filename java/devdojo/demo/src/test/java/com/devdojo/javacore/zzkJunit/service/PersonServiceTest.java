package com.devdojo.javacore.zzkJunit.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;

import com.devdojo.javacore.zzkJunit.dominio.Person;

class PersonServiceTest {
    private final int notAdult = 17;
    private final int isAdult = 18;

    @Test
    void sholdBeFalseWhenAgeIsLowerThan18() {
        Person person = new Person();
        person.setAge(notAdult);

        boolean adult = PersonService.isAdult(person);

        assertFalse(adult, "Expected false when age is lower than 18");
    }

    @Test
    void sholdBeTrueWhenAgeIs18OrGrater() {
        Person person = new Person();
        person.setAge(isAdult);

        boolean adult = PersonService.isAdult(person);
        assertTrue(adult, "Expected true when age is 18 or greater");
    }

    @Test
    void sholdThrowNullPointerExeeptionWhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class, ()-> PersonService.isAdult(null),"Person can't be null"
        );
    }

    @Test
    void sholdReturnListWithOnlyAdult() {
        Person person01 = new Person();
        Person person02 = new Person();
        Person person03 = new Person();
        person01.setAge(17);
        person02.setAge(18);
        person03.setAge(21);

        List<Person> lsPersons = List.of(person01,person02,person03);

        Assertions.assertEquals(2, PersonService.filterRemovingNotAdult(lsPersons).size());

    }

}
