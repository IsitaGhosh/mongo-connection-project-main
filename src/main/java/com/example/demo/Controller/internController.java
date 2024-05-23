package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Interns;
import com.example.demo.repo.InternRepository;
import com.example.demo.service.InternService;

@RestController

public class internController {
	@Autowired
	private InternService internService;

	@Autowired
	InternRepository internRepository;

	@PostMapping("/interns/save")
	public ResponseEntity<String> saveIntern(@RequestBody Interns intern) {
		internService.saveIntern(intern);
		return ResponseEntity.ok("Intern data saved successfully.");
	}
}
