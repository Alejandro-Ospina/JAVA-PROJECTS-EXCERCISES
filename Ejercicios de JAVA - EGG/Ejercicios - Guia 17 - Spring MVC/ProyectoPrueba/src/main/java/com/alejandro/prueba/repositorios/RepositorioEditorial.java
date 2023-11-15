
package com.alejandro.prueba.repositorios;

import com.alejandro.prueba.entidades.Editorial;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


// @author new53
@Repository
public interface RepositorioEditorial extends JpaRepository<Editorial, String>{
    
    @Query ("SELECT e FROM Editorial e WHERE e.nombre = :nombre")
    public Optional<Editorial> buscarEditorialPorNombre (@Param ("nombre") String nombre);
}