
package com.alejandro.prueba.servicios;

import com.alejandro.prueba.entidades.Autor;
import com.alejandro.prueba.excepciones.Excepciones;
import com.alejandro.prueba.repositorios.RepositorioAutor;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// @author new53

@Service
public class AutorService {
    
    @Autowired
    private RepositorioAutor autorRepo;
    
    @Transactional
    public void crearAutor(String nombreAutor) throws Excepciones.CamposVacios, Excepciones.RegistroExistente{
        validarDatos(nombreAutor);
        Autor autor = new Autor();
        Optional<Autor> resAutor = autorRepo.buscarAutorPorNombre(nombreAutor);        
        if(resAutor.isPresent()){
            throw new Excepciones.RegistroExistente("Ya existe un registro del autor bajo el nombre dado");
        }else {
            autor.setNombre(nombreAutor);
        }
        autorRepo.save(autor);
    }
    
    private void validarDatos(String nombreAutor) throws Excepciones.CamposVacios{
        if (nombreAutor == null){
            throw new Excepciones.CamposVacios ("El campo del nombre del autor no puede ser vacío");
        }
    }
    
    @Transactional
    public void actualizarAutor(String idAutor, String nombreAutor) throws Excepciones.CamposVacios, Excepciones.EntidadNoEncontrada{
        validarDatos(nombreAutor);
        Optional<Autor> resAutor = autorRepo.findById(idAutor);     
        if(!resAutor.isPresent()){
            throw new Excepciones.EntidadNoEncontrada ("No se encontró un autor asociado");
        }
        Autor autor = resAutor.get();
        autor.setNombre(nombreAutor);
        autorRepo.save(autor);
    }
    
    public List<Autor> listarEditoriales(){
        return autorRepo.findAll();
    }
}