package teste09.dominio;

public class InnerAnimal {
    private String nome;
    private String som;

    public void verificacaoDeAnimal(InnerAnimal innerAnimal){
        System.out.println(innerAnimal.nome);
        System.out.println(innerAnimal.som);
        if(innerAnimal instanceof Gato){
            Gato gato =(Gato) innerAnimal;
            System.out.println(gato.getCor());
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

   
} 
