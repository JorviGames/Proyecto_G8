/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Clinicas.Controller;


import com.Clinicas.domain.Usuario;
import com.Clinicas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    private final UsuarioService usuarioService;

    @Autowired
    public RegistroController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public String registrarNuevoUsuario(@ModelAttribute Usuario usuario, Model model) {
        boolean registrado = usuarioService.registrarUsuario(usuario);
        if (registrado) {
            return "redirect:/login"; // Redirecciona al inicio de sesión si se registra correctamente
        } else {
            model.addAttribute("error", "Ya existe una cuenta con ese email o identificación");
            return "InicioYRe/Registro"; // Ruta a la plantilla de registro en caso de error
        }
    }
}