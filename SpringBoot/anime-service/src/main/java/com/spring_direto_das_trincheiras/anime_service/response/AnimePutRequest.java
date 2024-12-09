package com.spring_direto_das_trincheiras.anime_service.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AnimePutRequest {
    private Long id;
    private String name;
    
}
