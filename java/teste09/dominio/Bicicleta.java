package teste09.dominio;

import teste09.test.DonoBicicleta;

public class Bicicleta {
    private String nome;
    private Dono donoBicicleta;

    public Bicicleta(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDonoBicicleta(Dono donoBicicleta){
        this.donoBicicleta = donoBicicleta;
    }

    public Dono getDonoBicicleta(){
        return donoBicicleta;
    }

    public void imprimir(){
        System.out.println(nome);
        System.out.println(donoBicicleta.getNome());
    }
}
