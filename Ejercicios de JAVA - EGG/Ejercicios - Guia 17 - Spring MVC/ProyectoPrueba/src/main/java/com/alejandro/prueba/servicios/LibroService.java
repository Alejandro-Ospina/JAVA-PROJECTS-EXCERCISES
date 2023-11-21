
package com.alejandro.prueba.servicios;

import com.alejandro.prueba.entidades.Autor;
import com.alejandro.prueba.entidades.Editorial;
import com.alejandro.prueba.entidades.Libro;
import com.alejandro.prueba.excepciones.Excepciones;
import com.alejandro.prueba.repositorios.RepositorioAutor;
import com.alejandro.prueba.repositorios.RepositorioEditorial;
import com.alejandro.prueba.repositorios.RepositorioLibro;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// @author new53
@Service
public class LibroService {
    
    @Autowired
    private RepositorioLibro libroRepo;
    @Autowired
    private RepositorioAutor autorRepo;
    @Autowired
    private RepositorioEditorial editorialRepo;
    
    @Transactional (rollbackOn = Excepciones.LibroNoCreado.class)
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, 
            String nombreAutor, String nombreEditorial) throws Excepciones.LibroNoCreado, Excepciones.CamposVacios{
        validarDatos(isbn, titulo, ejemplares, nombreAutor, nombreEditorial);
        Libro libro = new Libro();
        Optional<Libro> resLibro = libroRepo.buscarLibroPorTitulo(titulo);
        Optional<Autor> resAutor = autorRepo.buscarAutorPorNombre(nombreAutor);
        Optional<Editorial> resEditorial = editorialRepo.buscarEditorialPorNombre(nombreEditorial);
        if(resLibro.isPresent() & resEditorial.isPresent()){
            throw new Excepciones.LibroNoCreado ("No se puede crear el libro porque ya existe");
        }
        if(resAutor.isPresent()){
            libro.setAutor(resAutor.get());
        }else {
            libro.setAutor(new Autor(nombreAutor));
        }
        if(resEditorial.isPresent()){
            libro.setEditorial(resEditorial.get());
        }else {
            libro.setEditorial(new Editorial(nombreEditorial));
        }
        libro.setIsbn(isbn); libro.setTitulo(titulo); libro.setEjemplares(ejemplares);
        libro.setFechaAlta(Calendar.getInstance(Locale.ENGLISH));
        libroRepo.save(libro);
    }
    
    private void validarDatos(Long isbn, String titulo, Integer ejemplares, 
            String nombreAutor, String nombreEditorial) throws Excepciones.CamposVacios{
        if (isbn == null){
            throw new Excepciones.CamposVacios ("El campo del isbn no puede ser vacío");
        }
        if (titulo == null || titulo.isEmpty()){
            throw new Excepciones.CamposVacios ("El campo del título no puede ser vacío");
        }
        if (ejemplares == null){
            throw new Excepciones.CamposVacios ("El campo de ejemplares no puede ser vacío");
        }
        if (nombreAutor == null || nombreAutor.isEmpty()){
            throw new Excepciones.CamposVacios ("El campo del nombre de autor no puede ser vacío");
        }
        if (nombreEditorial == null || nombreEditorial.isEmpty()){
            throw new Excepciones.CamposVacios ("El campo del nombre de la editorial no puede ser vacío");
        }
    }
    
    @Transactional
    public void actualizarLibro(Long isbn, String titulo, Integer ejemplares, 
            String idAutor, String idEditorial) throws Excepciones.CamposVacios, Excepciones.EntidadNoEncontrada{
        validarDatos(isbn, titulo, ejemplares, idAutor, idEditorial);
        Optional<Libro> resLibro = libroRepo.findById(isbn);
        Optional<Autor> resAutor = autorRepo.findById(idAutor);
        Optional<Editorial> resEditorial = editorialRepo.findById(idEditorial);
        if(!resAutor.isPresent()){
            throw new Excepciones.EntidadNoEncontrada ("No se encontró el autor asociado");
        }       
        if(!resEditorial.isPresent()){
            throw new Excepciones.EntidadNoEncontrada ("No se encontró una editorial asociada");
        }
        if(!resLibro.isPresent()){
            throw new Excepciones.EntidadNoEncontrada ("No se encontró un libro asociado");
        }
        Libro libro = resLibro.get();
        libro.setIsbn(isbn); libro.setTitulo(titulo); libro.setEjemplares(ejemplares);
        libroRepo.save(libro);
    }
    
    public List<Libro> listarLibros(){
        return libroRepo.findAll();
    }
}