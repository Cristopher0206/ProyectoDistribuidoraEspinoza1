package proydistrespinoza1.pkg1;

import org.junit.Test;
import org.mockito.Mockito;

public class iNombreMockTest {
    String nombre="Cable HDMI";
    @Test
    public void esNombreValido() {
        iNombre p = Mockito.mock(iNombre.class);
        Mockito.when(p.esNombreValido(nombre)).thenReturn(true);

        assertEquals( true,p.esNombreValido("Cable HDMI"));
    }
}