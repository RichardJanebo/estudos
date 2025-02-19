package com.devdojo.javacore.ZZClambdas.dominio;

public class Anime {
    private String title;
    private int episodes;

    public Anime(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    public String getTitle() {
        return title;
    }

    public int getEpsodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "Anime [title=" + title + ", quantity=" + episodes + "]";
    }

}
