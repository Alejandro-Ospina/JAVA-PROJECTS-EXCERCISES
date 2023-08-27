
package Entidad;


// @author new53
 
public class Cliente {
    private String id, nombre, objetivo;
    private int edad;
    private double altura, peso;

    public Cliente() {
    }

    public Cliente(String id, String nombre, String objetivo, int edad, double altura, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", objetivo=" + objetivo + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }   
}
