package com.example.javagyakorlatbeadando.service;

import com.example.javagyakorlatbeadando.entity.Hely;
import com.example.javagyakorlatbeadando.repository.HelyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelyService {

    private final HelyRepository helyRepository;

    @Autowired
    public HelyService(HelyRepository helyRepository) {
        this.helyRepository = helyRepository;
    }

    public List<Hely> getAllHelyek() {
        return helyRepository.findAll();
    }
}
