package com.spring_direto_das_trincheiras.anime_service.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.spring_direto_das_trincheiras.anime_service.domain.Producer;

@ExtendWith(MockitoExtension.class)
public class ProducerRepositoryTest {
    private final List<Producer> producerList = new ArrayList<>();
    @InjectMocks
    private ProducerRepository producerRepository;

    @Mock
    ProducerData producerData;

    @BeforeEach
    void init() {
        var obj01 = new Producer.Builder().id(1L).name("Mappa").date(LocalDateTime.now()).build();
        var obj02 = new Producer.Builder().id(2L).name("Madhouse").date(LocalDateTime.now()).build();
        var obj03 = new Producer.Builder().id(3L).name("Kyoto Animation").date(LocalDateTime.now()).build();

        producerList.addAll(List.of(obj01, obj02, obj03));

    }

    @Test
    void findAll_returAllProducers_whenSuccesful() {
        BDDMockito.when(producerData.getProducers()).thenReturn(producerList);

        var producers = producerRepository.findAll();
        Assertions.assertThat(producers).isNotNull().isNotEmpty().hasSize(producerList.size());
    }

    @Test
    @DisplayName("find By id")
    void findById_returnProducerbyId() {
        BDDMockito.when(producerData.getProducers()).thenReturn(producerList);
        var expectedProducer = producerList.getFirst();
        var producer = producerRepository.findById(expectedProducer.getId());
        Assertions.assertThat(producer).isPresent().contains(expectedProducer);
    }

    @Test
    @DisplayName("Find by name return empty Lis when name is null")
    void findByName_returnAllProducerWhenNameIsNull() {
        BDDMockito.when(producerData.getProducers()).thenReturn(producerList);

        var producer = producerRepository.findByName(null);

        Assertions.assertThat(producer).isNotNull().isEmpty();

    }

    @Test
    @DisplayName("FindByName returns list with found object ehen name exist")
    void findByName_returnAllProducerWhenNameExist() {
        BDDMockito.when(producerData.getProducers()).thenReturn(producerList);
        var expectedProducer = producerList.getFirst();
        var producer = producerRepository.findByName(expectedProducer.getName());

        Assertions.assertThat(producer).contains(expectedProducer);

    }

    @Test
    void save_createNewProducer_whenSuccesful() {
        BDDMockito.when(producerData.getProducers()).thenReturn(producerList);

        var producerToSave = Producer.builder()
                .id(99L)
                .name("Mappa")
                .date(LocalDateTime.now())
                .build();

        var producer = producerRepository.save(producerToSave);

        Assertions.assertThat(producer).isEqualTo(producerToSave).hasNoNullFieldsOrProperties();

        Optional<Producer> byId = producerRepository.findById(producerToSave.getId());
        Assertions.assertThat(byId).isPresent().contains(producerToSave);
    }

    @Test
    void delete_removeProducerWhenSuccesful() {
        BDDMockito.when(producerData.getProducers()).thenReturn(producerList);

        var producerToDelete = producerList.getFirst();

        producerRepository.delete(producerToDelete);

        var producers = producerRepository.findAll();
        Assertions.assertThat(producers).isNotEmpty().doesNotContain(producerToDelete);
    }

    @Test
    void update_UpdateProducer_whenSuccesFull() {
        BDDMockito.when(producerData.getProducers()).thenReturn(producerList);

        var first = this.producerList.getFirst();

        first = Producer.builder()
                .id(first.getId())
                .name("Lucca")
                .date(LocalDateTime.now())
                .build();

        producerRepository.update(first);

        
        Assertions.assertThat(this.producerList).contains(first);

        Assertions.assertThat(first.getName()).isEqualTo("Lucca");

    }
}
