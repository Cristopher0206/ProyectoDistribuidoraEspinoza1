/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistrespinoza1.pkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cris
 */
public class ListaDEnlazadaTest {
    
    public ListaDEnlazadaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCabecera method, of class ListaDEnlazada.
     */
    @Test
    public void testGetCabecera() {
        System.out.println("getCabecera");
        ListaDEnlazada instance = new ListaDEnlazada();
        NodoEmpleadoLista expResult = null;
        NodoEmpleadoLista result = instance.getCabecera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabecera method, of class ListaDEnlazada.
     */
    @Test
    public void testSetCabecera() {
        System.out.println("setCabecera");
        NodoEmpleadoLista cabecera = null;
        ListaDEnlazada instance = new ListaDEnlazada();
        instance.setCabecera(cabecera);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class ListaDEnlazada.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        ListaDEnlazada instance = new ListaDEnlazada();
        String expResult = "";
        String result = instance.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarOrdenado method, of class ListaDEnlazada.
     */
    @Test
    public void testInsertarOrdenado() {
        System.out.println("insertarOrdenado");
        Empleado empleado = null;
        ListaDEnlazada instance = new ListaDEnlazada();
        instance.insertarOrdenado(empleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEmpleado method, of class ListaDEnlazada.
     */
    @Test
    public void testObtenerEmpleado() {
        System.out.println("obtenerEmpleado");
        String codigo = "";
        ListaDEnlazada instance = new ListaDEnlazada();
        String expResult = "";
        String result = instance.obtenerEmpleado(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizaFichero method, of class ListaDEnlazada.
     */
    @Test
    public void testActualizaFichero() {
        System.out.println("actualizaFichero");
        ListaDEnlazada instance = new ListaDEnlazada();
        instance.actualizaFichero();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarTokens method, of class ListaDEnlazada.
     */
    @Test
    public void testGenerarTokens() {
        System.out.println("generarTokens");
        NodoEmpleadoLista actual = null;
        ListaDEnlazada instance = new ListaDEnlazada();
        String expResult = "";
        String result = instance.generarTokens(actual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
