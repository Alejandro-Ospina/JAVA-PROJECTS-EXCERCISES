
package Entidad;

import java.util.Date;


// @author new53
 
public class PersonaDate {
    private String nombre;
    private Date fechaNacimiento;

    public PersonaDate() {
    }

    public PersonaDate(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }    
}
