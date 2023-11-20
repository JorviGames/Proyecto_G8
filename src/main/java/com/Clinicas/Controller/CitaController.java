package com.Clinicas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/citas")
public class CitaController {
    
    @GetMapping("/inicio")
    public String agendarCita(Model model) {
       
        return "/citas/inicio";
    }
    
}
