/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistrespinoza1.pkg1;

//import com.beust.jcommander.Parameterized;

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
public class CodigoParametersTest {
    String codigo;
    boolean expected = true;
    
    @Parameterized.Parameters
    public static Iterable <Object[]> parameters(){
        List <Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"0001",true});
        objects.add(new Object[]{"00002",true});
        objects.add(new Object[]{"00003",true});
        objects.add(new Object[]{"00010",true});
        objects.add(new Object[]{"05050",true});
        objects.add(new Object[]{"00102",true});
        return objects;
    }
    
    public CodigoParametersTest(String codigo, boolean expected) {
        this.codigo = codigo;
        this.expected = expected;
    }
    
    @Test
    public void given_parameters_when_given_ProdCode(){
        Producto p = new Producto();
        boolean actual = p.esCodigoValido(codigo);
        assertEquals(expected, actual);
    }

    
}
