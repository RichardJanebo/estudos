package com.devdojo.javacore.Wnio.test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirectorStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("");
        try (DirectoryStream<Path> stream =Files.newDirectoryStream(path)) {
            for(Path path2:stream){
                System.out.println(path2.getFileName());
            }
            



        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
