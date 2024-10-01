package devdojo.javacore.Xserializacao.test;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import devdojo.javacore.Xserializacao.dominio.Aluno;

public class SerializacaoTeste01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(10, "Goku","1234560");
        // serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("aluno.ser");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))) {
            oss.writeObject(aluno);
        } catch (Exception e) {
        }
    }
    private static void deserializar(){
        Path path = Paths.get("aluno.ser");
        try (ObjectInputStream oss = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno ) oss.readObject();
            System.out.println(aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
