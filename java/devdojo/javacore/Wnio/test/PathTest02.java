package devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args)  {
        Path pastaPath = Paths.get("pasta");
        try {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
