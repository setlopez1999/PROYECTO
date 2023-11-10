/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author ESTUDIANTE
 */
public class BIBLIOTECA {

    String nombre;
    List<Tema> temas;

    //Creamos la biblioteca con datos inicializados
    public BIBLIOTECA() {
        
        CrearBiblioteca();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tema> getTemas() {
        return temas;
    }
    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }
    
    public Tema getTema(int index){
        return temas.get(index);
    }
    
    public Tarjeta getTarjeta(int index_tema,int index){
        return temas.get(index_tema).getSubtemas().get(index);
    }
    
    
    
    
    
    
    //Creamos el indice segun la biblioteca
    public DefaultListModel CrearIndice(){
        DefaultListModel modelo = new DefaultListModel<>();
        int fila = 0 ;
        int num_tema = 1;
        //lista.setModel(modelo);
        modelo.add(fila, "INDICE");
        fila++;
        for(int i = 0 ;i<temas.size();i++){
            //sacamos el nombre del tema
            String tema = (i+1)+". "+temas.get(i).getNombre();
            modelo.add(fila, "    "+tema);
            fila++;
            //Sacamos su lista de subtemas
            List<Tarjeta> subtemas = temas.get(i).getSubtemas();
            for(int j = 0 ; j<subtemas.size(); j++){
                String subtema = (i+1)+"."+(j+1)+" "+subtemas.get(j).getNombre();
                //Agregamos cada subtema
                modelo.add(fila, "        "+subtema);
                fila++;
            }
        }
        //ahora agregamos el modelo en el modelo de la lista
        return modelo;
    }
    //crear glosario
    public DefaultListModel CrearGlosario(Tema tema,int num_tema){
        DefaultListModel modelo = new DefaultListModel<>();
        
        int fila = 0 ;       
        modelo.add(fila, "GLOSARIO");
        fila++;
        
        //sacamos el tema
        String tema_texto = tema.getNombre();
        modelo.add(fila, num_tema+". "+tema_texto);
        fila++;
        //Sacamos su lista de terminos
        List<String> terminos = tema.getTerminos();
        for(int j = 0 ; j<terminos.size(); j++){
            String termino = num_tema+"."+(j+1)+" "+terminos.get(j);
            //Agregamos cada subtema
            modelo.add(fila, "        "+termino);
            fila++;
        }
        
        //ahora agregamos el modelo en el modelo de la lista
        return modelo;
    }
    
    //Creamos la biblioteca
    public void CrearBiblioteca(){
        //Creamos la lista de temas de la biblioteca
        List<Tema> tema_biblioteca1 = new ArrayList<>();
        
        //Agregamos los temas
        tema_biblioteca1.add(CrearTema1());
        tema_biblioteca1.add(CrearTema2());
        tema_biblioteca1.add(CrearTema3());
        tema_biblioteca1.add(CrearTema4());
        
        //agregamos los temas y el nombre
        this.nombre = "Informacion Tributaria";
        this.temas = tema_biblioteca1;
    }
    
