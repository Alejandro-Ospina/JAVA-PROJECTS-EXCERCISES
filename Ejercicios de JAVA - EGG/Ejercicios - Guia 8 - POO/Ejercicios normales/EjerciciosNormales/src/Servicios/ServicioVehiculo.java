
package Servicios;

import Entidad.Vehiculo;

// @author new53
 
public class ServicioVehiculo {  
    private static int segundos;
    
    public Vehiculo crearVehiculo(String marca, String modelo, String tipo, int anio){
        return new Vehiculo(marca, modelo, tipo, anio);
    }
    
    public static int moverse(Vehiculo objeto, int segundos){ 
        ServicioVehiculo.segundos = segundos;
        if(null == objeto.getTipo()){
            return 0;
        }else switch (objeto.getTipo()) {
            case "automóvil":
                return 3*segundos;
            case "motocicleta":
                return 2*segundos;
            case "bicicleta":
                return segundos;
            default:
                return 0;
        }
    }
    
    public static int frenar(Vehiculo objeto){
        if("bicicleta".equals(objeto.getTipo())){
            return moverse(objeto, ServicioVehiculo.segundos);
        }else{
            return moverse(objeto, ServicioVehiculo.segundos) + 2;
        }
    }
}