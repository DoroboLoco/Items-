
package proyectoitem1;

import java.util.ArrayList;


public class Stock {
    private ArrayList<ItemStock>items;
    
    ArrayList<ItemStock> getItems(){
    return this.items;
    }

    void setItems(ArrayList<ItemStock> items) {
    this.items = items;
    }

    
    public ArrayList coonstultarItemsFaltantes(int cantidadMaxima){
        
        ArrayList<ItemStock> nuevaLista = new ArrayList<>();
        for(int i=0; i<items.size(); i++ ){
        
            if(items.get(i).getCantidad()<cantidadMaxima){
            
                nuevaLista.add(items.get(i));
            }
            
        }
        
        return items;
    }


}
