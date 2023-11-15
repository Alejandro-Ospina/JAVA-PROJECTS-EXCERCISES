
package com.alejandro.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// @author new53

@Controller
@RequestMapping ("/")
public class IndexController {
    
    @GetMapping ("/")
    public String IndexView(){
        return "index.html";
    }
}