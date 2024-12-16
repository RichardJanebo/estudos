package com.spring_direto_das_trincheiras.anime_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.spring_direto_das_trincheiras.anime_service.domain.Producer;
import com.spring_direto_das_trincheiras.anime_service.mapper.ProducerMapper;
import com.spring_direto_das_trincheiras.anime_service.repository.ProducerRepository;
import com.spring_direto_das_trincheiras.anime_service.response.ProducerGetResponse;

@Service
public class ProducerService {
    private ProducerRepository producerRepository;
    private static final ProducerMapper MAPPER = ProducerMapper.INSTANCE;

    @Autowired
    public ProducerService(ProducerRepository repository){
        this.producerRepository = repository;
    }


    public List<Producer> findAll(){
        return producerRepository.findAll();
    }

    public Producer findById(Long id){
        return producerRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Producer Not Found"));
    }

    public List<Producer> findByName(String name){
       List<Producer> result =  producerRepository.findByName(name);

       if(result.isEmpty()){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nome Not Found");
       }

       return result;
    }

    public void deleteById(Long id){
        producerRepository.delete(findById(id));
    }

    public void update(Producer producer){
        producerRepository.update(producer);
    }

    public Producer save(Producer producer){
      return  producerRepository.save(producer);
    }


    
}
