package devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest03 {
    public static void main(String[] args) {
        Path path1 =  Paths.get("home/richard");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resouve = path1.resolve(arquivo);
        System.out.println(resouve);

        Path absoluto = Paths.get("home/richard/dev/arquivo.txt");

        System.out.println(path1.resolve(absoluto));
    }
}
