package devdojo.javacore.Oexcepition.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Leitor 2 fechando");
    }
    
}