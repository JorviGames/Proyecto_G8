package com.Clinicas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @GetMapping("/inicio")
    public String listarExamenes(Model model) {
       
        return "/empleado/inicio";
    }
    
    @GetMapping("/modificar")
    public String modificarEmpelado(Model model) {

        return "/empleado/modificar";
    }
    
}
