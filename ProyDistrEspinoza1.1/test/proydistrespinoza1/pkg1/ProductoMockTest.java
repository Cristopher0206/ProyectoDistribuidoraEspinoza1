package proydistrespinoza1.pkg1;

import org.mockito.Mockito;

public class iProductoTest {
    String codigo="00001";
    //boolean expected = true;
    @org.junit.Test
    public void esCodigoValido() {
        iProducto p = Mockito.mock(iProducto.class);
        Mockito.when(p.esCodigoValido(codigo)).thenReturn(true);

        assertEquals( true,p.esCodigoValido("00001"));
    }
}