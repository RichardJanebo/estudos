package devdojo.javacore.Vio.test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirectorStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\richa\\Documents\\Estudos\\Java\\devdojo");
        try (DirectoryStream<Path> stream = new Scanner(System.in)) {
            



        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
