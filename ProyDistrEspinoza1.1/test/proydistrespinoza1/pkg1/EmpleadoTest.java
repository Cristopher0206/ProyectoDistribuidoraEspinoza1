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
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
     * Test of getCodigo method, of class Empleado.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Empleado instance = new Empleado("VD-0001","Cristopher","Perez","Vendedor","1","Benito Linares","cris@gmail.com","0983007423");
        String expResult = "VD-0001";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Empleado.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Empleado instance = new Empleado();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Empleado.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Empleado.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Empleado instance = new Empleado();
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargo method, of class Empleado.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCargo method, of class Empleado.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        Empleado instance = new Empleado();
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimaSucursal method, of class Empleado.
     */
    @Test
    public void testGetUltimaSucursal() {
        System.out.println("getUltimaSucursal");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getUltimaSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUltimaSucursal method, of class Empleado.
     */
    @Test
    public void testSetUltimaSucursal() {
        System.out.println("setUltimaSucursal");
        String ultimaSucursal = "";
        Empleado instance = new Empleado();
        instance.setUltimaSucursal(ultimaSucursal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Empleado.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Empleado.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Empleado instance = new Empleado();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Empleado.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Empleado.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Empleado instance = new Empleado();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumTelf method, of class Empleado.
     */
    @Test
    public void testGetNumTelf() {
        System.out.println("getNumTelf");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNumTelf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumTelf method, of class Empleado.
     */
    @Test
    public void testSetNumTelf() {
        System.out.println("setNumTelf");
        String numTelf = "";
        Empleado instance = new Empleado();
        instance.setNumTelf(numTelf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esCodigoValido method, of class Empleado.
     */
    @Test
    public void testEsCodigoValido() {
        System.out.println("esCodigoValido");
        String codigo = "";
        boolean expResult = false;
        boolean result = Empleado.esCodigoValido(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarDigitos method, of class Empleado.
     */
    @Test
    public void testGenerarDigitos() {
        System.out.println("generarDigitos");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.generarDigitos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esNombreValido method, of class Empleado.
     */
    @Test
    public void testEsNombreValido() {
        System.out.println("esNombreValido");
        String nombre = "";
        Empleado instance = new Empleado();
        boolean expResult = false;
        boolean result = instance.esNombreValido(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esApellidoValido method, of class Empleado.
     */
    @Test
    public void testEsApellidoValido() {
        System.out.println("esApellidoValido");
        String apellido = "";
        Empleado instance = new Empleado();
        boolean expResult = false;
        boolean result = instance.esApellidoValido(apellido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esDireccionValida method, of class Empleado.
     */
    @Test
    public void testEsDireccionValida() {
        System.out.println("esDireccionValida");
        String direccion = "";
        Empleado instance = new Empleado();
        boolean expResult = false;
        boolean result = instance.esDireccionValida(direccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esCorreoValido method, of class Empleado.
     */
    @Test
    public void testEsCorreoValido() {
        System.out.println("esCorreoValido");
        String correo = "";
        Empleado instance = new Empleado();
        boolean expResult = false;
        boolean result = instance.esCorreoValido(correo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esTelefonoValido method, of class Empleado.
     */
    @Test
    public void testEsTelefonoValido() {
        System.out.println("esTelefonoValido");
        String telefono = "";
        Empleado instance = new Empleado();
        boolean expResult = false;
        boolean result = instance.esTelefonoValido(telefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Empleado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
