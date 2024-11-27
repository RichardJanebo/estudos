package com.devdojo.javacore.zzkJunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MangaTest {
    public Manga manga01;
    public Manga manga02;

    @BeforeEach
    public void setup(){
        manga01 = new Manga("Dragon ball z", 500);
        manga02 = new Manga("Dragon ball z", 500);



    }

    @Test
    public void acessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Dragon ball z", manga01.name());
        Assertions.assertEquals(500, manga02.episodess());
    }

    @Test
    public void esquals_Return_WhenInitialized(){
        Assertions.assertEquals(manga02, manga01);
    }

    
  
}
