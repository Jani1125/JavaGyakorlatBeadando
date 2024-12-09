package com.example.javagyakorlatbeadando.service;

import com.example.javagyakorlatbeadando.entity.Mozi;
import com.example.javagyakorlatbeadando.repository.MoziRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoziService {

    private final MoziRepository moziRepository;

    @Autowired
    public MoziService(MoziRepository moziRepository) {
        this.moziRepository = moziRepository;
    }

    public List<Mozi> getAllMozis() {
        return moziRepository.findAll();
    }
}
