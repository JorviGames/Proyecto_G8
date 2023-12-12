package com.Clinicas.Controller;

import com.Clinicas.domain.Usuario;
import com.Clinicas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioListaController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/inicio")
    public String mostrarInicio(Model model) {

        var usuarios = usuarioService.getUsuarios();
        System.out.println("Número de usuarios: " + usuarios.size());
        model.addAttribute("usuarios", usuarios);
        return "usuario/inicio";
    }

    @PostMapping("/guardarUsuario")
    public String guardarUsuario(Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuario/inicio";
    }

    @GetMapping("/modificar/{idUser}")
    public String usuarioModificar(@PathVariable Long idUser, Model model) {
        Usuario usuario = usuarioService.getUsuarioById(idUser);
        model.addAttribute("usuario", usuario);
        return "/usuario/modificar";
    }

    @PostMapping("/guardar/{idUser}")
    public String guardarCambios(@PathVariable Long idUser, @ModelAttribute Usuario usuario) {

        Usuario existeUsuario = usuarioService.getUsuarioById(idUser);
        if (existeUsuario != null) {
            existeUsuario.setNombre(usuario.getNombre());
            existeUsuario.setIdentificacion(usuario.getIdentificacion());
            existeUsuario.setCanton(usuario.getCanton());
            existeUsuario.setTelefono(usuario.getTelefono());
            existeUsuario.setEmail(usuario.getEmail());
            existeUsuario.setContrasena(usuario.getContrasena());

            usuarioService.save(existeUsuario);
        }
        return "redirect:/historial";
    }

    @GetMapping("/eliminar/{idUser}")
    public String usuarioEliminar(Usuario usuario) {
        usuarioService.delete(usuario);
        return "redirect:/usuario/inicio";
    }
    
    

}
