package com.devdojo.javacore.Ycolecoes.dominio;

public class SmartPhoone {
    String serialNumber;
    String nome;

    public SmartPhoone(String nome, String serialNumber) {
        this.nome = nome;
        this.serialNumber = serialNumber;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void sertSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }


    public String getNome(){
        return nome;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null ) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;

        SmartPhoone smartPhoone = (SmartPhoone) obj;
        return smartPhoone.serialNumber != null && serialNumber.equals(smartPhoone.serialNumber) ;
    }


    //Se y.equals(x) == true; y.hashCode == x.hashCode;
    //se os hashCode for igual não necessariamente são os mesmos objetos 
    //Se x.equals(y) == false; 
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Marca " + nome + " Numero de serie " + serialNumber;
    }

    

    



    
    

}
