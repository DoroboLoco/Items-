
package proyectoitem1;

import java.util.Date;


public class ItemStock {
    Computadora computadora;
    int cantidad;
    Date ultimaFechaModificacion;


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
