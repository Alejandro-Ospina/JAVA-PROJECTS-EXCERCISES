
package com.alejandro.prueba.controllers;

import com.alejandro.prueba.excepciones.Excepciones;
import com.alejandro.prueba.servicios.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


// @author new53

@Controller
@RequestMapping ("/")
public class AutorController {
    
    @Autowired
    private AutorService autorService;
    
    @GetMapping ("/autor")
    public String getAutorForm(){
        return "autor_form.html";
    }
    
    @PostMapping("/autor/registro_autor")
    public String registroAutor(@RequestParam String nombreAutor){
        try{
            autorService.crearAutor(nombreAutor);
            return "index.html";
        } catch (Excepciones.CamposVacios | Excepciones.RegistroExistente ex){
            System.out.println(ex.getMessage());
            return null;
        }     
    }

}
