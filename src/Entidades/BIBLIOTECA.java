package Entidades;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

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
        //tema_biblioteca1.add(CrearTema4());
        
        //agregamos los temas y el nombre
        this.nombre = "Informacion Tributaria";
        this.temas = tema_biblioteca1;
    }
    
    //tema1
    public Tema CrearTema1() {
        //Creamos la lista de terminos
        List<String> terminos = new ArrayList<>();
        terminos.add("Medidas Tributarias Fallidas");
        terminos.add("Informalidad");
        terminos.add("Microempresas");
        terminos.add("Regulaciones");

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
                + "que no son suficientes. </body></html>";
        Tarjeta tarjeta1 = new Tarjeta(tarjeta1_nombre, tarjeta1_definicion);

        String tarjeta2_nombre = "Situacion Actual";
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

        String tarjeta3_nombre = "Causas";
        String tarjeta3_definicion = 
                "<html><body style='margin: 10px;' >"
                + "La informalidad suele estar originada en varios factores <br/>"
                + "tanto de la población como del mismo sistema de formalización,<br/>"
                + "siendo demasiado exigentes y no viendo las perspectivas <br/>"
                + "de las microempresas que son gran parte de las empresas del pais. <br/>"
                + "Así mismo la manera de transmitir los lineamientos <br/>"
                + "suele ser complicados para algunos, o simplemente<br/> "
                + "no les llega la información por falta de recursos. </body></html>";
        Tarjeta tarjeta3 = new Tarjeta(tarjeta3_nombre, tarjeta3_definicion);

        String tarjeta4_nombre = "Consecuencias";
        String tarjeta4_definicion = 
                "<html><body style='margin: 10px;' >"
                + "Esta ola de informalidad si bien ayuda a un montón de gente <br/>"
                + "a subsistir día a día, a la larga perjudica tanto <br/>"
                + "al consumidor como al vendedor. <br/>"
                + "Es un problema que abarca al Perú, y sin regulaciones <br/>"
                + "es imposible regular las condiciones laborales, controlar<br/>"
                + " el saneamiento de los servicios o productos que se comercializan. <br/>"
                + "Esto puede derivar a estafas, peligros de salud, <br/>"
                + "y surgimiento de injusticias laborales.</body></html>";
        Tarjeta tarjeta4 = new Tarjeta(tarjeta4_nombre, tarjeta4_definicion);
        
        String tarjeta5_nombre = "Conclusion";
        String tarjeta5_definicion = 
                "<html><body style='margin: 10px;' >"
                + "Debido a todo lo anterior, se busco una manera de sintetizar <br/>"
                + "y ayudar, especialmente a las empresas mype.<br/> "
                + "Brindándoles un software capaz de tener la información<br/> "
                + "necesaria para empezar su empresa de manera formal, tributar, etc. </body></html>";
        Tarjeta tarjeta5 = new Tarjeta(tarjeta5_nombre, tarjeta5_definicion);
        
        
        //creamos la lista
        List<Tarjeta> listaTarjetas_tema1 = new ArrayList<>();
        listaTarjetas_tema1.add(tarjeta1);
        listaTarjetas_tema1.add(tarjeta2);
        listaTarjetas_tema1.add(tarjeta3);
        listaTarjetas_tema1.add(tarjeta4);
        listaTarjetas_tema1.add(tarjeta5);

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
        terminos.add("SUNAT");
        terminos.add("Clave Sol");
        terminos.add("RUC");
        terminos.add("Minuta");
        terminos.add("Nombre");
        terminos.add("Razon Social");
        terminos.add("Licencia");
        terminos.add("Acto Constitutivo");
        terminos.add("Escritura Publica");
        terminos.add("Persona Juridica");
        terminos.add("Persona Natural");
        terminos.add("Formalizacion");

        //Creamos las tarjetas y los ponemos en una lista
        String tarjeta1_nombre = "Requerimientos";
        String tarjeta1_definicion = "<html><body style='margin: 10px;'>"
                + "La formalidad tributaria es un proceso que implica cumplir <br/>"
                + "con una serie de requisitos y obligaciones ante<br/> "
                + "la Superintendencia Nacional de Aduanas y de Administración <br/>"
                + "Tributaria (SUNAT) y otras entidades públicas.<br/> "
                + "Que permite a los microempresarios acceder a beneficios como <br/>"
                + "la seguridad social, el crédito, la protección legal y el <br/>"
                + "desarrollo empresarial.<br/>" +
                  "Para eso los microempresarios deben contar con los siguientes requisitos:<br/>" +
                  "  1.	Razón social o tipo de empresa<br/>" +
                  "  2.	Clave sol<br/>" +
                  "  3.	Ruc<br/>" +
                  "  4.	Minuta<br/>" +
                  "  5.	Reserva el nombre<br/>" +
                  "  6.	Licencia de funcionamiento</body></html>";
        
        Tarjeta tarjeta1 = new Tarjeta(tarjeta1_nombre, tarjeta1_definicion);

        String tarjeta2_nombre = "Razon Social - Denominacion - Tipo de empresa";
        String tarjeta2_definicion = "<html><body style='margin: 10px;'>"
                + "Lo primero, seria determinar de qué forma se quiere integrar al mercado formal.<br/>" +
                "                                                                              <br/>"
                + "   -	Constituyendo una empresa Unipersonal con una Persona Natural, o<br/>" +
                "   -	Constituyendo una empresa como persona jurídica (SA,SAC,EIRL, etc)<br/>"
                + "<br/>"+
                "La diferencia entre persona radica en que la Natural es en si cualquier ser humano <br/>"
                + "capaz de adquirir derechos y varias obligaciones. En cambio, una persona jurídica <br/>"
                + "es en si una entidad creada mediante la ley capaz de adquirir derechos <br/>"
                + "y capital a su nombre.<br/>" +
                "<br/>"
                + "En otras palabras, crear una empresa con una persona natural <br/>"
                + "seria crear una empresa de tu persona como propiedad, y con la jurídica <br/>"
                + "crear una entidad por ley de la cual uno se encarga de administrar.<br/>"
                + "¡ Al tipo de empresa también se le dice Razón social o denominación.<br/>"
                + "</body></html>";
        Tarjeta tarjeta2 = new Tarjeta(tarjeta2_nombre, tarjeta2_definicion);

        String tarjeta3_nombre = "Razon Social - Denominacion - Tipo de empresa";
        String tarjeta3_definicion = "<html><body style='margin: 10px;'>"
                + "" +
                "Los tipos de empresa según persona jurídica son los siguientes:<br/>" +
                "-	Sociedad por Acciones Cerrada Simplificada<br/>" +
                "-	Sociedad Anónima<br/>" +
                "-	Sociedad Anónima Cerrada<br/>" +
                "-	Sociedad Anónima Abierta<br/>" +
                "-	Sociedad Comercial de Responsabilidad Limitada<br/>" +
                "-	Empresa Individual de Responsabilidad Tributaria.<br/>" +
                "Entre los tipos de razón social que tenemos nos conviene escoger<br/> "
                + "el que mejor se nos adapte a nuestra situación al momento de constituir la empresa. <br/>  "
                + "En particular nos escogeremos la EIRL, debido a que los accionistas son solo<br/>  "
                + "una persona, aunque también a causa de tener mas socios, escoger la SAC puede<br/> "
                + "ser buena opción ya que es uno de los tipos de empresa que mas abunda en el Perú.<br/>"
                + "<br/>"
                + "¡ La EIRL a diferencia de los otros tipos que se rigen por "
                + "la ley n°26887, se rige por la ley n°21621.<br/>"
                + "</body></html>";
        Tarjeta tarjeta3 = new Tarjeta(tarjeta3_nombre, tarjeta3_definicion);

        
        String tarjeta4_nombre = "Clave Sol";
        String tarjeta4_definicion = "<html><body style='margin: 10px;'>"
                + "La clave sol es un nuevo sistema del estado que sirve para facilitar <br/>"
                + "los tramites dando la posibilidad de efectuarlos digitalmente. <br/>"
                + "En este caso la clave sol se obtiene en la misma pagina web <br/>"
                + "de la sunat donde tendrás que brindar tu correo y celular.<br/>"
                + "</body></html>";
        Tarjeta tarjeta4 = new Tarjeta(tarjeta4_nombre, tarjeta4_definicion);

        String tarjeta5_nombre = "RUC con Persona Juridica";
        String tarjeta5_definicion = "<html><body style='margin: 10px;'>"
                + "Para crear un RUC para una persona jurídica se tiene que<br/> "
                + "inscribir en la Plataforma Sistema de Intermediación Digital <br/>"
                + "operado por la Sunarp, la cual te brindara un numero RUC inactivo <br/>"
                + "el cual activaras con el clave sol que creaste posteriormente.<br/></body></html>";
        Tarjeta tarjeta5 = new Tarjeta(tarjeta5_nombre, tarjeta5_definicion);

        String tarjeta6_nombre = "La Minuta";
        String tarjeta6_definicion = "<html><body style='margin: 10px;'>"
                + "Otro documento importante es el acto constitutivo, también<br/> "
                + "conocido como minuta, el cual es un documento donde los socios <br/>"
                + "de una sociedad manifiestan su voluntad de constituir<br/> "
                + "una empresa y donde se plasman todos los acuerdos y estatutos.<br/>" +
                    "-	2 copias del DNI de todos los socios<br/>" +
                    "-	2 copias del documento por reserva de nombre<br/>" +
                    "-	Documento con el capital de bienes del negocio<br/>" +
                    "-	Declaración jurada y fecha de solicitud de constitución de empresas.</body></html>";
        Tarjeta tarjeta6 = new Tarjeta(tarjeta6_nombre, tarjeta6_definicion);

        String tarjeta7_nombre = "Reserva del nombre";
        String tarjeta7_definicion = "<html><body style='margin: 10px;'>"
                + "Este no es obligatorio, pero si recomendable pues facilita la inscripción. <br/>" +
                "Se verificará que el nombre solicitado este sin uso, y <br/>"
                + "se pedirá la razón social.<br/>" +
                "Y el nombre se reservará por 3 días, después de efectuar el "
                + "pago por tramite de 24 soles.(2023)</body></html>";
        Tarjeta tarjeta7 = new Tarjeta(tarjeta7_nombre, tarjeta7_definicion);

        
        String tarjeta8_nombre = "Gestionar la licencia de funcionamiento";
        String tarjeta8_definicion = "<html><body style='margin: 10px;'>"
                + "Es el documento que autoriza el uso del local donde se <br/>"
                + "desarrolla el negocio. La licencia de funcionamiento se <br/>"
                + "tramita ante la municipalidad distrital correspondiente <br/>"
                + "al domicilio fiscal del negocio. Los requisitos y el costo <br/>"
                + "de la licencia de funcionamiento varían según el tipo <br/>"
                + "de actividad, el tamaño del local, el nivel de riesgo y <br/>"
                + "el grado de compatibilidad con el uso del suelo.</body></html>";
        Tarjeta tarjeta8 = new Tarjeta(tarjeta8_nombre, tarjeta8_definicion);

        
        
        //creamos la lista
        List<Tarjeta> listaTarjetas_tema2 = new ArrayList<>();
        listaTarjetas_tema2.add(tarjeta1);
        listaTarjetas_tema2.add(tarjeta2);
        listaTarjetas_tema2.add(tarjeta3);
        listaTarjetas_tema2.add(tarjeta4);
        listaTarjetas_tema2.add(tarjeta5);
        listaTarjetas_tema2.add(tarjeta6);
        listaTarjetas_tema2.add(tarjeta7);
        listaTarjetas_tema2.add(tarjeta8);
        
        //Creamos el nombre del tema 1
        String nombre = "Requisitos para Formalizarce";
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
        terminos.add("Informalidad");
        terminos.add("Ventajas");
        terminos.add("Peligros");
        terminos.add("Beneficios");
        terminos.add("Guia");
        terminos.add("Abono de Capital");
        
        //Creamos las tarjetas y los ponemos en una lista
        String tarjeta1_nombre = "Ventajas de tener un negocio formal";
        String tarjeta1_definicion = "<html><body style='margin: 10px;' ><br/>"+
        "-	Tendrás la libertad de exponer tu marca legalmente, sin problemas con las autoridades.<br/>" +
        "-	Podrás crecer y emplear gente que obtenga beneficios del Estado.<br/>" +
        "-	Ser formal te permite, además, acceder a préstamos bancarios.<br/>" +
        "-	Formar parte del ecosistema comercial del país y contribuir <br/>"
                + "con el crecimiento de emprendedores y empresarios quienes, <br/>"
                + "como tú, buscan tener estabilidad económica y social.<br/>" +
        "-	Da una mejor imagen para los trabajadores<br/></body></html>";
        Tarjeta tarjeta1 = new Tarjeta(tarjeta1_nombre, tarjeta1_definicion);

        String tarjeta2_nombre = "Peligros de la informalidad";
        String tarjeta2_definicion = "<html><body style='margin: 10px;'>"+
        "-	Como informal tienes una cantidad de clientes limitada. Muchos no podrán trabajar con tu empresa por <br/>"
                + "no ser formal, por ejemplo, el Estado. <br/>" +
        "-	Puedes ser sancionado por no cumplir con los requisitos mínimos de la ley.<br/>" +
        "-	No cuentas con beneficios laborales de las empresas formales, como seguro y seguridad social.<br/>" +
        "-	Otros negocios podrían usar tu nombre y marca, amparados por la ley.<br/>" +
        "-	No puedes acceder a los programas del gobierno ni a sus procesos de contratación.<br/>" +
        "-	No puedes ser proveedor del Estado ni de empresas grandes que exigen que sus proveedores sean formales.</body></html>";
        Tarjeta tarjeta2 = new Tarjeta(tarjeta2_nombre, tarjeta2_definicion);

        String tarjeta3_nombre = "Proceso para constituir una empresa (Persona Jurídica)";
        String tarjeta3_definicion = "<html><body style='margin: 10px;'>"
      + "Recuerden que la formalización tiene que llevarse a cabo los mas pronto a la creacion de la empresa, ya que operar <br/>"
                + "clandestinamente solo aumenta la probabilidad de acumular multas y sanciones. <br/>"
                + "Dejando eso claro, los siguientes pasos nos ayudaran a constituir nuestra empresa:<br/><br/>" +
                    "1.	Búsqueda y reserva de nombre.<br/>" +
                    "El nombre te servirá para reconocer tu marca y deberás pedirlo para reservarlo con un plazo de 30 días hábiles, días<br/>"
                + " en los cuales deberás aprovechar para terminar el proceso de constitución si no quieres perder el nombre reservado.<br/><br/>" +
                    "2.	Elaboración del Acto Constitutivo (Minuta)<br/>" +
                    "En este documento se plasmará los acuerdos, el capital y una declaración jurada que servirá para legalizar y <br/>"
                + "formalizar el negocio. Recuerda que debe ser firmado por un abogado.<br/><br/>" +
                    "3.	Abono de capital y bienes<br/>" +
                    "Cabe mencionar que tendremos que establecer, entre todos los socios, el capital que brindará cada uno como <br/>"
                + "bienes iniciales de la empresa, y que servirá para determinar proporcionalmente la parte de la empresa <br/>"
                + "que le corresponde a cada socio.</body></html>";
        Tarjeta tarjeta3 = new Tarjeta(tarjeta3_nombre, tarjeta3_definicion);

        String tarjeta4_nombre = "Proceso para constituir una empresa (Persona Jurídica)";
        String tarjeta4_definicion = "<html><body style='margin: 10px;'>"
                +   "4.	Elaboración de Escritura Pública<br/>" +
                "Es el siguiente paso después de la minuta. Esta la obtenemos al llevar la minuta a un notario el cual lo elevara<br/>"
                + " a Escritura Pública. Este documento debe ser firmado por los todos los socios y el notario para que sea válido.<br/><br/>" +
                    "5.	Inscripción en Registros Públicos<br/>" +
                "Aquí es donde nace la persona jurídica de la empresa en el momento en que se inscribe en los registros públicos. <br/>"
                + "Consiste en llevar la Escritura Publica a la SUNARP para su inscripción, proceso del cual se encarga el notario.<br/><br/>" +
                    "6.	Inscripción al RUC para Persona Jurídica<br/>" +
                "Como indicamos en los requisitos este te servirá para llevar operaciones comerciales a nombre de la empresa. <br/>"
                + "Lo podemos obtener en la página SID – SUNARP, el cual nos brindara un Ruc que deberemos activar con la clave sol <br/>"
                + "que obtengamos de la pagina Sunat Virtual o la App Personas.</body></html>";
        Tarjeta tarjeta4 = new Tarjeta(tarjeta4_nombre, tarjeta4_definicion);

        //creamos la lista
        List<Tarjeta> listaTarjetas_tema3 = new ArrayList<>();
        listaTarjetas_tema3.add(tarjeta1);
        listaTarjetas_tema3.add(tarjeta2);
        listaTarjetas_tema3.add(tarjeta3);
        listaTarjetas_tema3.add(tarjeta4);
        
        //Creamos el nombre del tema 1
        String nombre = "Inicio de la formalizacion";
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
        Tema tema4 = new Tema(nombre, terminos, listaTarjetas_tema4, 0);
        //tema1 Listo
        return tema4;
    }
    
}
