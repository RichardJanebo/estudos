package com.devdojo.javacore.zzkJunit.dominio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeveloperTest {
  

    @Test
    void instanceof_ExecuteChilDClassMethod_WhenObjectISOfChildType(){
        Eployee eployeeDeveloper = new Developer("1", "Java");

        if(eployeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }
}
