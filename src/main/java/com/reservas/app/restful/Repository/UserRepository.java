package com.reservas.app.restful.Repository;

import java.util.List; // Import the correct List class
import com.reservas.app.restful.Model.Usuario; // Import the Usuario class
public interface UserRepository {
    List<Usuario> usuarios(); // Update the method signature
    public void save(Usuario usuario);
    public void deleteById(int id);
    public void update(Usuario usuario);
    public void findAll();
    public Usuario findById(int id);
    public void create(Usuario usuario);
}
