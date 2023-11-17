package Entidades;

import Ventanas.VentPrincipal;
import Ventanas.VentTarjeta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author SetLopez1999
 */
public class Comandos {

    
    public VentTarjeta vent_tarjeta;
    public BIBLIOTECA biblioteca = new BIBLIOTECA();
    public List<String> favs;
    
    public int x;
    public int y;

    public int Xmouse;
    public int Ymouse;
    
    public JLabel temaActual;
    public JLabel subtemaActual;
    public JLabel tarjetaActual;
    
    public int tema_index;
    public int tarjeta_index;

    public Comandos() {
    }

    //Comandos para sombrear el boton cuando el cursor esta encima
    public void BotonSeleccionado(JLabel e, JPanel ventana) {
        e.setBackground(new java.awt.Color(0, 50, 100, 100));
        ventana.repaint();
    }
    public void BotonNoSeleccionado(JLabel e, JPanel ventana) {
        e.setBackground(new java.awt.Color(0, 50, 100, 0));
        ventana.repaint();
    }
    
    //Comandos para la barra superior de las ventanas
    public void GuardamosPosMouse(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void MovemosPosVentana(JFrame ventana, int Xmouse,int Ymouse){
        ventana.setLocation(Xmouse-x,Ymouse-y);
    }
    
    
    
    public void GuardarTajetaActual(
            JLabel temaActual,JLabel subtemaActual,JLabel tarjetaActual){
        this.temaActual = temaActual;
        this.subtemaActual = subtemaActual;
        this.tarjetaActual = tarjetaActual;
        
    }
    public void ActualizarTarjeta(VentTarjeta padre,int tema,int indice){
        
        
        //Ponemos el tema
        temaActual.setText(padre.biblioteca.getTema(tema).getNombre());
        //Ponemos el subtema
        subtemaActual.setText(
                padre.biblioteca.getTarjeta(
                        tema, indice).getNombre());
        //Ponemos la definicion
        tarjetaActual.setText(
                padre.biblioteca.getTarjeta(
                        tema, indice).getDefinicion());
        //tarjetaActual.setBorder(BorderFactory.createEmptyBorder(50, 50, 3,3));//////////////////
        
        //guardamos los indices
        this.vent_tarjeta = padre;
        tema_index = tema;
        tarjeta_index = indice;
        padre.repaint();
    }
    public void MoverTarjeta(VentTarjeta tarjetaActual,int x){
        //Sacamos los limites de los temas y las tarjetas
        int max_subtema = biblioteca.getTema(tema_index).getSubtemas().size();
        int max_temas = biblioteca.getTemas().size();
        
        if(tarjeta_index == 3)
            ObtenerIndice();
        //Verficamos si sumando 1 al index no supera a las tarjetas que hay
        if((tarjeta_index + x) < max_subtema && (tarjeta_index + x) > -1 ){
            
            ActualizarTarjeta(tarjetaActual, tema_index, tarjeta_index+x);
        }
        else if(tema_index +x < max_temas && (tema_index + x) > -1){
            //Si supero pasamos al siguiente tema
            
            if(x == 1){
                tarjeta_index = 0;
            }
            else{
                max_subtema = biblioteca.getTema(tema_index+x).getSubtemas().size();
                tarjeta_index = max_subtema-1;
            }
            
            ActualizarTarjeta(tarjetaActual, tema_index+x, tarjeta_index);
        }
        else{
            //Esta en la tarjetafinal
            // no hacemos nada
        }
        tarjetaActual.repaint();
    }
    
    
    public String ObtenerIndice(){
        String t = (tema_index+1) + "." +(tarjeta_index+1);
        return t;
    }
    public void GuardarFav(){
        Casual usuarioActual = vent_tarjeta.padre.usuarioActual;
        if(usuarioActual.favoritos.size() < 5){
            usuarioActual.favoritos.add(ObtenerIndice());
            
            JOptionPane.showMessageDialog(
                    vent_tarjeta, 
                    "Agregado al slot "+ usuarioActual.favoritos.size());
            vent_tarjeta.padre.ActualizarFavs();
        }
        else{
            JOptionPane.showMessageDialog(vent_tarjeta, "La lista de fav esta llena");
        }
    }
    
    public void setFavoritos(List<String> a){
        this.favs = a;
    }
    public void MostrarFavoritos(JLabel a,JLabel b,JLabel c,JLabel d,JLabel e){
        
            a.setText(favs.get(0));
            if(favs.size()<2)
                return;
            b.setText(favs.get(1));
            if(favs.size()<3)
                return;
            c.setText(favs.get(2));
            if(favs.size()<4)
                return;
            d.setText(favs.get(3));
            if(favs.size()<5)
                return;
            e.setText(favs.get(4));
    }
    
    
    //Metodos de JFrames
    public void abrirTarjeta(VentPrincipal padre,int tema, int indice){
        VentTarjeta tarjetas = new VentTarjeta(padre,tema,indice);
    }
    
    
    
    public boolean abrirFavoritos(VentPrincipal padre,JLabel fav){
        if(fav.getText().equals("libre"))
            return false;
        //Sacamos el indice
        String tema = fav.getText().substring(0,1);
        String indice = fav.getText().substring(2);
        abrirTarjeta(padre, 
                Integer.parseInt(tema)-1, Integer.parseInt(indice)-1);
        return true;
    }
    
    
    
    public void borrarFav(Casual user){
        user.favoritos = new ArrayList<>();
        
    }
    public void VaciarFavoritos(JLabel a,JLabel b,JLabel c,JLabel d,JLabel e){
        a.setText("libre");
        b.setText("libre");
        c.setText("libre");
        d.setText("libre");
        e.setText("libre");
        
    }
    
    
    
    public void CambiarVistaPass(
            JLabel ojo,JLabel ojo2,JPasswordField pass,boolean visible){
        
        
        ojo.setVisible(false);
        ojo2.setVisible(true);
        //ahora si se ve
        if(visible){
            pass.setEchoChar('•');
            return;
        }
        pass.setEchoChar('\u0000');
    }
    
    public void Salir(JFrame cerrar_vent,JFrame abrir_vent){
        cerrar_vent.dispose();
        abrir_vent.setVisible(true);
    }
    public void Vaciar(JPasswordField txtContraseña,
            JTextField txtUsuario,
            JLabel Mensaje){
        txtContraseña.setText("");
        txtUsuario.setText("");
        Mensaje.setText("");
        txtUsuario.grabFocus();
    }
    
    public void TerminarProceso(){
        System.exit(0);
    }
    public String ExtraerPass(char[] xd){
        String contra="";
        //Obtenemos la contraseña
        for(int i = 0 ; i< xd.length ;i++){
            contra += xd[i];
        }  
        return contra;
    }
}
