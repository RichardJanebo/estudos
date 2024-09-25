package devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTeste {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/richard");
        Path clazss = Paths.get("/c:");
        
        Path pathToClass = dir.relativize(clazss);


        Path absolute =  Paths.get("/home/richard");

        Path absolute2 = Paths.get("home/richard/dev/");

        System.out.println("1"+ clazss.relativize(absolute));
    } 
}