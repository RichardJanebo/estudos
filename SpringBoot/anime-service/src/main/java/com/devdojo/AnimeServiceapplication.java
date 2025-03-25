package com.devdojo;
import com.devdojo.configuration.ConnectionConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties(value = ConnectionConfigurationProperties.class)
@SpringBootApplication
public class AnimeServiceapplication {

    public static void main(String[] args) {

        SpringApplication.run(AnimeServiceapplication.class, args);

    }

}
