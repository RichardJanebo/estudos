package com.devdojo.javacore.ZZDoptional.test;

import com.devdojo.javacore.ZZDoptional.dominio.Maga;
import com.devdojo.javacore.ZZDoptional.repository.MagaRepository;

public class OptionalTest02 {
    public static void main(String[] args) {
        MagaRepository.findById(5);
        MagaRepository.findByTitle("Boku no Hero")
                .ifPresent(m -> m.setTitle("Boku no Hero 02"));

        // Maga magaById = MagaRepository.findById(3)
        //         .orElseThrow(IllegalArgumentException::new);

        // System.out.println(magaById);

        Maga newManga = MagaRepository.findByTitle("Dragon ball z")
                .orElseGet(() -> new Maga(3, "Dragon ball z  ", 20));

        System.out.println(newManga);

    }
}
