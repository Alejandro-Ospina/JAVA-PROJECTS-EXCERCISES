
package com.Alejandro.EggNewsLoginUsers.Controllers;

import com.Alejandro.EggNewsLoginUsers.Exceptions.Excepciones;
import com.Alejandro.EggNewsLoginUsers.Services.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


// @author new53
@Controller
@RequestMapping ("/editar_noticias")
public class UpdatesController {
    
    @Autowired
    private NoticiasService notServ;
    
    @GetMapping
    public String getListaNoticias(ModelMap model){
        if(notServ.listaNoticias().isEmpty()){
            model.put("vacio", "No hay noticias para mostrar");
        }
        model.addAttribute("listaNot", notServ.listaNoticias());
        return "editar_noticias.html";
    }
    
    @PostMapping ("/eliminar")
    public String eliminarNoticia(@RequestParam String id, RedirectAttributes rA){
        try {
            notServ.eliminarNoticia(id);
            rA.addFlashAttribute("exito", "Noticia eliminada con éxito!");
        } catch (Excepciones.RegistroNoExistente e) {
            rA.addFlashAttribute("fallo", e.getMessage());
        }
        return "redirect:/editar_noticias";
    }
    
    @PostMapping ("/detalle_noticia")
    public String getEdicionNoticia(ModelMap model, @RequestParam String id, 
            @RequestParam String tituloNoticia, 
            @RequestParam String cuerpoNoticia){
        model.addAttribute("id", id);
        model.addAttribute("titulo", tituloNoticia);
        model.addAttribute("cuerpo", cuerpoNoticia);
        return "modificar_noticia.html";
    }
    
    @PostMapping ("/actualizar")
    public String actualizarNoticia (RedirectAttributes rA, @RequestParam String idNoti, 
            @RequestParam String tituloNoticia, 
            @RequestParam String cuerpoNoticia){
        try {
            notServ.actualizarNoticia(idNoti, tituloNoticia, cuerpoNoticia);
            rA.addFlashAttribute("exito", "Noticia actualizada con éxito!");
        } catch (Excepciones.CamposVaciosONulos | Excepciones.ExceededSize | Excepciones.RegistroNoExistente e) {
            rA.addFlashAttribute("fallo", e.getMessage());
        }
        return "redirect:/editar_noticias";
    }  
}