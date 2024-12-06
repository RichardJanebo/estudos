package com.spring_direto_das_trincheiras.anime_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.spring_direto_das_trincheiras.anime_service.domain.Producer;
import com.spring_direto_das_trincheiras.anime_service.resquest.ProducerPostRequest;

@Mapper
public interface ProducerMapper {
        ProducerMapper INSTANCE = Mappers.getMapper(ProducerMapper.class);

        @Mapping(target = "date" , expression = "java(java.time.LocalDateTime.now())")
        Producer toProducer(ProducerPostRequest postRequest);
}
