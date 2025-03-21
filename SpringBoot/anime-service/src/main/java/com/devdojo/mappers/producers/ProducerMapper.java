package com.devdojo.mappers.producers;


import com.devdojo.domain.Producer;
import com.devdojo.dto.dtoGetRequest.ProducerGetResponse;
import com.devdojo.dto.dtoPostRequest.ProducerPostRequest;
import com.devdojo.dto.dtoPutRequest.ProducerPutRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Mapper
public interface ProducerMapper {
    ProducerMapper INSTANCE = Mappers.getMapper(ProducerMapper.class);


    Producer toProducer(ProducerPostRequest postRequest);

    ProducerGetResponse toProducerGetResponse(Producer producer);

    List<ProducerGetResponse> toListProducerGetResponse(List<Producer> producers);

    Producer putToProducer(ProducerPutRequest producerPutRequest);
}
