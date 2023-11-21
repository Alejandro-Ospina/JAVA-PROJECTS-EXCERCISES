
package com.alejandro.EggNews.Repositories;

import com.alejandro.EggNews.Entidades.Noticias;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


// @author new53

@Repository
public interface NewsRepository extends JpaRepository<Noticias, String>{
    
    @Query ("SELECT n FROM Noticias n WHERE n.nombreNoticia = :nombre")
    public Optional<Noticias> consultarNoticiaPorNombre(@Param("nombre") String nombre);    
}