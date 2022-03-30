package Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMaquinaDeCafe {

    Cafetera cafetera;
    Vaso VasoPequeño;
    Vaso VasoMediano;
    Vaso VasoGrande;
    CantidadDeAzucar cantidadDeAzucar;
    MaquinaDeCafe maquinaDeCafe;

    @Before
    public void Pedir()
    {
        cafetera = new Cafetera(50);
        VasoPequeño = new Vaso(5,10);
        VasoMediano = new Vaso(5,20);
        VasoGrande = new Vaso(5,30);
        cantidadDeAzucar = new CantidadDeAzucar(20);

        maquinaDeCafe = new MaquinaDeCafe();
        maquinaDeCafe.setCafetera(cafetera);
        maquinaDeCafe.setVasoPequeño(VasoPequeño);
        maquinaDeCafe.setVasoMediano(VasoMediano);
        maquinaDeCafe.setVasoGrande(VasoGrande);
        maquinaDeCafe.setCantidadDeAzucar(cantidadDeAzucar);
    }

    @Test
    public void getVasoPequeño()
    {
        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Pequeño");
        assertEquals(maquinaDeCafe.VasoPequeño, vaso);
    }

    @Test
    public void getVasoMediano()
    {
        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Mediano");
        assertEquals(maquinaDeCafe.VasoMediano, vaso);
    }

    @Test
    public void getVasoGrande()
    {
        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Grande");
        assertEquals(maquinaDeCafe.VasoGrande, vaso);
    }

    @Test
    public void NoHayVaso()
    {
        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Pequeño");
        String result = maquinaDeCafe.getVasoConCafe(vaso,10,2);
        assertEquals("No hay vaso", result);
    }

    @Test
    public void NoHayCafe(){
        cafetera = new Cafetera(5);
        maquinaDeCafe.setCafetera(cafetera);

        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Pequeño");
        String result = maquinaDeCafe.getVasoConCafe(vaso,1,2);
        assertEquals("No hay cafe", result);
    }

    @Test
    public void NoHayAzucar()
    {
        cantidadDeAzucar = new CantidadDeAzucar(2);
        maquinaDeCafe.setCantidadDeAzucar(cantidadDeAzucar);
        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Pequeño");
        String result = maquinaDeCafe.getVasoConCafe(vaso,1,3);
        assertEquals("No hay azucar", result);
    }

    @Test
    public void QuitarCafe()
    {
        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Pequeño");
        maquinaDeCafe.getVasoConCafe(vaso,1,3);
        int result = maquinaDeCafe.getCoffeeMaker().getCantidadDeCafe();
        assertEquals(40,result);
    }

    @Test
    public void QuitarVaso()
    {
        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Pequeño");
        maquinaDeCafe.getVasoConCafe(vaso,1,3);
        int result = maquinaDeCafe.getVasoPequeño().getCantidadDeVaso();
        assertEquals(4,result);
    }

    @Test
    public void QuitarAzucar(){
        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Pequeño");
        maquinaDeCafe.getVasoConCafe(vaso, 1, 3);
        int result = maquinaDeCafe.getCantidadDeAzucar().getCantidadDeAzucar();
        assertEquals(17, result);
    }

    @Test
    public void QueLoDisfrutes()
    {
        Vaso vaso = maquinaDeCafe.getTamañoDelVaso("Pequeño");
        String result = maquinaDeCafe.getVasoConCafe(vaso,1,3);
        assertEquals("Bien",result);
    }
}
