
package com.Alejandro.EggNewsLoginUsers.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// @author new53

@Controller
@RequestMapping ("/login_users")
public class IndexController {
    
    @GetMapping
    public String getIndex(){
        return "login_form.html";
    }
}