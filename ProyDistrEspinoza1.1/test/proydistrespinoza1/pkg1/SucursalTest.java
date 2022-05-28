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
public class SucursalTest {
    
    public SucursalTest() {
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
     * Test of insertarCodigo method, of class Sucursal.
     */
    @Test
    public void testInsertarCodigo() {
        System.out.println("insertarCodigo");
        String codigo = "";
        Sucursal instance = null;
        instance.insertarCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCodigo method, of class Sucursal.
     */
    @Test
    public void testBorrarCodigo() {
        System.out.println("borrarCodigo");
        String info = "";
        Sucursal instance = null;
        instance.borrarCodigo(info);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarEmpleado method, of class Sucursal.
     */
    @Test
    public void testConsultarEmpleado() {
        System.out.println("consultarEmpleado");
        String info = "";
        Sucursal instance = null;
        String expResult = "";
        String result = instance.consultarEmpleado(info);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarEstructura method, of class Sucursal.
     */
    @Test
    public void testMostrarEstructura() {
        System.out.println("mostrarEstructura");
        ListaDEnlazada lista = null;
        Sucursal instance = null;
        String expResult = "";
        String result = instance.mostrarEstructura(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciarArreglo method, of class Sucursal.
     */
    @Test
    public void testVaciarArreglo() {
        System.out.println("vaciarArreglo");
        Sucursal instance = null;
        instance.vaciarArreglo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVacio method, of class Sucursal.
     */
    @Test
    public void testEstaVacio() {
        System.out.println("estaVacio");
        Sucursal instance = null;
        boolean expResult = false;
        boolean result = instance.estaVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
