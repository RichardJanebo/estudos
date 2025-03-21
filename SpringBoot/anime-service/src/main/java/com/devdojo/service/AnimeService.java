package com.devdojo.service;

import com.devdojo.domain.Anime;
import com.devdojo.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository){
        this.animeRepository =animeRepository;
    }

    public List<Anime> findAll(){
        return animeRepository.findAll();
    }

    public List<Anime> findByName(List<String> name){
        return  animeRepository.findByName(name);
    }

    public Anime findById(Long id){
        return animeRepository.findById(id).orElseThrow(() -> new AnimeNotFoundException("Anime não existe"));
    }

    public Anime save(Anime anime){
        return  animeRepository.save(anime);
    }

    public  void deleteById(Long id){
        Anime byId = findById(id);
        animeRepository.deleteById(byId);

    }

    public void upadate(Anime anime){
        deleteById(anime.getId());
        save(anime);

    }


}

class AnimeNotFoundException extends RuntimeException{
    public AnimeNotFoundException(String message){
        super(message);
    }
}
