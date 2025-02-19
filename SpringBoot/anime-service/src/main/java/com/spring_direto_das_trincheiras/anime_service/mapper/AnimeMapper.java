package com.spring_direto_das_trincheiras.anime_service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

import com.spring_direto_das_trincheiras.anime_service.domain.Anime;
import com.spring_direto_das_trincheiras.anime_service.response.AnimeGetResponse;
import com.spring_direto_das_trincheiras.anime_service.response.AnimePutRequest;
import com.spring_direto_das_trincheiras.anime_service.resquest.AnimePostRequest;

@Mapper(componentModel = "spring")
public interface AnimeMapper {

    @Mapping(target = "id", expression = "java(java.util.concurrent.ThreadLocalRandom.current().nextLong(100_000))")
    Anime toAnime(AnimePostRequest animePostRequest);

    AnimeGetResponse tAnimeGetResponse(Anime anime);

    List<AnimeGetResponse> listAnimeToListAnimeGetResponse(List<Anime> animes);
    Anime animePut_Anime(AnimePutRequest animePutRequest);
}
