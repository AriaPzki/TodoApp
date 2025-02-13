package com.in28minutes.springboot.todowebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticateUser (String name, String password){
        return name.equalsIgnoreCase("aria") && password.equalsIgnoreCase("dummy");
    }
}
