package com.example.javagyakorlatbeadando.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fkod;

    private String filmcim;
    private Boolean szines;
    private String szinkron;
    private String szarmazas;
    private String mufaj;
    private Integer hossz;

    // Constructors, getters and setters

    public Film() {}

    public Film(String filmcim, Boolean szines, String szinkron, String szarmazas, String mufaj, Integer hossz) {
        this.filmcim = filmcim;
        this.szines = szines;
        this.szinkron = szinkron;
        this.szarmazas = szarmazas;
        this.mufaj = mufaj;
        this.hossz = hossz;
    }

    public Integer getFkod() {
        return fkod;
    }

    public void setFkod(Integer fkod) {
        this.fkod = fkod;
    }

    public String getFilmcim() {
        return filmcim;
    }

    public void setFilmcim(String filmcim) {
        this.filmcim = filmcim;
    }

    public Boolean getSzines() {
        return szines;
    }

    public void setSzines(Boolean szines) {
        this.szines = szines;
    }

    public String getSzinkron() {
        return szinkron;
    }

    public void setSzinkron(String szinkron) {
        this.szinkron = szinkron;
    }

    public String getSzarmazas() {
        return szarmazas;
    }

    public void setSzarmazas(String szarmazas) {
        this.szarmazas = szarmazas;
    }

    public String getMufaj() {
        return mufaj;
    }

    public void setMufaj(String mufaj) {
        this.mufaj = mufaj;
    }

    public Integer getHossz() {
        return hossz;
    }

    public void setHossz(Integer hossz) {
        this.hossz = hossz;
    }
}
