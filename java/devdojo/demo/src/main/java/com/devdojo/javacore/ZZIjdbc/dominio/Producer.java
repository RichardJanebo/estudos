package com.devdojo.javacore.ZZIjdbc.dominio;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public class Producer {
    private Integer id;
    @NonNull
    private String name;

}
