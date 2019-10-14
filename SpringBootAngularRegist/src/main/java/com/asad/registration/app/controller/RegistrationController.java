package com.asad.registration.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asad.registration.app.entity.Registration;
import com.asad.registration.app.repository.RegistrationRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RegistrationController {

	@Autowired
	private RegistrationRepository registrationRepository;

	@GetMapping("/allreg")
	public List<Registration> getAllRegistration() {
		return registrationRepository.findAll();
	}

	@PostMapping("/create")
	public Registration createRegister(@RequestBody Registration registration) {
		return registrationRepository.save(registration);
	}
}
