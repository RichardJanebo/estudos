package com.devdojo.javacore.ZZDoptional.dominio;

public class Maga {
    private Integer id;
    private String title;
    private int charpters;


    public Maga(Integer id, String title, int charpters) {
        this.id = id;
        this.title = title;
        this.charpters = charpters;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public int getCharpters() {
        return charpters;
    }


    public void setCharpters(int charpters) {
        this.charpters = charpters;
    }


    @Override
    public String toString() {
        return "Id: " + id + " Title: " + title + " Charpters: " + charpters;
    }


    

    
    
}
