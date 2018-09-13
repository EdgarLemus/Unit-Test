/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.Calendar;

/**
 *
 * @author LENOVO
 */
public class Personas {
    
    /*-Las variables se escriben en minusculas por buena codificación
       Solo se escriben en mayusculas cuando se maneja static final
      -Ya que las variables solo le interesa a la clase Personas es recomendable hacerlas privadas*/
    private String nombre;
    private String apellido;
    private int edad;
    
    /*El float se hubiera manejado de dos maneras si la variable edad de la clase
    fuera float ó si dentro del contructor se maneja el cambio de la variable
    ejemplo: this.edad = Intenger.parseInt(edad).*/
    public Personas(String nombre, String apellido, int edad) {
        /*Para asignarle los datos mediante el constructor de la clase
        se maneja el "this.variable" */
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    /*No afecta en nada pero es bueno crear los Getter y Setter para el manejo 
    de los atributos de la clase en otras clases*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /*Al momento de nombrar una funcion con un nombre algo largo
    lo recomendable es que la primera palabra sea en minuscula y la segunda su primera letra
    sea en mayuscula 
    Ejemplo: comprarCarro ó comprarCarroTodoTerreno*/
    public String presentarPersona()
    {
        /*Para manejar los datos de la variables de la clase es mejor manejarlo con 
        this.variable*/
        return "Hola soy " + this.nombre + " " + this.apellido + " de edad: " + this.edad; 
    }
    
    /*Recomiendo que al momento de realizar una operacion matematica no utilizar variable diferente
    a tipo numerico.*/
    public int calcularAñoNacimiento()
    {
        /*Utilice metodos de la clase Calendar para manejar el año actual*/
        Calendar calendar = Calendar.getInstance();
        int añoActual = calendar.get(calendar.YEAR);
        return añoActual - this.edad;
    }
}
