package devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;


public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\richa\\Documents\\Estudos\\Java\\devdojo\\arquivo\\file.txt");
        try {
            if (file.exists()) {
                boolean isDeleted = file.delete();
                System.out.println(isDeleted);
            }

            System.out.println("path" + file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isHidden());
            boolean iscreated = file.createNewFile();

            DateFormat dateFormat = DateFormat.getTimeInstance();
            
            System.out.println(dateFormat.format(file.lastModified()));
            System.out.println(dateFormat);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
