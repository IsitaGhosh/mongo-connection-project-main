package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Interns;
import com.example.demo.repo.InternRepository;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    public void saveIntern(Interns intern) {
        internRepository.save(intern);
    }
}
