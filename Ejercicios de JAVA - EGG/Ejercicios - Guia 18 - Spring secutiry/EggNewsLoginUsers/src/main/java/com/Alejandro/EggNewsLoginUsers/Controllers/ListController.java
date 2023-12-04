
package com.Alejandro.EggNewsLoginUsers.Controllers;

import com.Alejandro.EggNewsLoginUsers.Services.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// @author new53

@Controller
@RequestMapping ("/lista_noticias")
public class ListController {
    
    @Autowired
    private NoticiasService notService;
    
    @GetMapping
    public String getListaNoticias(ModelMap model){
        if(notService.listaNoticias().isEmpty()){
            model.put("vacio", "No hay noticias para mostrar");
        }
        model.addAttribute("listaNot", notService.listaNoticias());
        return "lista_noticias.html";
    }

}
