package com.Clinicas.Controller;

import com.Clinicas.domain.Vacuna;
import com.Clinicas.domain.Vacunacion;
import com.Clinicas.service.VacunaDisponibleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vacunacion")
public class VacunaController {

    private final VacunaDisponibleService vacunaDisponibleService;

    @Autowired
    public VacunaController(VacunaDisponibleService vacunaDisponibleService) {
        this.vacunaDisponibleService = vacunaDisponibleService;
    }

    @GetMapping("/inicio")
    public String mostrarVacunasDisponibles(Model model) {
        List<Vacunacion> vacunas = vacunaDisponibleService.obtenerVacunasDisponibles();
        model.addAttribute("vacunas", vacunas);
        return "/vacunacion/inicio";
    }

    @GetMapping("/modificar")
    public String vacunaModifica(Model model) {
        // Lógica para modificar vacunas
        return "/vacunacion/modificar";
    }
}
