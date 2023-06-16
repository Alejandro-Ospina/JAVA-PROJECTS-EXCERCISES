
package Entidad;


// @author new53
 
public class Vehiculo {
    private String marca, modelo, tipo;
    private int anio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String tipo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    } 
       
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", anio=" + anio + '}';
    }      
}
