package com.devdojo.javacore.zzkJunit.dominio;

public class Developer extends Eployee {
    private String mainLanguage;

    public Developer(String id, String mainLanguage) {
        super(id);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    

    
}
