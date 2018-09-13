/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.Test;
import static org.junit.Assert.*;
import personas.Personas;

/**
 *
 * @author LENOVO
 */
public class TestPersonas {
    
    public TestPersonas() {
    }
    
    Personas personas = new Personas("Edgar Duvan", "Lemus Ramos", 22);
    
    @Test
    public void probarPresentarAUnaPersona()
    {
        String resultado = personas.presentarPersona();
        String resultadoEsperado = "Hola soy Edgar Duvan Lemus Ramos de edad: 22";
        assertEquals(resultadoEsperado, resultado);        
    }
    
    @Test
    public void probarcalcularAñoNacimientoDeUnaPersona()
    {
        int resultado = personas.calcularAñoNacimiento();
        int resultadoEsperado = 1996;
        assertEquals(resultadoEsperado, resultado);
    }
}
