/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Administrador
 */
public class Admin extends Usuario{
    int prioridad;
    
    public Admin(String nombre, String contraseña, String dni,int prioridad) {
        super(nombre,contraseña,dni);
        this.prioridad = prioridad;
    }
}
