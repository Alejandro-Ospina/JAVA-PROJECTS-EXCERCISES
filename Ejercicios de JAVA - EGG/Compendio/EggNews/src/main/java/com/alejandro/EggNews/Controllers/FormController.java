
package com.alejandro.EggNews.Controllers;

import com.alejandro.EggNews.Exceptions.Excepciones;
import com.alejandro.EggNews.Services.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


// @author new53

@Controller
@RequestMapping("/crear_noticias")
public class FormController {
    
    @Autowired
    private NoticiasService notService;
    
    @GetMapping
    public String getNoticiaForm(){
        return "new_form.html";
    }
    
    @PostMapping ("/confirmar_envio")
    public String cargarNoticia(RedirectAttributes rA, @RequestParam String tituloNoticia, 
            @RequestParam String cuerpoNoticia){
        try {
            notService.crearNoticia(tituloNoticia, cuerpoNoticia);
            rA.addFlashAttribute("exito", "Noticia cargada con éxito");
        } catch (Excepciones.CamposVaciosONulos | Excepciones.ExceededSize | 
                Excepciones.RegistroExistente e) {
            rA.addFlashAttribute("fallo", e.getMessage());
            return "redirect:/crear_noticias";
        }
        return "redirect:/crear_noticias";
    }
}