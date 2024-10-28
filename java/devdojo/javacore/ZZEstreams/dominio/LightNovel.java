package devdojo.javacore.ZZEstreams.dominio;

public class LightNovel {
    private String title;
    private double price;
    private Category category;


    public LightNovel(String title, double price){
        this.title = title;
        this.price = price;
    }

    
    public LightNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LightNovel [title=" + title + ", price=" + price + " Categoria " + category ;
    }


    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        LightNovel lightNovel = (LightNovel) o;
        return this.getTitle().equals(lightNovel.getTitle());
    }

    @Override
    public int hashCode(){
        return this.getTitle().hashCode();
    }

}
