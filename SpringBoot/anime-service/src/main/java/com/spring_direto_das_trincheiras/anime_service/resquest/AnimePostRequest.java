package com.spring_direto_das_trincheiras.anime_service.resquest;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AnimePostRequest {
    private Long id;
    private String name;
    private Long epsodes;
    
}
