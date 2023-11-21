
package com.alejandro.EggNews.Services;

import com.alejandro.EggNews.Entidades.Noticias;
import com.alejandro.EggNews.Exceptions.Excepciones;
import com.alejandro.EggNews.Repositories.NewsRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// @author new53

@Service
public class NoticiasService {
    
    @Autowired
    private NewsRepository neRepo;
    
    @Transactional (rollbackOn = Excepciones.CamposVaciosONulos.class)
    public void crearNoticia(String nombreNoticia, String cuerpoNoticia) throws 
            Excepciones.RegistroExistente, Excepciones.CamposVaciosONulos{
        validarDatos(nombreNoticia, cuerpoNoticia);
        Optional<Noticias> existeNoticia = neRepo.consultarNoticiaPorNombre(nombreNoticia);
        if(existeNoticia.isPresent()){
            throw new Excepciones.RegistroExistente("Ya existe un registro con el título dado"
                    + "en la base de datos");
        }   
        neRepo.save(new Noticias(nombreNoticia, cuerpoNoticia));
    }
    
    private void validarDatos(String nombreNoticia, String cuerpoNoticia) 
            throws Excepciones.CamposVaciosONulos {
        if(nombreNoticia == null || nombreNoticia.isEmpty()){
            throw new Excepciones.CamposVaciosONulos("El título de la noticia"
                    + "no puede ser nulo o estar vacío");
        }
        if(cuerpoNoticia == null || cuerpoNoticia.isEmpty()){
            throw new Excepciones.CamposVaciosONulos("El cuerpo de la noticia"
                    + "no puede ser nulo o estar vacío");
        }
    }
}