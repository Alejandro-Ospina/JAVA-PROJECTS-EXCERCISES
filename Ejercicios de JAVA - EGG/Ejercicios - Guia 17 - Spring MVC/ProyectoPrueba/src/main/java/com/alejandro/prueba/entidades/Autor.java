
package com.alejandro.prueba.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;


// @author new53
@Entity 
public class Autor {
    
    @Id
    @GeneratedValue (generator = "uuid")
    @GenericGenerator (name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;

    public Autor() {
    }

    public Autor(String nombre) {
        this.nombre = nombre;
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
}