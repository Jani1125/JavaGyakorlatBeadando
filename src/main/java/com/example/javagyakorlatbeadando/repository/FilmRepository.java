package com.example.javagyakorlatbeadando.repository;

import com.example.javagyakorlatbeadando.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
