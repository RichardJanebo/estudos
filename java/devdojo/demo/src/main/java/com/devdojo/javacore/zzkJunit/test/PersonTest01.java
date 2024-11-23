package com.devdojo.javacore.zzkJunit.test;

import com.devdojo.javacore.zzkJunit.dominio.Person;
import com.devdojo.javacore.zzkJunit.service.PersonService;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class PersonTest01 {
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setAge(10);


        log.info("Is Adult '{}'",PersonService.isAdult(person) );


    }
}
