
package com.alejandro.prueba.controllers;

import com.alejandro.prueba.entidades.Editorial;
import com.alejandro.prueba.excepciones.Excepciones;
import com.alejandro.prueba.servicios.EditorialService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
@RequestMapping("/editorial")
public class EditorialController {
    
    @Autowired
    private EditorialService editorialService;
    
    @GetMapping
    public String getEditorialIndex(){
        return "editorial_form.html";
    }
    
    @PostMapping ("/registro_editorial")
    public String registrarEditorial(@RequestParam String nombreEditorial, RedirectAttributes rA){
        try{
            editorialService.crearEditorial(nombreEditorial);
            rA.addFlashAttribute("success", "Editorial creada exitosamente!");
        }catch (Excepciones.CamposVacios | Excepciones.RegistroExistente ex){
            rA.addFlashAttribute("fail", ex.getMessage());
        }catch (Exception ex){
            rA.addFlashAttribute("fail", "Algo ha salido mal");
        }
        return "redirect:/editorial";
    }
    
    @GetMapping("/lista_editoriales")
    public String listaEditoriales(ModelMap model){
        List<Editorial> editoriales = editorialService.listarEditoriales();
        model.addAttribute("listaEditoriales", editoriales);
        return "lista_editoriales.html";
    }
    
    @PostMapping("/eliminar_editorial")
    public String eliminarAutor(HttpServletRequest request){
        try {           
            editorialService.eliminarEditorial(request.getParameter("editorialId"));           
        } catch (Excepciones.EntidadNoEncontrada ex) {
        }
        return "redirect:/editorial/lista_editoriales";
    }
}