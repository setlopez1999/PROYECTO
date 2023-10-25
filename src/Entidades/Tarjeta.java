/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ESTUDIANTE
 */
public class Tarjeta {
    
    String nombre;
    String definicion;

    public Tarjeta(String nombre, String definicion) {
        this.nombre = nombre;
        this.definicion = definicion;
    }
    
    // Método para verificar la relación reflexiva
    public boolean esIgual(Tarjeta otraTarjeta) {
        if (this == otraTarjeta) {
            return true;
        }
        return false;
    }
    
    
    
    public void MostrarDatos(){
        
    }
}
