
package com.Clinicas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cita")
public class CitaController {
    
    @GetMapping("/inicio")
    public String agendarCita(Model model) {
       
        return "/cita/inicio";
    }
    
    @GetMapping("/modificar")
    public String modificarCita(Model model) {

        return "/cita/modificar";
    }
    
}
