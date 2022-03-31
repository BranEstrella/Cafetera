package Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCafetera {

    @Test
    public void HayCafe()
    {
        Cafetera cafetera = new Cafetera(10);
        boolean result = cafetera.TieneCafe(5);
        assertTrue(result);
    }

    @Test
    public void NoHayCafe()
    {
        Cafetera cafetera = new Cafetera(10);
        boolean result = cafetera.TieneCafe(11);
        assertFalse(result);
    }

    @Test
    public void QuitarCafe()
    {
        Cafetera cafetera = new Cafetera(10);
        cafetera.DameCafe(7);
        assertEquals(3, cafetera.getCantidadDeCafe());
    }




}
