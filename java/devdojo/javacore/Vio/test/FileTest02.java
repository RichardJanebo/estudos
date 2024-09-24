package devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("");
        fileDirectory.mkdir();
        System.out.println(fileDirectory.isDirectory());
        
        File arquivoDirectory = new File(fileDirectory,"arquivo.txt");
        boolean isCreate = arquivoDirectory.createNewFile();
        System.out.println(isCreate);

        File fileRenamed = new File(fileDirectory,"Arquivo_Renomeado.txt");
        arquivoDirectory.renameTo(fileRenamed);
    }
}
