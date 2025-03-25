package com.devdojo.user_service.repository;

import com.devdojo.user_service.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserData {
    private List<User> users = new ArrayList<>(List.of(
            User.builder().id(1L).firstName("Luiz").lastName("Tafarel").email("luiztafarel@gmail.com").build(),
            User.builder().id(2L).firstName("Mariana").lastName("Silva").email("mariana.silva@email.com").build(),
            User.builder().id(3L).firstName("Carlos").lastName("Pereira").email("carlos.pereira@email.com").build(),
            User.builder().id(4L).firstName("Fernanda").lastName("Souza").email("fernanda.souza@email.com").build(),
            User.builder().id(5L).firstName("Roberto").lastName("Almeida").email("roberto.almeida@email.com").build(),
            User.builder().id(6L).firstName("Beatriz").lastName("Mendes").email("beatriz.mendes@email.com").build(),
            User.builder().id(7L).firstName("Gabriel").lastName("Costa").email("gabriel.costa@email.com").build()
    ));


    public List<User> getUsers() {
        return users;
    }
}
