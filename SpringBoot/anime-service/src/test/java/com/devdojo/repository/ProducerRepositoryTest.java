package com.devdojo.repository;

import com.devdojo.domain.Producer;
import lombok.Setter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class ProducerRepositoryTest {
    private final List<Producer> PRODUCER = new ArrayList<>();
    @InjectMocks
    private ProducerRepository producerRepository;

    @Mock
    private ProducerData producerData;


    @BeforeEach
    void init() {
        PRODUCER.addAll(List.of(
                new Producer.Builder().id(1L).name("Madhouse").build(),
                new Producer.Builder().id(2L).name("Kyoto Animation").build(),
                new Producer.Builder().id(3L).name("Bones").build(),
                new Producer.Builder().id(4L).name("Wit Studio").build(),
                new Producer.Builder().id(5L).name("Ufotable").build(),
                new Producer.Builder().id(6L).name("MAPPA").build(),
                new Producer.Builder().id(7L).name("Toei Animation").build(),
                new Producer.Builder().id(8L).name("Sunrise").build(),
                new Producer.Builder().id(9L).name("CloverWorks").build(),
                new Producer.Builder().id(10L).name("Trigger").build()
        ));
    }


    @Order(1)
    @Test
    @DisplayName("findAll returns a list with all producer")
    void findAll_ReturnsAllProducers_WhenSuccessFul() {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);

        List<Producer> all = producerRepository.findAll();

        Assertions.assertThat(all).isNotNull().hasSize(10);

    }


    @Order(2)
    @Test
    @DisplayName("findById return Producer with given id")
    void findById_ReturnProducer_WhenIdExist() {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);

        var expectedProducer = PRODUCER.getFirst();

        Producer byId = producerRepository.findById(expectedProducer.getId()).orElse(null);

        Assertions.assertThat(byId).isNotNull().isEqualTo(expectedProducer);
    }


    @Order(3)
    @Test
    @DisplayName("find by name return list with given name")
    void findByName_WhenNameExist() {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);

        var firstProducer = PRODUCER.getFirst();
        var lastProducer = PRODUCER.getLast();
        var listProducer = List.of(firstProducer.getName(), lastProducer.getName());

        List<Producer> byName = producerRepository.findByName(listProducer);

        Assertions.assertThat(byName).isNotNull().contains(firstProducer, lastProducer).hasSize(2);


    }

    @Order(4)
    @DisplayName("save producer")
    @Test
    void save_Create_Producer_WhenSuccessFull() {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);

        var producer = Producer.builder().id(22L).name("Test").build();

        List<Producer> all = producerRepository.findAll();

        Assertions.assertThat(all).isNotEmpty().hasSize(10);

        producerRepository.save(producer);

        List<Producer> after = producerRepository.findAll();

        Assertions.assertThat(after).hasSize(11);
        Assertions.assertThat(after).contains(producer);


    }

    @Order(5)
    @DisplayName("Delete producer by id")
    @Test
    void delete_Producer_WhenSuccessful() {
        BDDMockito.when(producerData.getProducers()).thenReturn(PRODUCER);

        var producer = PRODUCER.getFirst();

        List<Producer> all = producerRepository.findAll();

        Assertions.assertThat(all).isNotEmpty().hasSize(10);

        producerRepository.delete(producer); //Esse metodo esta sendo testado

        List<Producer> after = producerRepository.findAll();

        Assertions.assertThat(after).hasSize(9);
        Assertions.assertThat(after).doesNotContain(producer);

        Optional<Producer> byId = producerRepository.findById(producer.getId());
        Assertions.assertThat(byId).isEmpty();

    }


}