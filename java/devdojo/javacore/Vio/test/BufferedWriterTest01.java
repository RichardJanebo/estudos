package devdojo.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
         File file = new File("file.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))){
           for(int n = 10 ; n < 20 ; n++){
            bufferedWriter.append(String.valueOf(n));

           
        
           }
           
                        

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
