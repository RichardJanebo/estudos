package com.devdojo.mappers.animes;


import com.devdojo.domain.Anime;
import com.devdojo.dto.dtoGetRequest.AnimeGetResponse;
import com.devdojo.dto.dtoPostRequest.AnimePostRequest;
import com.devdojo.dto.dtoPutRequest.AnimePutRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AnimeMapper {
    AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    Anime toAnime(AnimePostRequest animePostRequest);

    AnimeGetResponse toAnimeGetResponse(Anime anime);

    List<AnimeGetResponse> toListAnimeGetResponse(List<Anime> animes);

    Anime putToAnime(AnimePutRequest animePutResponse);
}