    //tema1
    public Tema CrearTema1() {
        //Creamos la lista de terminos
        List<String> terminos = new ArrayList<>();
        terminos.add("1");
        terminos.add("2");
        terminos.add("3");
        terminos.add("4");

        //Creamos las tarjetas y los ponemos en una lista
        String tarjeta1_nombre = "Situacion Actual";
        
        //Agregar para margen → style='margin: 10px;'          despues del body
        String tarjeta1_definicion = 
                "<html><body style='margin: 10px;'>"
                + "El aspecto tributario en el Perú ha tenido algunos cambios<br/> "
                + "imprevistos en los últimos años, debidos a factores externos,<br/>"
                + "por lo tanto, el Gobierno del Perú ha dispuesto medidas para<br/>"
                + "contrarrestar dichos cambios, sin embargo, la mayoría de los <br/>"
                + "especialistas y la población han llegado a la conclusión de <br/>"
                + "que no son suficientes, como lo veremos a continuación: </body></html>";
        Tarjeta tarjeta1 = new Tarjeta(tarjeta1_nombre, tarjeta1_definicion);

        String tarjeta2_nombre = "titulo 2";
        String tarjeta2_definicion = 
                "<html><body style='margin: 10px;' >"
                + "El gobierno ha implementado medidas tributarias para mitigar <br/>"
                + "el impacto de la crisis, como la ampliación de plazos, <br/>"
                + "la reducción de tasas, la devolución de impuestos y <br/>"
                + "el programa Reactiva Perú, que ofrece créditos garantizados <br/>"
                + "por el Estado a las empresas. Sin embargo, estas medidas <br/>"
                + "son insuficientes para reactivar la economía y generar <br/>"
                + "una mayor recaudación.</body></html>";
        Tarjeta tarjeta2 = new Tarjeta(tarjeta2_nombre, tarjeta2_definicion);

        String tarjeta3_nombre = "titulo 3";
        String tarjeta3_definicion = "parrafo 3";
        Tarjeta tarjeta3 = new Tarjeta(tarjeta3_nombre, tarjeta3_definicion);

        String tarjeta4_nombre = "titulo 4";
        String tarjeta4_definicion = "parrafo 4";
        Tarjeta tarjeta4 = new Tarjeta(tarjeta4_nombre, tarjeta4_definicion);

        //creamos la lista
        List<Tarjeta> listaTarjetas_tema1 = new ArrayList<>();
        listaTarjetas_tema1.add(tarjeta1);
        listaTarjetas_tema1.add(tarjeta2);
        listaTarjetas_tema1.add(tarjeta3);
        listaTarjetas_tema1.add(tarjeta4);

        //Creamos el nombre del tema 1
        String nombre = "Actualidad del peru";
        //Y el estado
        int estado = 0;
        Tema tema1 = new Tema(nombre, terminos, listaTarjetas_tema1, estado);

        //tema1 Listo
        return tema1;
    }
    //tema2
    public Tema CrearTema2() {
        //Creamos la lista de terminos
        List<String> terminos = new ArrayList<>();
        terminos.add("1");
        terminos.add("2");
        terminos.add("3");
        terminos.add("4");

        //Creamos las tarjetas y los ponemos en una lista
        String tarjeta1_nombre = "titulo 1";
        String tarjeta1_definicion = "parrafo 1";
        Tarjeta tarjeta1 = new Tarjeta(tarjeta1_nombre, tarjeta1_definicion);

        String tarjeta2_nombre = "titulo 2";
        String tarjeta2_definicion = "parrafo 2";
        Tarjeta tarjeta2 = new Tarjeta(tarjeta2_nombre, tarjeta2_definicion);

        String tarjeta3_nombre = "titulo 3";
        String tarjeta3_definicion = "parrafo 3";
        Tarjeta tarjeta3 = new Tarjeta(tarjeta3_nombre, tarjeta3_definicion);

        String tarjeta4_nombre = "titulo 4";
        String tarjeta4_definicion = "parrafo 4";
        Tarjeta tarjeta4 = new Tarjeta(tarjeta4_nombre, tarjeta4_definicion);

        //creamos la lista
        List<Tarjeta> listaTarjetas_tema2 = new ArrayList<>();
        listaTarjetas_tema2.add(tarjeta1);
        listaTarjetas_tema2.add(tarjeta2);
        listaTarjetas_tema2.add(tarjeta3);
        listaTarjetas_tema2.add(tarjeta4);

        //Creamos el nombre del tema 1
        String nombre = "Inicio a la Formalidad";
        //Y el estado
        int estado = 0;
        Tema tema2 = new Tema(nombre, terminos, listaTarjetas_tema2, estado);

        //tema2 Listo
        return tema2;
    }
    //tema3
    public Tema CrearTema3(){
        //Creamos la lista de terminos
        List<String> terminos =  new ArrayList<>();
        terminos.add("1");
        terminos.add("2");
        terminos.add("3");
        terminos.add("4");
        
        //Creamos las tarjetas y los ponemos en una lista
        String tarjeta1_nombre = "titulo 1";
        String tarjeta1_definicion = "parrafo 1";
        Tarjeta tarjeta1 = new Tarjeta(tarjeta1_nombre, tarjeta1_definicion);

        String tarjeta2_nombre = "titulo 2";
        String tarjeta2_definicion = "parrafo 2";
        Tarjeta tarjeta2 = new Tarjeta(tarjeta2_nombre, tarjeta2_definicion);

        String tarjeta3_nombre = "titulo 3";
        String tarjeta3_definicion = "parrafo 3";
        Tarjeta tarjeta3 = new Tarjeta(tarjeta3_nombre, tarjeta3_definicion);

        String tarjeta4_nombre = "titulo 4";
        String tarjeta4_definicion = "parrafo 4";
        Tarjeta tarjeta4 = new Tarjeta(tarjeta4_nombre, tarjeta4_definicion);

        //creamos la lista
        List<Tarjeta> listaTarjetas_tema3 = new ArrayList<>();
        listaTarjetas_tema3.add(tarjeta1);
        listaTarjetas_tema3.add(tarjeta2);
        listaTarjetas_tema3.add(tarjeta3);
        listaTarjetas_tema3.add(tarjeta4);
        
        //Creamos el nombre del tema 1
        String nombre = "Requisitos para formalizar";
        //Y el estado
        int estado = 0;
        Tema tema3 = new Tema(nombre, terminos, listaTarjetas_tema3, estado);
        
        //tema1 Listo
        return tema3;
    }
    //tema4
    public Tema CrearTema4(){
        //Creamos la lista de terminos
        List<String> terminos =  new ArrayList<>();
        terminos.add("1");
        terminos.add("2");
        terminos.add("3");
        terminos.add("4");
        
        //Creamos las tarjetas y los ponemos en una lista
        String tarjeta1_nombre = "titulo 1";
        String tarjeta1_definicion = "parrafo 1";
        Tarjeta tarjeta1 = new Tarjeta(tarjeta1_nombre, tarjeta1_definicion);

        String tarjeta2_nombre = "titulo 2";
        String tarjeta2_definicion = "parrafo 2";
        Tarjeta tarjeta2 = new Tarjeta(tarjeta2_nombre, tarjeta2_definicion);

        String tarjeta3_nombre = "titulo 3";
        String tarjeta3_definicion = "parrafo 3";
        Tarjeta tarjeta3 = new Tarjeta(tarjeta3_nombre, tarjeta3_definicion);

        String tarjeta4_nombre = "titulo 4";
        String tarjeta4_definicion = "parrafo 4";
        Tarjeta tarjeta4 = new Tarjeta(tarjeta4_nombre, tarjeta4_definicion);

        //creamos la lista
        List<Tarjeta> listaTarjetas_tema4 = new ArrayList<>();
        listaTarjetas_tema4.add(tarjeta1);
        listaTarjetas_tema4.add(tarjeta2);
        listaTarjetas_tema4.add(tarjeta3);
        listaTarjetas_tema4.add(tarjeta4);
        
        //Creamos el nombre del tema 1
        String nombre = "Como tributar mi empresa";
        //Y el estado
        int estado = 0;
        Tema tema4 = new Tema(nombre, terminos, listaTarjetas_tema4, estado);
        
        //tema1 Listo
        return tema4;
    }
    
}
