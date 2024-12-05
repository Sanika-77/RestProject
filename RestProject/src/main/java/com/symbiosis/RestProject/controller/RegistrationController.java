package com.symbiosis.RestProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.RestProject.model.Registration;
import com.symbiosis.RestProject.service.RegistrationService;

@RestController
public class RegistrationController {
@Autowired
private RegistrationService rs;
@GetMapping("/registrations")
public List<Registration> handleget()
{
	return rs.getAll();
}
@PostMapping("/addreg")
public Registration add(@RequestBody Registration r)
{
	return rs.insertrecord(r);
	
}




}



