package com.spring_direto_das_trincheiras.anime_service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;
import com.spring_direto_das_trincheiras.anime_service.domain.Producer;
import com.spring_direto_das_trincheiras.anime_service.response.ProducerGetResponse;
import com.spring_direto_das_trincheiras.anime_service.response.ProducerPutResponse;
import com.spring_direto_das_trincheiras.anime_service.resquest.ProducerPostRequest;

@Mapper(componentModel =MappingConstants.ComponentModel.SPRING )
public interface ProducerMapper {

        @Mapping(target = "date", expression = "java(java.time.LocalDateTime.now())")
        @Mapping(target = "id", expression = "java(java.util.concurrent.ThreadLocalRandom.current().nextLong(100_000))")
        Producer toProducer(ProducerPostRequest postRequest);

        
        ProducerGetResponse toProducerGetResponse(Producer producer);

        List<ProducerGetResponse> toListProducerGetResponses(List<Producer> producers);
 
        @Mapping(target = "date", expression = "java(java.time.LocalDateTime.now())")
        Producer putProducer_Producer(ProducerPutResponse producerPutResponse);


}