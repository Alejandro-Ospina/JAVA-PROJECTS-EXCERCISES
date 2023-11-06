
package Estancias.Entidades;


// @author new53
 
public class Familias {
    private int idFamilia, idCasaFamilia;
    private int nombre;
    private int edadMinima, edadMaxima, numeroHijos;
    private String email;

    public Familias() {
    }

    public Familias(int idCasaFamilia, int nombre, int edadMinima, int edadMaxima, int numeroHijos, String email) {
        this.idCasaFamilia = idCasaFamilia;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numeroHijos = numeroHijos;
        this.email = email;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public int getIdCasaFamilia() {
        return idCasaFamilia;
    }

    public void setIdCasaFamilia(int idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Familias{" + "idFamilia=" + idFamilia + ", idCasaFamilia=" + idCasaFamilia + ", nombre=" + nombre + ", edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + ", numeroHijos=" + numeroHijos + ", email=" + email + '}';
    }    
}