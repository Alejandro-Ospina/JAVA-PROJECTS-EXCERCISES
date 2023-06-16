
package MainFile;

//  @author new53

import Entidad.Vehiculo;
import Servicios.ServicioVehiculo;

public class ActividadCooperativa1 {

    public static void main(String[] args) {
        ServicioVehiculo objeto = new ServicioVehiculo();
        Vehiculo vehiculo1 = objeto.crearVehiculo("mazda", "cx5", "automóvil", 2022);
        Vehiculo vehiculo2 = objeto.crearVehiculo("kawasaki", "z1000", "motocicleta", 2023);
        Vehiculo vehiculo3 = objeto.crearVehiculo("gw40", "pirelli", "bicicleta", 2017);
        
        Vehiculo[] vectorVehiculos = {vehiculo1, vehiculo2, vehiculo3};
        for(Vehiculo vectorO : vectorVehiculos){           
            System.out.println("Durante 5 segundos: " + vectorO.getTipo() + " avanza " + ServicioVehiculo.moverse(vectorO,5) + " m" );   
            System.out.println("Durante 10 segundos: " + vectorO.getTipo() + " avanza " + ServicioVehiculo.moverse(vectorO,10) + " m" );
            System.out.println("Durante 60 segundos: " + vectorO.getTipo() + " avanza " + ServicioVehiculo.moverse(vectorO,15) + " m" );
            System.out.println("");
        }        
        
        int max = 0;
        Vehiculo vehMax = new Vehiculo();
        for(Vehiculo vehiculo : vectorVehiculos){
            ServicioVehiculo.moverse(vehiculo,300);
            if(ServicioVehiculo.frenar(vehiculo) > max){
                max = ServicioVehiculo.frenar(vehiculo);
                vehMax = vehiculo;
            }else{
                max = max;
            }
        }
        System.out.println("El vehículo con mayor alcance durante 5 minutos de recorrido es: " + vehMax.getTipo() + "\n");
    }
}