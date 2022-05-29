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
public class ProductoTest {
    
    public ProductoTest() {
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
     * Test of esCodigoValido method, of class Producto.
     */
    @Test
    public void testEsCodigoValido() {
        System.out.println("esCodigoValido");
        String codigo = "00001";
        Producto instance = new Producto();
        boolean expResult = true;
        boolean result = instance.esCodigoValido(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default 
        // call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of esNombreValido method, of class Producto.
     */
    @Test
    public void testEsNombreValido() {
        System.out.println("esNombreValido");
        String nombre = "Cable HDMI";
        Producto instance = new Producto();
        boolean expResult = true;
        boolean result = instance.esNombreValido(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esFechaValida method, of class Producto.
     */
    @Test
    public void testEsFechaValida() {
        System.out.println("esFechaValida");
        String fecha = "28/05/2022";
        Producto instance = new Producto();
        boolean expResult = true;
        boolean result = instance.esFechaValida(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esPrecioValido method, of class Producto.
     */
    @Test
    public void testEsPrecioValido() {
        System.out.println("esPrecioValido");
        String precio = "50,00";
        Producto instance = new Producto();
        boolean expResult = true;
        boolean result = instance.esPrecioValido(precio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esStockValido method, of class Producto.
     */
    @Test
    public void testEsStockValido() {
        System.out.println("esStockValido");
        String stock = "500";
        Producto instance = new Producto();
        boolean expResult = true;
        boolean result = instance.esStockValido(stock);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esProveedorValido method, of class Producto.
     */
    @Test
    public void testEsProveedorValido() {
        System.out.println("esProveedorValido");
        String proveedor = "Microsoft Enterprises";
        Producto instance = new Producto();
        boolean expResult = true;
        boolean result = instance.esProveedorValido(proveedor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of esMarcaValida method, of class Producto.
     */
    @Test
    public void testEsMarcaValida() {
        System.out.println("esMarcaValida");
        String marca = "Lenovo";
        Producto instance = new Producto();
        boolean expResult = true;
        boolean result = instance.esMarcaValida(marca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of esDescripcionValida method, of class Producto.
     */
    @Test
    public void testEsDescripcionValida() {
        System.out.println("esDescripcionValida");
        String descripcion = "Computadora Intel Core i7 sexta generacion";
        Producto instance = new Producto();
        boolean expResult = true;
        boolean result = instance.esDescripcionValida(descripcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
