package com.reservas.app.restful.Model;

public class Usuario {
    
    private int id;
    private String nombre;
    private String firstName;

    public Usuario() {
        // Default constructor
    }

    public Usuario(int id, String nombre, String firstName) {
        this.id = id;
        this.nombre = nombre;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
