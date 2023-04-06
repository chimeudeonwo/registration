package com.root.registrationbackend.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/start-register")
public class RegistrationController {
    @GetMapping
    public String startRegistration() {
        return "Registration started";
    }

    @PostMapping
    public String registerUser(String userDataJson) {
        return userDataJson + ": received";
    }
}
