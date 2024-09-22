package devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args){
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true)){
            fw.write("Ola bom dia Holla mundo\n Continuando na outra linha");
            fw.flush();
           
                        

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
