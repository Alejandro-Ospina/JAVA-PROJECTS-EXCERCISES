
package com.alejandro.prueba.repositorios;

import com.alejandro.prueba.entidades.Libro;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


// @author new53

@Repository
public interface RepositorioLibro extends JpaRepository<Libro, Long>{
    
    @Query ("SELECT l FROM Libro l WHERE l.titulo = :nombre")
    public Optional<Libro> buscarLibroPorTitulo (@Param("nombre") String nombre);
    
    @Query ("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre")
    public List<Libro> buscarLibrosPorAutor (@Param("nombre") String nombre);
}
