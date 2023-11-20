package com.Clinicas.Controller;

import com.Clinicas.domain.Vacuna;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vacunacion")
public class VacunaController {
    
    @GetMapping("/inicio")
    public String listarVacunas(Model model) {
       
        return "/vacunacion/inicio";
    }
    
   @GetMapping("/modificar/{}")
    public String vacunaModifica(Vacuna vacuna, Model model) {
        
        return "/arbol/modificar";
    }
    
}
