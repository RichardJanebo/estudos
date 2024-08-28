package teste09.dominio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.classfile.BufWriter;

public class InnerAnimal {
    private String nome;
    private String som;
    private EnunsTeste enunsTeste;

    public InnerAnimal(String nome, String som){
        this.nome = nome;
        this.som = som;
    }
    
    public InnerAnimal(String nome, String som, EnunsTeste enunsTeste){
        this(nome, som);
        this.enunsTeste = enunsTeste;
    }

    public void verificacaoDeAnimal(InnerAnimal innerAnimal){
        System.out.println(innerAnimal.nome);
        System.out.println(innerAnimal.som);
        if(innerAnimal instanceof Gato){
            Gato gato =(Gato) innerAnimal;
            System.out.println(gato.getCor());
        }


    }
    public void criarArquivo() throws IOException{
        File file = new File("texto.txt");
        
        try(BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file))){
            
    
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDia(){
      return  enunsTeste.getNumero();
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

   
} 
