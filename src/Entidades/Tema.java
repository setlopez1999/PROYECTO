/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getTerminos() {
        return terminos;
    }

    public void setTerminos(List<String> terminos) {
        this.terminos = terminos;
    }

    public List<Tarjeta> getSubtemas() {
        return subtemas;
    }

    public void setSubtemas(List<Tarjeta> subtemas) {
        this.subtemas = subtemas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
    
    
    
}
