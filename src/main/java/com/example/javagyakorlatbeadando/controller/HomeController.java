package com.example.javagyakorlatbeadando.controller;

import com.example.javagyakorlatbeadando.entity.Film;
import com.example.javagyakorlatbeadando.entity.Hely;
import com.example.javagyakorlatbeadando.entity.Mozi;
import com.example.javagyakorlatbeadando.service.FilmService;
import com.example.javagyakorlatbeadando.service.HelyService;
import com.example.javagyakorlatbeadando.service.MoziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final FilmService filmService;
    private final MoziService moziService;
    private final HelyService helyService;

    @Autowired
    public HomeController(FilmService filmService, MoziService moziService, HelyService helyService) {
        this.filmService = filmService;
        this.moziService = moziService;
        this.helyService = helyService;
    }

    @GetMapping("/film")
    public String viewMovies(Model model) {
        List<Film> films = filmService.getAllFilms();
        model.addAttribute("films", films);
        return "film";
    }

    @GetMapping("/mozi")
    public String viewMozis(Model model) {
        List<Mozi> moziList = moziService.getAllMozis();
        model.addAttribute("mozi", moziList);
        return "mozi";
    }

    @GetMapping("/hely")
    public String viewLocations(Model model) {
        List<Hely> helyList = helyService.getAllHelyek();
        model.addAttribute("hely", helyList);
        return "hely";
    }



    @GetMapping("/tablavalaszto")
    public String tablavalaszto(Model model) {
        return "tablavalaszto";
    }
}