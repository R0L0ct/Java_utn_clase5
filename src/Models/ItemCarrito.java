package Models;

import java.io.File;

public class ItemCarrito {
    private Producto item;
    private int cantidad;

    private int cuotas;

    public ItemCarrito(Producto item , int cantidad , int cuotas) {
        this.item = item;
        this.cantidad = cantidad;
        this.cuotas = cuotas;
    }
    public float costoFinal(){
        float interes = 0;
        if( cuotas == 0) {
            interes = 0;
        }else if(cuotas == 3){
            interes = (10 * (item.getPrecio() * cantidad)) / 100;
        } else if(cuotas == 6) {
            interes = (15 * (item.getPrecio() * cantidad)) / 100;
        } else {
            System.out.println("Solamente 3 y 6 cuotas!");
        }
        return interes + (item.getPrecio() * cantidad);
    };


}
