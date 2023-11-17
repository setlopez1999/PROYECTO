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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }
}
