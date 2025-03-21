package com.devdojo.controller;

import com.devdojo.repository.AnimeData;
import com.devdojo.repository.AnimeRepository;
import com.devdojo.service.AnimeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;

@WebMvcTest(controllers = AnimeController.class)
@Import({AnimeService.class, AnimeRepository.class, AnimeData.class})
class AnimeControllerTest {
    @Test
    void init() {

    }
}