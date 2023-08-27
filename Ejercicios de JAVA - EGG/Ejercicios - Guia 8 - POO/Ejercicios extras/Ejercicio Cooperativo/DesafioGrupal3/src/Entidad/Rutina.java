
package Entidad;


// @author new53
 
public class Rutina {    
    private String id, nombre, nivelDificultad, descripcion;
    private int duracion;

    public Rutina() {
    }

    public Rutina(String id, String nombre, String nivelDificultad, String descripcion, int duracion) {
        this.id = id;
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", nombre=" + nombre + ", nivelDificultad=" + nivelDificultad + ", descripcion=" + descripcion + ", duracion=" + duracion + '}';
    }
}
