package com.Clinicas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/historial")
public class HistorialController {
    
    @GetMapping("/inicio")
    public String listarHistorial(Model model) {
       
        return "/historial/inicio";
    }
    
    @GetMapping("/modificar")
    public String modificarHistorial(Model model) {

        return "/historial/modificar";
    }
    
}
