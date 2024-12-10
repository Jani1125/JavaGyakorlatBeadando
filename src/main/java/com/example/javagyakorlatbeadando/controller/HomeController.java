package com.example.javagyakorlatbeadando.controller;

import com.example.javagyakorlatbeadando.entity.Film;
import com.example.javagyakorlatbeadando.entity.Hely;
import com.example.javagyakorlatbeadando.entity.Mozi;
import com.example.javagyakorlatbeadando.entity.User;
import com.example.javagyakorlatbeadando.repository.UserRepository;
import com.example.javagyakorlatbeadando.service.FilmService;
import com.example.javagyakorlatbeadando.service.HelyService;
import com.example.javagyakorlatbeadando.service.MoziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.Principal;
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

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/home")
    public String user(Model model) {
        return "index";
    }
    @GetMapping("/admin/home")
    public String admin() {
        return "admin";
    }


    @GetMapping("/tablavalaszto")
    public String tablavalaszto(Model model) {
        return "tablavalaszto";
    }

    @GetMapping("/regisztral")
    public String greetingForm(Model model) {
        model.addAttribute("reg", new User());
        return "regisztral";
    }
    @Autowired
    private UserRepository userRepo;
    @PostMapping("/regisztral_feldolgoz")
    public String Regisztráció(@ModelAttribute User user, Model model) {
        for(User felhasznalo2: userRepo.findAll())
            if(felhasznalo2.getEmail().equals(user.getEmail())){
                model.addAttribute("uzenet", "A regisztrációs email már foglalt!");
                return "reghiba";
            }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("ROLE_Vendeg");
        userRepo.save(user);
        model.addAttribute("id", user.getId());
        return "regjo";
    }

}