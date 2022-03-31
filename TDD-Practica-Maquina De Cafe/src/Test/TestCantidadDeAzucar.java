package Test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCantidadDeAzucar {
    CantidadDeAzucar cantidadDeAzucar;

    @Before
    public void setUp()
    {
        cantidadDeAzucar = new CantidadDeAzucar(10);
    }

    @Test
    public void HayAzucar(){
        boolean result = cantidadDeAzucar.TieneAzucar(5);
        assertTrue(result);
        result = cantidadDeAzucar.TieneAzucar(10);
        assertTrue(result);
    }

    @Test
    public void NoHayAzucar(){
        boolean result = cantidadDeAzucar.TieneAzucar(15);
        assertFalse(result);
    }

    @Test
    public void QuitarAzucar()
    {
        cantidadDeAzucar.DameAzucar(5);
        assertEquals(5, cantidadDeAzucar.getCantidadDeAzucar());
        cantidadDeAzucar.DameAzucar(2);
        assertEquals(3, cantidadDeAzucar.getCantidadDeAzucar());
    }
}
