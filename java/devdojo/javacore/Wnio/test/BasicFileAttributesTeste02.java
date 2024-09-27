package devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTeste02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path,BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAccesTime =  basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime =  basicFileAttributes.lastModifiedTime();


        System.out.println("creationTime " + creationTime);
        System.out.println("lastAcessTime " + lastAccesTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);

        BasicFileAttributeView basicFileAttributeView =  Files.getFileAttributeView(path,BasicFileAttributeView.class);
        FileTime newCreationAcessTime = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(lastModifiedTime,newCreationAcessTime,creationTime);

        System.out.println("-----------------------------------------------");

        creationTime = basicFileAttributeView.readAttributes().creationTime();
        lastAccesTime =  basicFileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime =  basicFileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastAcessTime " + lastAccesTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);




    }
}
