package com.example.javagyakorlatbeadando.controller;

import com.example.javagyakorlatbeadando.entity.Film;
import com.example.javagyakorlatbeadando.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final FilmService filmService;

    @Autowired
    public HomeController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/mozi")
    public String viewMovies(Model model) {
        List<Film> films = filmService.getAllFilms();
        model.addAttribute("films", films);
        return "mozi";
    }

    @GetMapping("/tablavalaszto")
    public String tablavalaszto(Model model) {
        return "tablavalaszto";
    }
}