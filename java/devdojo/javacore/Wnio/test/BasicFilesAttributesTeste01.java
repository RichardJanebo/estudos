package devdojo.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTeste01 {
    public static void main(String[] args) throws IOException {
    //    File file = new File("C:\\Users\\richa\\Documents\\Estudos\\Java\\devdojo\\arquivo\\pasta\\subpasta\\text.txt");
       LocalDateTime date = LocalDateTime.now().minusDays(5);
    //    boolean isCreate = file.createNewFile();
    //    boolean isModifified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());


       Path path = Paths.get("C:\\Users\\richa\\Documents\\Estudos\\Java\\devdojo\\arquivo\\pasta\\subpasta\\text.txt");
       Files.createFile(path);
       Files.setLastModifiedTime(path, FileTime.from(date.toInstant(ZoneOffset.UTC)));
    }
    
}