package Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestVaso {

    @Test
    public void HayVaso()
    {
        Vaso VasoPequeño = new Vaso(2,10);
        boolean result = VasoPequeño.TieneVaso(1);
        assertTrue(result);
    }

    @Test
    public void NoHayVaso()
    {
        Vaso VasoPequeño = new Vaso(1,10);
        boolean result = VasoPequeño.TieneVaso(2);
        assertFalse(result);
    }

    @Test
    public void RestarVaso()
    {
        Vaso VasoPequeño = new Vaso(5,10);
        VasoPequeño.DameVaso(1);
        assertEquals(4,VasoPequeño.getCantidadDeVaso());
    }
}
