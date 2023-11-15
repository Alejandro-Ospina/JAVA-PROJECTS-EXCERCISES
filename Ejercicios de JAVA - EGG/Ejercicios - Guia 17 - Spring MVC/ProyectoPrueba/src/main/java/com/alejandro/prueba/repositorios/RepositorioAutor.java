
package com.alejandro.prueba.repositorios;

import com.alejandro.prueba.entidades.Autor;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


// @author new53
@Repository 
public interface RepositorioAutor extends JpaRepository<Autor, String>{
    
    @Query ("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    public Optional<Autor> buscarAutorPorNombre (@Param ("nombre") String nombre);
}