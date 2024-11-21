package com.devdojo.javacore.ZZIjdbc.model;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;


@Value
@Builder
public class Producer {
    private Integer id;
    @NonNull
    private String name;

}
