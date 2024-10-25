package devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("Gomu","Gomu","Gomu", "No", "Mi"));

         List<String> letras =palavras.stream()
            .map(w -> w.split(""))
            .flatMap(Arrays::stream)
            .collect(Collectors.toList());
        
       System.out.println(letras);

    }
}
