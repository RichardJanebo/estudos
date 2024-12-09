package com.spring_direto_das_trincheiras.anime_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.spring_direto_das_trincheiras.anime_service.domain.Producer;
import com.spring_direto_das_trincheiras.anime_service.response.ProducerGetResponse;
import com.spring_direto_das_trincheiras.anime_service.response.ProducerPutResponse;
import com.spring_direto_das_trincheiras.anime_service.resquest.ProducerPostRequest;

@Mapper
public interface ProducerMapper {
        ProducerMapper INSTANCE = Mappers.getMapper(ProducerMapper.class);

        @Mapping(target = "date", expression = "java(java.time.LocalDateTime.now())")
        @Mapping(target = "id", expression = "java(java.util.concurrent.ThreadLocalRandom.current().nextLong(100_000))")
        Producer toProducer(ProducerPostRequest postRequest);

        
        ProducerGetResponse toProducerGetResponse(Producer producer);

        @Mapping(target = "date", expression = "java(java.time.LocalDateTime.now())")
        Producer putProducer_Producer(ProducerPutResponse producerPutResponse);


}