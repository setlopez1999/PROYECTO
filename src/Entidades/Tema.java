/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Tema {
    String nombre;
    List<String> terminos;
    List<Tarjeta> subtemas;
    int estado;

    public Tema(String nombre, List<String> terminos, List<Tarjeta> subtemas, int estado) {
        this.nombre = nombre;
        this.terminos = terminos;
        this.subtemas = subtemas;
        this.estado = estado;
    }
    
    
}
