package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Casual extends Usuario{
    
    List<Tema> temas_recientes;
    List<String> favoritos = new ArrayList<>();
    String rango = "Estandar";
    public Casual(String nombre, String contraseña, String dni) {
        super(nombre,contraseña,dni); 
        
    }
    
    @Override
    public boolean esIgual(Usuario otroUsuario) {
        if (this == otroUsuario) {
            return true;
        }
        return false;
    }
    
    @Override
    public String Mostrar(){
        String texto = nombre+" - "+ dni + " - " + rango;
        return texto;
    }

    public List<Tema> getTemas_recientes() {
        return temas_recientes;
    }
    public void setTemas_recientes(List<Tema> temas_recientes) {
        this.temas_recientes = temas_recientes;
    }

    public List<String> getFavoritos() {
        return favoritos;
    }
    public void setFavoritos(List<String> favoritos) {
        this.favoritos = favoritos;
    }

}
