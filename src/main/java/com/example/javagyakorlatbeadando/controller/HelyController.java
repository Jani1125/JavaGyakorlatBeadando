package com.example.javagyakorlatbeadando.controller;

import com.example.javagyakorlatbeadando.entity.Hely;
import com.example.javagyakorlatbeadando.service.HelyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelyController {

    private final HelyService helyService;

    @Autowired
    public HelyController(HelyService helyService) {
        this.helyService = helyService;
    }

    @GetMapping("/helyek")
    public String getHelyek(Model model) {
        List<Hely> helyList = helyService.getAllHelyek();
        model.addAttribute("helyList", helyList);
        return "film";
    }
}
