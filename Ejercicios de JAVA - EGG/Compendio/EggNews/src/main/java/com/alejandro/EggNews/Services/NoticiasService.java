
package com.alejandro.EggNews.Services;

import com.alejandro.EggNews.Entidades.Noticias;
import com.alejandro.EggNews.Exceptions.Excepciones;
import com.alejandro.EggNews.Repositories.NewsRepository;
import com.sun.org.apache.regexp.internal.recompile;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.TimeZone;
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
            Excepciones.RegistroExistente, Excepciones.CamposVaciosONulos, Excepciones.ExceededSize{
        validarDatos(nombreNoticia, cuerpoNoticia);
        Optional<Noticias> existeNoticia = neRepo.consultarNoticiaPorNombre(nombreNoticia);
        if(existeNoticia.isPresent()){
            throw new Excepciones.RegistroExistente("Ya existe un registro con el título dado"
                    + " en la base de datos");
        }   
        neRepo.save(new Noticias(nombreNoticia, cuerpoNoticia, Calendar.getInstance()));
    }
    
    @Transactional
    public void actualizarNoticia(String idNoticia, String nombreNoticia, 
            String cuerpoNoticia) throws Excepciones.CamposVaciosONulos, Excepciones.RegistroNoExistente, Excepciones.ExceededSize{
        validarDatos(nombreNoticia, cuerpoNoticia);
        Optional<Noticias> existeNoticia = neRepo.findById(idNoticia);
        if(!existeNoticia.isPresent()){
            throw new Excepciones.RegistroNoExistente ("No se encontró registro asociado");
        }
        Noticias noticia = existeNoticia.get();
        noticia.setNombreNoticia(nombreNoticia); noticia.setCuerpoNoticia(cuerpoNoticia);
        noticia.setFechaCreacion(Calendar.getInstance());
        neRepo.save(noticia);
    }
    
    @Transactional
    public void eliminarNoticia(String idNoticia) throws Excepciones.RegistroNoExistente{
        Optional<Noticias> existeNoticia = neRepo.findById(idNoticia);
        if(!existeNoticia.isPresent()){
            throw new Excepciones.RegistroNoExistente ("No se encontró registro asociado");
        }
        neRepo.deleteById(idNoticia);
    }
    
    @Transactional
    public List<Noticias> listaNoticias(){
        return new ArrayList(neRepo.listaNoticiasRecienteAntigua());
    }
    
    private void validarDatos(String nombreNoticia, String cuerpoNoticia) 
            throws Excepciones.CamposVaciosONulos, Excepciones.ExceededSize {
        if(nombreNoticia == null || nombreNoticia.isEmpty()){
            throw new Excepciones.CamposVaciosONulos("El título de la noticia"
                    + " no puede ser nulo o estar vacío");
        }
        if(cuerpoNoticia == null || cuerpoNoticia.isEmpty()){
            throw new Excepciones.CamposVaciosONulos("El cuerpo de la noticia"
                    + " no puede ser nulo o estar vacío");
        }
        if(!cuerpoNoticia.isEmpty() && cuerpoNoticia.length() > 100000){
            throw new Excepciones.ExceededSize("Se ha excedido el tamaño del cuerpo");
        }
        if(!nombreNoticia.isEmpty() && nombreNoticia.length() > 500){
            throw new Excepciones.ExceededSize("Se ha excedido el tamaño del título");
        }
    }
}