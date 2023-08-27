
package Entidad;

import java.time.LocalDate;




// @author new53
 
public class Alquiler {
    private String nombrePelicula;
    private LocalDate fechaInicio, fechaFin;
    private final double precio = 10;

    public Alquiler() {
    }
    
    public Alquiler(String nombrePelicula, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombrePelicula = nombrePelicula;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }             
}
