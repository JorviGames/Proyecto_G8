package com.Clinicas.Controller;

import com.Clinicas.domain.Cita;
import com.Clinicas.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/historial")
public class HistorialController {

    @Autowired
    private CitaService citaService;

    @GetMapping("/inicio")
    public String listarHistorial(Model model) {

        var citas = citaService.getCitas();
        System.out.println("Número de citas: " + citas.size());
        model.addAttribute("citas", citas);

        return "/historial/inicio";
    }

    @GetMapping("/eliminar/{idCita}")
    public String citaEliminar(Cita cita) {
        citaService.delete(cita);
        return "redirect:/historial/inicio";
    }

    @GetMapping("/modificar/{idCita}")
    public String citaModificar(@PathVariable Long idCita, Model model) {
        Cita cita = citaService.getCitaById(idCita);
        model.addAttribute("cita", cita);
        return "/historial/modificar";
    }

    @PostMapping("/guardar/{idCita}")
    public String guardarCambios(@PathVariable Long idCita, @ModelAttribute Cita cita) {

        Cita existeCita = citaService.getCitaById(idCita);
        if (existeCita != null) {
            existeCita.setFecha(cita.getFecha());
            existeCita.setHora(cita.getHora());
            existeCita.setCentro(cita.getCentro());
            existeCita.setMotivo(cita.getMotivo());
            citaService.save(existeCita);
        }
        return "redirect:/historial/inicio";
    }
    
   

}
