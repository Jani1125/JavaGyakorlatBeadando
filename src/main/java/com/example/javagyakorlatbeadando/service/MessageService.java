package com.example.javagyakorlatbeadando.service;

import com.example.javagyakorlatbeadando.entity.Message;
import com.example.javagyakorlatbeadando.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public void saveMessage(String senderName, String email, String messageText) {
        Message message = new Message();
        message.setNev(senderName);
        message.setEmail(email);
        message.setUzenetSzoveg(messageText);
        message.setKuldesIdeje(LocalDateTime.now());
        // A válasz alapértelmezésben null
        messageRepository.save(message);
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAllByOrderByKuldesIdejeDesc();
    }
}
