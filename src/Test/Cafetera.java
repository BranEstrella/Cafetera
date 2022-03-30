package Test;

public class Cafetera {
    private int CantidadDeCafe;


    public void setCantidadDeCafe(int cantidadDeCafe) {
        this.CantidadDeCafe = cantidadDeCafe;
    }
    public int getCantidadDeCafe() {
        return CantidadDeCafe;
    }


    public boolean TieneCafe(int CantidadDeCafe){
        return this.CantidadDeCafe >= CantidadDeCafe;
    }
    public void DameCafe(int CantidadDeCafe){
        this.CantidadDeCafe -= CantidadDeCafe;
    }

    public Cafetera(int CantidadDeCafe){
        this.setCantidadDeCafe(CantidadDeCafe);
    }
}
