package aula15.collections.set.convidados;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj ) return true;

        if(!(obj instanceof Convidado convidado)) return false;
        return getCodigo() == convidado.getCodigo();
    }


    public String getNome(){
        return nome;
    }


    public int getCodigo(){
        return codigoConvite;
    }


    @Override
    public String toString() {
        return " O Nome Do Convidado é: " + nome +
        "\n E o codigo é: " + codigoConvite;
    }
    
}
