package com.devdojo.javacore.ZZJcrud.dominio;


import lombok.Builder;
import lombok.NonNull;
import lombok.Value;


@Value
@Builder
public class Producer {
    private Integer id;
    private String name;

}
