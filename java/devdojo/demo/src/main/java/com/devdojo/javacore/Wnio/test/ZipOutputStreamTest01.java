package com.devdojo.javacore.Wnio.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
   public static void main(String[] args) {
        String souceFolder = "";
        String pastaCAminho = "";

        try{
            zip(souceFolder, pastaCAminho);
            System.out.println("Pasta zipada com sucesso");
        }catch(Exception e){
            e.printStackTrace();
        }
   }
   public static void zip(String sourceFolderPath, String zipFilePath){
        Path sourceFolder = Paths.get(sourceFolderPath);

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFilePath))) {
            Files.walk(sourceFolder).filter(path -> !Files.isDirectory(path)).forEach(path -> {
                ZipEntry zipEntry = new ZipEntry(sourceFolder.relativize(path).toString());

                try{
                    zipOutputStream.putNextEntry(zipEntry);
                    Files.copy(path, zipOutputStream);
                    zipOutputStream.closeEntry();
                }catch(IOException e){
                    System.out.println("Erro ao Zippar o Arquivo" + path);
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}
