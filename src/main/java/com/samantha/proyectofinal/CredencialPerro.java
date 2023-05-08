/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.samantha.proyectofinal;

/**
 *
 * @author huchi
 */
import java.util.Scanner;

public class CredencialPerro {

    //atributos
    private String nombrePersona;
    private String direccion;
    private float numero;
    private String nombre;
    private String raza;
    private String color;
    private String hobbies;
    private int edad;
    private String sexo;

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getHobbies() {
        return hobbies;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Credencial{"
                + ", nombrePersona=" + nombrePersona
                + ", direccion=" + direccion
                + ", numero=" + numero
                + "nombre=" + nombre
                + ", raza=" + raza
                + ", color=" + color
                + ", hobbies=" + hobbies
                + ", edad=" + edad
                + ", sexo=" + sexo + '}';
    }
}
