package com.spring1.first_srprig_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring1.first_srprig_app.dto.FoodRequestDTO;
import com.spring1.first_srprig_app.dto.FoodResponseDto;
import com.spring1.first_srprig_app.food.Food;
import com.spring1.first_srprig_app.repository.FoodReposytory;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodReposytory reposytory;
    
    @CrossOrigin(origins ="*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDto> getAll(){
        List<FoodResponseDto> foodList = reposytory.findAll().stream()
            .map(FoodResponseDto::new).toList();

        return foodList;
       
        
    }

    @CrossOrigin(origins ="*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data ){
        Food foodData = new Food(data);
        reposytory.save(foodData);


    }
    
}