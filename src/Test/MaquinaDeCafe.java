package Test;

import java.util.Objects;

public class MaquinaDeCafe {

protected Cafetera cafetera;
protected Vaso VasoPequeño;
protected Vaso VasoMediano;
protected Vaso VasoGrande;
protected CantidadDeAzucar cantidadDeAzucar;


    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }
    public void setVasoPequeño(Vaso vasoPequeño) {
        this.VasoPequeño = vasoPequeño;
    }
    public void setVasoMediano(Vaso vasoMediano) {
        this.VasoMediano = vasoMediano;
    }
    public void setVasoGrande(Vaso vasoGrande) {
        this.VasoGrande = vasoGrande;
    }
    public void setCantidadDeAzucar(CantidadDeAzucar cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }
    public Cafetera getCoffeeMaker() {
        return cafetera;
    }
    public Vaso getVasoPequeño() {
        return VasoPequeño;
    }

    public CantidadDeAzucar getCantidadDeAzucar() {
        return cantidadDeAzucar;
    }

    public Vaso getTamañoDelVaso(String VasoType)
    {
        if(Objects.equals(VasoType, "Pequeño"))
        {
            return VasoPequeño;
        }
        else if(Objects.equals(VasoType, "Mediano"))
        {
            return VasoMediano;
        }
        else if(Objects.equals(VasoType, "Grande"))
        {
            return VasoGrande;
        }
        else
            return null;
    }

    public String getVasoConCafe(Vaso vaso, int VasoQty, int AzucarQty){

        if(vaso.equals(this.VasoPequeño) && this.VasoPequeño.TieneVaso(VasoQty)){
            this.VasoPequeño.DameVaso(VasoQty);
        }else if(vaso.equals(this.VasoMediano) && this.VasoMediano.TieneVaso(VasoQty)){
            this.VasoMediano.DameVaso(VasoQty);
        }else if(vaso.equals(this.VasoGrande) && this.VasoGrande.TieneVaso(VasoQty)){
            this.VasoGrande.DameVaso(VasoQty);
        }else
            return "No hay vaso";


        if(this.cantidadDeAzucar.TieneAzucar(AzucarQty)){
            this.cantidadDeAzucar.DameAzucar(AzucarQty);
        }else{
            return "No hay azucar";
        }


        if(this.cafetera.TieneCafe(vaso.getContiene())){
            this.cafetera.DameCafe(vaso.getContiene());
        }else{
            return "No hay cafe";
        }

        return "Bien";
    }

}
