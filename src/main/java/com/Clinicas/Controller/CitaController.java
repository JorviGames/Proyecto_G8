package com.Clinicas.Controller;

import com.Clinicas.domain.Cita;
import com.Clinicas.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cita")
public class CitaController {
    
    @Autowired
    private CitaService citaService;
    
    @GetMapping("/inicio")
    public String agendarCita(Model model) {
       
        return "/cita/inicio";
    }
    
    @PostMapping("/guardarCita")
    public String guardarCita(Cita cita) {
        citaService.save(cita);
        return "redirect:/index";  
    }
    
}
