package teste09.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste {
    public static void main(String[] args) {
        double temperatura = 1;

        if (temperatura <= 20 && temperatura >= 1) {
            System.out.println((temperatura - 20) / (20 - 1));
        }

        // returnExemple("luffy@hotmail.com, 123jotaro@gmail.com, #zoro@email.com,
        // teste@gmail.com.br, sakura@email");
        InnerTeste innerTeste = new InnerTeste();

        File file = new File("C:\\Users\\richa\\Documents\\Estudos\\Java\\texto.txt");
        System.out.println(innerTeste instanceof InnerTeste);
        innerTeste.testeBuffer(file);

    }

    // public static void returnExemple(String texto) {
    // Pattern pattern =
    // Pattern.compile("([a-z-A-Z0-9])+@([a-zA-Z0-9])+([\\.|a-zA-Z0-9])*");
    // Matcher matcher = pattern.matcher(texto);

    // }

}

class InnerTeste {
    public void testeBuffer(File textoString) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(textoString))) {
            String linha = "";

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.println("teste");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}