package devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTeste01 {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("C:\\Users\\richa\\Documents\\Estudos\\Java\\home\\richard\\dev\\arquivo.txt");

        if (Files.notExists(path)){
            Files.createFile(path);

        }
        Files.setAttribute(path,"dos:hidden", false);
        Files.setAttribute(path, "dos:readonly", false);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path,DosFileAttributes.class);
        System.out.println(dosFileAttributes.isReadOnly());


        DosFileAttributeView files1 =Files.getFileAttributeView(path, DosFileAttributeView.class);
        files1.setReadOnly(true);
    }
}
