package Test;

public class Vaso {
    
    private int CantidadDeVaso;
    private int Contiene;
    


    public int getCantidadDeVaso() {
        return CantidadDeVaso;
    }
    public int getContiene() {
        return Contiene;
    }
    public void setCantidadDeVaso(int cantidadDeVaso) {
        this.CantidadDeVaso = cantidadDeVaso;
    }
    public void setContiene(int contiene) {
        this.Contiene = contiene;
    }


    public boolean TieneVaso(int CantidadDeVaso){
        return this.CantidadDeVaso >= CantidadDeVaso;
    }

    public void DameVaso(int CantidadDeVaso){
        this.CantidadDeVaso -= CantidadDeVaso;
    }

    public Vaso(int CantidadDeVaso, int Contiene) {
        this.setContiene(Contiene);
        this.setCantidadDeVaso(CantidadDeVaso);
    }
}
