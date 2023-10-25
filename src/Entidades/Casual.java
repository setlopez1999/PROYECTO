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
public class Casual extends Usuario{
    
    List<Tema> temascursados;
    
    public Casual(String nombre, String contraseña, String dni,List<Tema> temasCursados) {
        super(nombre,contraseña,dni);
        this.temascursados = temasCursados;
    }
    
    @Override
    public boolean esIgual(Usuario otroUsuario) {
        if (this == otroUsuario) {
            return true;
        }
        return false;
    }
}
