package com.alejandro.prueba.controllers;

import com.alejandro.prueba.entidades.Autor;
import com.alejandro.prueba.excepciones.Excepciones;
import com.alejandro.prueba.servicios.AutorService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// @author new53
@Controller
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public String getAutorForm() {
        return "autor_form.html";
    }

    @PostMapping("/registro_autor")
    public String registroAutor(@RequestParam String nombreAutor, RedirectAttributes rA) {
        try {
            autorService.crearAutor(nombreAutor);
            rA.addFlashAttribute("success", "Autor creado exitosamente");
        } catch (Excepciones.CamposVacios | Excepciones.RegistroExistente ex) {
            rA.addFlashAttribute("fail", ex.getMessage());
        } catch (Exception ex) {
            rA.addFlashAttribute("fail", "Algo ha salido mal");
        }
        return "redirect:/autor";
    }

    @GetMapping("/lista_autores")
    public String listaAutores(ModelMap model) {
        List<Autor> autores = autorService.listarAutores();
        model.addAttribute("listaAutores", autores);
        return "lista_autores.html";
    }

    @PostMapping("/editar_autor")
    public String editarAutor(ModelMap model, @RequestParam(required = false) String autorId, 
            @RequestParam(required = false) String nombreAutor) {
        Autor autor = autorService.obtenerAutorId(autorId);    
        if (autor != null) {
            model.put("cambiar_nombre", true);  
            System.out.println(nombreAutor);
            try {
                model.addAttribute("listaAutores", autor);
                autorService.actualizarAutor(autorId, nombreAutor);  
                return "lista_autores.html";
            } catch (Excepciones.CamposVacios | Excepciones.EntidadNoEncontrada e) {
                System.out.println(e.getMessage());
                return "redirect:/autor/lista_autores";
            }          
        }
        return "redirect:/autor/lista_autores";
    }

    @PostMapping("/eliminar_autor")
    public String eliminarAutor(HttpServletRequest request) {
        try {
            autorService.eliminarAutor(request.getParameter("autorId"));
        } catch (Excepciones.EntidadNoEncontrada ex) {
        }
        return "redirect:/autor/lista_autores";
    }
}
