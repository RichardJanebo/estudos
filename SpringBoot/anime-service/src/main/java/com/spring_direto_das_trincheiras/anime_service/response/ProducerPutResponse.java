package com.spring_direto_das_trincheiras.anime_service.response;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ProducerPutResponse {
    private Long id;
    private String name;
}
