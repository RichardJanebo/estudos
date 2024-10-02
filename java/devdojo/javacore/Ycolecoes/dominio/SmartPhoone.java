package devdojo.javacore.Ycolecoes.dominio;

public class SmartPhoone {
    private String serialNumber;
    private String marca;

    public SmartPhoone(String serialNumber, String marca){
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        SmartPhoone smartPhoone =  (SmartPhoone) obj;
        return serialNumber!= null && serialNumber.equals(smartPhoone.serialNumber);
    }

    

    
}
