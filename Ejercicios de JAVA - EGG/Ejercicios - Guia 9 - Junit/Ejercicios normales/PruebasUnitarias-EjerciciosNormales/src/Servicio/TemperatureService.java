
package Servicio;

import Entidad.TemperatureConverter;


// @author new53
 
public class TemperatureService {
    private TemperatureConverter temperaturas;

    public TemperatureService(TemperatureConverter temperaturas) {
        this.temperaturas = temperaturas;
    }

    public double celsiusToFahrenheit(){
        return ((temperaturas.getCelsius()*((9.0/5.0)))+32.0);
    }
    
    public double celsiusToKelvin(){
        return (temperaturas.getCelsius() + 273.15);
    }
    
    public double fahrenheitToCelsius(){
        return ((temperaturas.getFahrenheit()-32.0)*(5.0/9.0));
    }
    
    public double fahrenheitToKelvin(){
        return (((temperaturas.getFahrenheit()-32.0)*(5.0/9.0))+273.15);
    }
    
    public double kelvinToCelsius(){
        return (temperaturas.getKelvin() - 273.15);
    }
    
    public double kelvinToFahrenheit(){
        return (((temperaturas.getKelvin()-273.15)*(9.0/5.0))+32.0);
    }
}