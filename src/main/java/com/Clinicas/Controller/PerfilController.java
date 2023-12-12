/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Clinicas.Controller;

import com.Clinicas.domain.Usuario;
import com.Clinicas.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yorvi
 */
@Controller
public class PerfilController {

    private final UsuarioService usuarioService;

    @Autowired
    public PerfilController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/perfil")
    public String mostrarPerfil(HttpSession session, Model model) {
        // Obtener el email del usuario desde la sesión
        String email = (String) session.getAttribute("usuario");

        // Obtener el usuario desde el servicio
        Usuario usuario = usuarioService.obtenerUsuarioPorEmail(email);

        // Agregar el usuario al modelo para mostrarlo en la vista
        model.addAttribute("usuario", usuario);

        return "perfil"; // Nombre de la página de perfil
    }
}