package com.spring1.first_srprig_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring1.first_srprig_app.food.Food;

public interface FoodReposytory extends JpaRepository<Food,Long> {
    
}
