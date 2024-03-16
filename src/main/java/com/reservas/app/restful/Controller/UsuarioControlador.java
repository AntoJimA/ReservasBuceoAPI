package com.reservas.app.restful.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservas.app.restful.Repository.UserRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hola")
    public String hola() {
        return "Hola Mundo";
    }
    
}
