package com.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleFileVisitorTeste02{
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("");

        Files.walkFileTree(path,new ListAllFilles());
    }
}

class ListAllFilles extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        Pattern pattern = Pattern.compile("([a-zA-Z0-9])+.java");
        Matcher matcher = pattern.matcher(file.getFileName().toString());

        if(matcher.find()){
            System.out.println(matcher.group());
        }
        return FileVisitResult.CONTINUE;
    }
    
}
