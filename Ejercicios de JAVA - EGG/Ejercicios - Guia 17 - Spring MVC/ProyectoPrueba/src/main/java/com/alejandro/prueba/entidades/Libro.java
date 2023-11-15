
package com.alejandro.prueba.entidades;

import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


// @author new53
@Entity
public class Libro {
    @Id
    private Long isbn;
    private String titulo;
    private Integer ejemplares;
    @Temporal (TemporalType.DATE)
    private Calendar fechaAlta;
    @ManyToOne (targetEntity = Autor.class, cascade = CascadeType.PERSIST)
    private Autor autor;
    @ManyToOne (targetEntity = Editorial.class, cascade = CascadeType.PERSIST)
    private Editorial editorial;

    public Libro() {
    }

    public Libro(Long isbn, String titulo, Integer ejemplares, Calendar fechaAlta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.ejemplares = ejemplares;
        this.fechaAlta = fechaAlta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Calendar getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Calendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}