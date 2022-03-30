package Test;

public class CantidadDeAzucar {
    private int CantidadDeAzucar;


    public void setCantidadDeAzucar(int cantidadDeAzucar) {
        this.CantidadDeAzucar = cantidadDeAzucar;
    }
    public int getCantidadDeAzucar() {
        return CantidadDeAzucar;
    }


    public boolean TieneAzucar(int CantidadDeAzucar){
        return this.CantidadDeAzucar >= CantidadDeAzucar;
    }
    public void DameAzucar(int CantidadDeAzucar){
        this.CantidadDeAzucar -= CantidadDeAzucar;
    }

    public CantidadDeAzucar(int CantidadDeAzucar){
        this.setCantidadDeAzucar(CantidadDeAzucar);
    }
}
