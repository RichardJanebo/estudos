package devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;

public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader fileReader = new FileReader(file)) {
            int n = 0;
            while ((n = fileReader.read()) != -1) {
                System.out.print(Character.toChars(n));
            }
          

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
