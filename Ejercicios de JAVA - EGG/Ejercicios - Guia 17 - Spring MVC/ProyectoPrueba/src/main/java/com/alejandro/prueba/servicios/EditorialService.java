
package com.alejandro.prueba.servicios;

import com.alejandro.prueba.entidades.Editorial;
import com.alejandro.prueba.excepciones.Excepciones;
import com.alejandro.prueba.repositorios.RepositorioEditorial;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// @author new53

@Service
public class EditorialService {
    
    @Autowired
    private RepositorioEditorial editorialRepo;
    
    @Transactional
    public void crearEditorial(String nombreEditorial) throws Excepciones.CamposVacios, Excepciones.RegistroExistente{
        validarDatos(nombreEditorial);
        Editorial editorial = new Editorial();
        Optional<Editorial> resEditorial = editorialRepo.buscarEditorialPorNombre(nombreEditorial);        
        if(resEditorial.isPresent()){
            throw new Excepciones.RegistroExistente("Ya existe un registro de la editorial bajo el nombre dado");
        }else {
            editorial.setNombre(nombreEditorial);
        }
        editorialRepo.save(editorial);
    }
    
    private void validarDatos(String nombreEditorial) throws Excepciones.CamposVacios{
        if (nombreEditorial == null){
            throw new Excepciones.CamposVacios ("El campo del nombre de la editorial no puede ser vacío");
        }
    }
    
    @Transactional
    public void actualizarEditorial(String idEditorial, String nombreEditorial) throws Excepciones.CamposVacios, Excepciones.EntidadNoEncontrada{
        validarDatos(idEditorial);
        Optional<Editorial> resEditorial = editorialRepo.findById(idEditorial);     
        if(!resEditorial.isPresent()){
            throw new Excepciones.EntidadNoEncontrada ("No se encontró una editorial asociada");
        }
        Editorial editorial = resEditorial.get();
        editorial.setNombre(nombreEditorial);
        editorialRepo.save(editorial);
    }
    
    public List<Editorial> listarEditoriales(){
        return editorialRepo.findAll();
    }
}