
package Entidad;


// @author new53
 
public class TemperatureConverter {
    private double celsius, kelvin, fahrenheit;

    public TemperatureConverter() {
    }

    public TemperatureConverter(double celsius, double kelvin, double fahrenheit) {
        this.celsius = celsius;
        this.kelvin = kelvin;
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}