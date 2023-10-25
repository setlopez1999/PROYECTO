/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.awt.List;

public abstract class Usuario {
    String nombre;
    String contraseña;
    String dni;

    public Usuario(String nombre, String contraseña, String dni) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    // Método para verificar la relación reflexiva
    public boolean esIgual(Usuario otroUsuario) {
        if (this == otroUsuario) {
            return true;
        }
        return false;
    }
    
    
}
