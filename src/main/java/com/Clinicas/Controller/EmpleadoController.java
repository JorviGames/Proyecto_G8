package com.Clinicas.Controller;

import com.Clinicas.domain.Empleado;
import com.Clinicas.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/inicio")
    public String mostrarInicio(Model model) {

        var empleados = empleadoService.getEmpleados();
        System.out.println("Número de empleados: " + empleados.size());
        model.addAttribute("empleados", empleados);
        return "empleado/inicio";
    }

    @PostMapping("/guardarEmpleado")
    public String guardarEmpleado(Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/empleado/inicio";
    }

    @GetMapping("/modificar/{idEmpleado}")
    public String empleadoModificar(@PathVariable Long idEmpleado, Model model) {
        Empleado empleado = empleadoService.getEmpleadoById(idEmpleado);
        model.addAttribute("empleado", empleado);
        return "/empleado/modificar";
    }

    @PostMapping("/guardar/{idEmpleado}")
    public String guardarCambios(@PathVariable Long idEmpleado, @ModelAttribute Empleado empleado) {

        Empleado existeEmpleado = empleadoService.getEmpleadoById(idEmpleado);
        if (existeEmpleado != null) {
            existeEmpleado.setNombre(empleado.getNombre());
            existeEmpleado.setApellidos(empleado.getApellidos());
            existeEmpleado.setIdentificacion(empleado.getIdentificacion());
            existeEmpleado.setPuesto(empleado.getPuesto());
            existeEmpleado.setSalario(empleado.getSalario());

            empleadoService.save(existeEmpleado);
        }

        return "redirect:/empleado/inicio";
    }

    @GetMapping("/eliminar/{idEmpleado}")
    public String empleadoEliminar(Empleado empleado) {
        empleadoService.delete(empleado);
        return "redirect:/empleado/inicio";
    }
    
    @GetMapping("/agregar")
    public String empleadoAgregar(Model model) {
        
        return "/empleado/agregar";
    }
}
