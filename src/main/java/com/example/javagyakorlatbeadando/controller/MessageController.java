package com.example.javagyakorlatbeadando.controller;

import com.example.javagyakorlatbeadando.entity.Message;
import com.example.javagyakorlatbeadando.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/kapcsolat")
    public String showContactForm(Model model) {
        return "kapcsolat";
    }

    @PostMapping("/kuldes")
    public String sendMessage(@RequestParam("uzenet_szoveg") String messageText,
                              @RequestParam("nev") String senderName,
                              @RequestParam(value = "email", required = false) String email) {
        messageService.saveMessage(senderName, email, messageText);
        return "redirect:/kapcsolat?success";
    }

    @GetMapping("/admin/uzenetek")
    public String viewMessages(Model model) {
        List<Message> messages = messageService.getAllMessages();
        model.addAttribute("messages", messages);
        return "admin";
    }
}
