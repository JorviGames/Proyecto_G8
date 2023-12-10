
package com.Clinicas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/perfil")
public class PerfilController {
    
    @GetMapping("/inicio")
    public String verPerfil(Model model) {
       
        return "/perfil/inicio";
    }
    
    @GetMapping("/modificar")
    public String modificarPefl(Model model) {

        return "/perfil/modificar";
    }
    
}
