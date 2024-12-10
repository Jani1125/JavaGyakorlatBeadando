package com.example.javagyakorlatbeadando.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "uzenet") // Az adatbázis tábla neve
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nev", nullable = false)
    private String nev;

    @Column(name = "email")
    private String email;

    @Column(name = "uzenet_szoveg", nullable = false)
    private String uzenetSzoveg;

    @Column(name = "kuldes_ideje")
    private LocalDateTime kuldesIdeje;

    @Column(name = "valasz")
    private String valasz;

    // Getters és setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUzenetSzoveg() {
        return uzenetSzoveg;
    }

    public void setUzenetSzoveg(String uzenetSzoveg) {
        this.uzenetSzoveg = uzenetSzoveg;
    }

    public LocalDateTime getKuldesIdeje() {
        return kuldesIdeje;
    }

    public void setKuldesIdeje(LocalDateTime kuldesIdeje) {
        this.kuldesIdeje = kuldesIdeje;
    }

    public String getValasz() {
        return valasz;
    }

    public void setValasz(String valasz) {
        this.valasz = valasz;
    }
}
