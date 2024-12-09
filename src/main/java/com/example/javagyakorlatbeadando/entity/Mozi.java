package com.example.javagyakorlatbeadando.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mozi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer moziazon;

    private String mozinev;
    private Integer irszam;
    private String cim;
    private String telefon;

    // Constructors, getters and setters

    public Mozi() {}

    public Mozi(String mozinev, Integer irszam, String cim, String telefon) {
        this.mozinev = mozinev;
        this.irszam = irszam;
        this.cim = cim;
        this.telefon = telefon;
    }

    public Integer getMoziazon() {
        return moziazon;
    }

    public void setMoziazon(Integer moziazon) {
        this.moziazon = moziazon;
    }

    public String getMozinev() {
        return mozinev;
    }

    public void setMozinev(String mozinev) {
        this.mozinev = mozinev;
    }

    public Integer getIrszam() {
        return irszam;
    }

    public void setIrszam(Integer irszam) {
        this.irszam = irszam;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
