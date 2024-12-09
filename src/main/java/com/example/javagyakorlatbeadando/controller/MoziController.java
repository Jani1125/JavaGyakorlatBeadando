package com.example.javagyakorlatbeadando.controller;

import com.example.javagyakorlatbeadando.entity.Mozi;
import com.example.javagyakorlatbeadando.service.MoziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MoziController {

    private final MoziService moziService;

    @Autowired
    public MoziController(MoziService moziService) {
        this.moziService = moziService;
    }

    @GetMapping("/mozis")
    public String getMozis(Model model) {
        List<Mozi> moziList = moziService.getAllMozis();
        model.addAttribute("moziList", moziList);
        return "film";
    }
}
