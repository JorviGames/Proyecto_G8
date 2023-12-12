package com.Clinicas.Controller;

import com.Clinicas.domain.Examen;
import com.Clinicas.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/examen")
public class ExamenController {
    
    @Autowired
    private ExamenService examenService;
    
    @GetMapping("/inicio")
    public String listarExamenes(Model model) {
        
        var examenes = examenService.getExamenes();
        System.out.println("Número de examnes: " + examenes.size());
        model.addAttribute("examenes", examenes);
       
        return "/examen/inicio";
    }
    
    @PostMapping("/guardarExamen")
    public String guardarExamen(Examen examen) {
        examenService.save(examen);
        return "redirect:/examen/inicio";  
    }
    
    @GetMapping("/modificar/{idExamen}")
    public String examenModificar(@PathVariable Long idExamen, Model model) {
        Examen examen = examenService.getExamenById(idExamen);
        model.addAttribute("examen", examen);
        return "/examen/modificar";
    }
    
    @PostMapping("/guardar/{idExamen}")
    public String guardarCambios(@PathVariable Long idExamen, @ModelAttribute Examen examen) {

        Examen existeExamen = examenService.getExamenById(idExamen);
        if (existeExamen != null) {
            existeExamen.setFecha(examen.getFecha());
            existeExamen.setDescripcion(examen.getDescripcion());
            existeExamen.setTipo(examen.getTipo());
            existeExamen.setResultado(examen.getResultado());
            examenService.save(existeExamen);
        }
        return "redirect:/historial";
    }
    
    @GetMapping("/eliminar/{idExamen}")
    public String examenEliminar(Examen examen) {
        examenService.delete(examen);
        return "redirect:/examen/inicio";
    }
    
     @GetMapping("/agregar")
    public String examenAgregar(Model model) {

        return "/examen/agregar";
    }
    
    
    
}
