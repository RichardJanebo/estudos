package com.devdojo.commons;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;

@Component
public class FindMatchResources {

    @Autowired
    private  ResourceLoader resourceLoader;



    public   String readResourceFile(String filename) throws IOException {
        var resourcefile = resourceLoader.getResource("classpath:" + filename).getFile();
        return new String(Files.readAllBytes(resourcefile.toPath()));
    }
}
