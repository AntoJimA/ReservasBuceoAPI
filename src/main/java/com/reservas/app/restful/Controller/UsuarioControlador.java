package com.reservas.app.restful.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservas.app.restful.Model.Usuario;
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


    @GetMapping("/crearUsuario")
    public void crearUsuario(@RequestParam Usuario user) {
        userRepository.save(user);
    }

    @GetMapping("/eliminarUsuario")
    public void eliminarPorID(@RequestParam int id) {
        userRepository.deleteById(id);
    }

    @GetMapping("/actualizarUsuario")
    public void actualizarUsuario(@RequestParam Usuario user) {
        userRepository.update(user);
    }

    @GetMapping("/buscarUsuario{id}")
    public Usuario buscarUsuario(@RequestParam int id) {
        return userRepository.findById(id);
    }

    @GetMapping("/listarUsuarios")
    public void listarUsuarios() {
        userRepository.usuarios();
    }
    
    
}
