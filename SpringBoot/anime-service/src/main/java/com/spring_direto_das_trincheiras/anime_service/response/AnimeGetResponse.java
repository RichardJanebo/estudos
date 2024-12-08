package com.spring_direto_das_trincheiras.anime_service.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@Getter
@Setter
public class AnimeGetResponse {
    private Long id;
    private String name;
    private Long epsodes;
}
