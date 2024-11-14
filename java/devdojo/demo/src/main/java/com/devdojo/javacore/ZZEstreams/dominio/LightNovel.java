package com.devdojo.javacore.ZZEstreams.dominio;

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
        return "Titulo: " + title + " Preço: " + price + " Categoria: " + category + "\n" ;
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


    public void setTitle(String title) {
        this.title = title;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }


   

}
