
package Servicio;

import Entidad.DiscountCalculator;


// @author new53
 
public class DiscountCalculatorService {   
    
    public static double discount(DiscountCalculator descuento){
        if(descuento == null){
            return 0.0d;
        }else{
            return (descuento.getPrecioProducto()*(1-(descuento.getDescuento()/
                    100)));
        }
    }
}