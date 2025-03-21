package com.devdojo.service;

import com.devdojo.domain.Producer;
import com.devdojo.repository.ProducerRepository;
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


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class ProducerServiceTest {
    private final List<Producer> PRODUCER = new ArrayList<>();

    @InjectMocks
    private ProducerService producerService;

    @Mock
    private ProducerRepository producerRepository;


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
    @DisplayName("Find all returns a list with all Producers")
    @Test
    void findAll() {
        BDDMockito.when(producerRepository.findAll()).thenReturn(PRODUCER);

        var all = producerService.findAll();

        Assertions.assertThat(all).isNotEmpty().hasSize(PRODUCER.size());
    }

    @Order(2)

    @DisplayName("Find By Name returns a list with producers names When SuccessFull")
    @Test
    void findByName_When_SuccessFull() {
        var firstProducer = PRODUCER.getFirst();
        var lastProducer = PRODUCER.getLast();
        var listProducer = List.of(firstProducer.getName(), lastProducer.getName());
        BDDMockito.when(producerRepository.findByName(listProducer)).thenReturn(List.of(firstProducer, lastProducer));

        var byNameList = producerService.findByName(listProducer);

        Assertions.assertThat(byNameList).isNotEmpty().hasSize(listProducer.size());
        Assertions.assertThat(byNameList).contains(lastProducer, firstProducer);
    }

    @Order(3)

    @DisplayName("Find By Name and returns a empty List when Name not Found")
    @Test
    void findByName_When_Name_Not_Found() {
        var firstProducer = PRODUCER.getFirst();

        var lastProducer = PRODUCER.getLast();

        var listProducer = List.of(firstProducer.getName(), lastProducer.getName());

        BDDMockito.when(producerRepository.findByName(listProducer)).thenReturn(List.of());

        var byName = producerService.findByName(listProducer);

        Assertions.assertThat(byName).isNotNull().isEmpty();
    }

    @Order(4)
    @DisplayName("Find producer By Id and return Producer when successful")
    @Test
    void findById() {
        var firstProducer = PRODUCER.getFirst();
        BDDMockito.when(producerRepository.findById(firstProducer.getId())).thenReturn(Optional.of(firstProducer));

        var byId = producerService.findById(firstProducer.getId());

        Assertions.assertThat(byId).isNotNull();
        Assertions.assertThat(byId).extracting(Producer::getId).isEqualTo(firstProducer.getId());
        Assertions.assertThat(byId).isEqualTo(firstProducer);
    }


    @Order(5)
    @DisplayName("Find producer By Id and Throw ProducerNotFoundException when not Found")
    @Test
    void findById_When_Producer_Not_Found() {
        var firstProducer = PRODUCER.getFirst();
        BDDMockito.when(producerRepository.findById(firstProducer.getId())).thenReturn(Optional.empty());


        Assertions.assertThatException().isThrownBy(() -> producerService.findById(firstProducer.getId()))
                .isInstanceOf(ProducerNotFoundException.class);
    }

    @Order(6)
    @DisplayName("Save Producer")
    @Test
    void save() {
        var firstProducer = Producer.builder()
                .id(20L)
                .name("Test")
                .build();

        BDDMockito.when(producerRepository.save(firstProducer)).thenReturn(firstProducer);

        var save = producerService.save(firstProducer);

        Assertions.assertThat(save).isEqualTo(firstProducer);
    }

    @Order(7)
    @DisplayName("Delete Producer When SuccessFul")
    @Test
    void deleteById_When_SuccessFul() {
        var firstProducer = PRODUCER.getFirst();
        BDDMockito.when(producerRepository.findById(firstProducer.getId())).thenReturn(Optional.of(firstProducer));
        producerService.deleteById(firstProducer.getId());

        BDDMockito.doNothing().when(producerRepository).delete(firstProducer);

        Assertions.assertThatNoException().isThrownBy(() -> producerService.deleteById(firstProducer.getId()));
    }


    @Order(8)
    @DisplayName("Delete Producer and throw ProducerNotFoundException when not found")
    @Test
    void deleteById_When_Producer_NotFound() {
        var firstProducer = PRODUCER.getFirst();
        BDDMockito.when(producerRepository.findById(firstProducer.getId())).thenReturn(Optional.empty());


        Assertions.assertThatException().isThrownBy(() -> producerService.deleteById(firstProducer.getId()))
                .isInstanceOf(ProducerNotFoundException.class);
    }

    @Order(9)
    @DisplayName("update Producer When SuccessFul")
    @Test
    void update() {
        var firstProducer = PRODUCER.getFirst();

        var made = Producer.builder()
                .id(firstProducer.getId())
                .name("Made")
                .build();

        BDDMockito.when(producerRepository.findById(firstProducer.getId())).thenReturn(Optional.of(firstProducer));


        Assertions.assertThatNoException().isThrownBy(() -> producerService.upadate(made));
    }

    @Order(10)
    @DisplayName("update Producer and Throw ProducerNotFoundException when Producer Not Found")
    @Test
    void update_Producer_When_User_Not_Found() {
        var firstProducer = PRODUCER.getFirst();
        BDDMockito.when(producerRepository.findById(firstProducer.getId())).thenReturn(Optional.empty());

        var made = Producer.builder().id(1L).name("Made").build();

        Assertions.assertThatException().isThrownBy(() -> producerService.upadate(made))
                .isInstanceOf(ProducerNotFoundException.class);
    }

}