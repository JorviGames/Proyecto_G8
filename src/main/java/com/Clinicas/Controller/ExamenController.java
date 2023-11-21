package com.Clinicas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/examen")
public class ExamenController {
    
    @GetMapping("/inicio")
    public String listarExamenes(Model model) {
       
        return "/examen/inicio";
    }
    
}
