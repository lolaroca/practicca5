package com.example.demo;

public class Contact {
    private String name;
    private String surname;
    private String email;
    private String contraseña1;
    private String contraseña2;
    private String año;
    private String genero;

    public Contact(String name, String surname, String email, String contraseña1, String contraseña2, String año, String genero){
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
        this.setContraseña1(contraseña1);
        this.setContraseña2(contraseña2);
        this.setAño(año);
        this.setGenero(genero);
    }


    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getContraseña2() {
        return contraseña2;
    }

    public void setContraseña2(String contraseña2) {
        this.contraseña2 = contraseña2;
    }

    public String getContraseña1() {
        return contraseña1;
    }

    public void setContraseña1(String contraseña1) {
        this.contraseña1 = contraseña1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
