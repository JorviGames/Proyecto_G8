package com.Clinicas.Controller;

import com.Clinicas.domain.Usuario;
import com.Clinicas.domain.Vacuna;
import com.Clinicas.domain.Vacunacion;
import com.Clinicas.service.VacunaDisponibleService;
import com.Clinicas.service.VacunaService;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/vacunacion")
public class VacunaController {

    private final VacunaDisponibleService vacunaDisponibleService;
    private final VacunaService vacunaService;

    @Autowired
    public VacunaController(VacunaDisponibleService vacunaDisponibleService, VacunaService vacunaService) {
        this.vacunaDisponibleService = vacunaDisponibleService;
        this.vacunaService = vacunaService;
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

    @PostMapping("/agendar")
    public String agendarVacuna(@RequestParam("fecha") LocalDate fecha, @RequestParam("hora") LocalTime hora, Model model) {
        Vacuna vacuna = new Vacuna();
        vacuna.setFecha_vacuna(fecha);
        vacuna.setHora_vacuna(hora);
        // Aquí asignarías el usuario actual si lo tienes almacenado en la sesión o la lógica correspondiente para vincularlo a la vacuna

        vacunaService.guardarVacuna(vacuna);
        return "redirect:/vacunacion/inicio"; // Cambia a tu página de destino
    }
}
