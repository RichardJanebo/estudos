package devdojo.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public String imprime() {
        return " Rua : " + rua + " Cep: " + cep;
        
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
