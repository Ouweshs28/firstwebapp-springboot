package com.ouwesh.springboot.myfirstwebapp.controller.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        return username.equalsIgnoreCase("ows") && password.equals("password");
    }
}
