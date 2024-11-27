package com.spring1.first_srprig_app.dto;

import com.spring1.first_srprig_app.food.Food;

public record FoodResponseDto(Long id, String title, String image, Integer price) {
    public FoodResponseDto(Food food){
        this(food.getId(),food.getTitle(),food.getImage(),food.getPrice());
    }

}