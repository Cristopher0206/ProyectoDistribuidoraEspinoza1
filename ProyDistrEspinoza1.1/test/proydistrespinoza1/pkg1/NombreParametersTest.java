/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistrespinoza1.pkg1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
/**
 *
 * @author Cris
 */
public class NombreParametersTest {

/**
 *
 * @author Cris
 */
        String nombre;
        boolean expected = true;

        @Parameterized.Parameters
        public static Iterable <Object[]> parameters(){
            List <Object[]> objects = new ArrayList<Object[]>();
            objects.add(new Object[]{"Cable HDMI",true});
            objects.add(new Object[]{"@Mouse",true});
            objects.add(new Object[]{"Teclado RGB",true});
            objects.add(new Object[]{1258,true});
            objects.add(new Object[]{"LAPTOP",true});
            objects.add(new Object[]{"Tarjeta Grafica",true});
            return objects;
        }

        public NombreParametersTest(String nombre, boolean expected) {
            this.nombre = nombre;
            this.expected = expected;
        }

        @Test
        public void given_parameters_when_given_ProdName(){
            Producto p = new Producto();
            boolean actual = p.esNombreValido(nombre);
            assertEquals(expected, actual);
        }
    }

