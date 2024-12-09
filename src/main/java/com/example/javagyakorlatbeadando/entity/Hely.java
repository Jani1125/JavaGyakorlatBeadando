package com.example.javagyakorlatbeadando.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hely {

    @Id
    private Integer fkod;
    private Integer moziazon;

    // Constructors, getters and setters

    public Hely() {}

    public Hely(Integer fkod, Integer moziazon) {
        this.fkod = fkod;
        this.moziazon = moziazon;
    }

    public Integer getFkod() {
        return fkod;
    }

    public void setFkod(Integer fkod) {
        this.fkod = fkod;
    }

    public Integer getMoziazon() {
        return moziazon;
    }

    public void setMoziazon(Integer moziazon) {
        this.moziazon = moziazon;
    }
}
