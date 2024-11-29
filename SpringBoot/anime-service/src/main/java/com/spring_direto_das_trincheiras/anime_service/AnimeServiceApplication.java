package com.spring_direto_das_trincheiras.anime_service;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.var;

@SpringBootApplication
public class AnimeServiceApplication {

	public static void main(String[] args) {
		long maxMemory = Runtime.getRuntime().maxMemory();
		System.out.println("Memoria maxima configurada : " + (maxMemory/1024/1024)+ " MB" );
		SpringApplication.run(AnimeServiceApplication.class, args);

	}

}
