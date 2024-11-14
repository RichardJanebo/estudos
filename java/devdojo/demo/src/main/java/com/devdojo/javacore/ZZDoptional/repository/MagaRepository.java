package com.devdojo.javacore.ZZDoptional.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.devdojo.javacore.ZZDoptional.dominio.Maga;

public class MagaRepository {

    private static List<Maga> mangas = List.of(new Maga(1, "Boku no hero ", 50), new Maga(2, "OverLord", 25));

    public static Optional<Maga> findByTitle(String title) {
        return find(e -> e.getTitle().equals(title));
    }

    public static Optional<Maga> findById(Integer id) {
        return find(e -> e.getId().equals(id));
    }

    public static Optional<Maga> find(Predicate<Maga> predicate) {
        Maga m = null;

        for (Maga manga : mangas) {
            if (predicate.test(manga)) {
                m = manga;
            }

        }

        return Optional.ofNullable(m);
    }

}
