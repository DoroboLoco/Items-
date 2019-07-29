
package proyectoitem1;

import java.util.Date;


public class ItemStock {
    private Computadora computadora;
    private int cantidad;
    private Date ultimaFechaModificacion;


    ItemStock(Computadora c,int cantidad){
    this.computadora=c;
    this.cantidad=cantidad;
    }

    Computadora getComputadora(){
    return this.computadora;
    }

    int getCantidad(){
    return this.cantidad;
    }

}
