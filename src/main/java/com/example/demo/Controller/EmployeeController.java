package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@Autowired
	EmployeeRepository empRepository;

	@PostMapping("/employees/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp) {
		empService.saveEmployee(emp);
		return ResponseEntity.ok("Employee data saved successfully.");

	}

}
