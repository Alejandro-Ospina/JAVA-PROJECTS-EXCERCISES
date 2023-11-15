
package com.alejandro.prueba.controllers;

import com.alejandro.prueba.servicios.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// @author new53

@Controller
@RequestMapping("/")
public class EditorialController {
    
    @Autowired
    private EditorialService editorialService;
    

}
