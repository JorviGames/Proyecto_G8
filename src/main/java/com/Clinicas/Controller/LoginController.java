/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Clinicas.Controller;

import com.Clinicas.domain.Usuario;
import com.Clinicas.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author yorvi
 */
@Controller
public class LoginController {

    private final UsuarioService usuarioService;

    @Autowired
    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/login")
    public String mostrarFormularioLogin(HttpSession session, Model model) {
        boolean sessionActive = session.getAttribute("usuarioAutenticado") != null; // Verifica si el usuario está autenticado
        model.addAttribute("sessionActiva", sessionActive);
        return "login"; // Nombre de la página de inicio de sesión
    }

    @PostMapping("/login")
    public String procesarInicioSesion(@RequestParam("usuario") String email, 
                                       @RequestParam("contrasena") String contrasena, 
                                       HttpSession session, Model model) {
        Usuario usuarioAutenticado = usuarioService.obtenerUsuarioPorEmailYContrasena(email, contrasena);
        
        if (usuarioAutenticado != null) {
            session.setAttribute("usuarioAutenticado", usuarioAutenticado); // Guarda el usuario autenticado en la sesión
            return "redirect:/perfil"; // Redirige al perfil del usuario autenticado
        } else {
            model.addAttribute("error", "Credenciales no válidas"); // Agrega el mensaje de error al modelo
            return "login"; // Vuelve a cargar la página de inicio de sesión
        }
    }

    @GetMapping("/logout")
    public String cerrarSesion(HttpSession session) {
        session.invalidate(); // Invalida la sesión actual
        return "redirect:/"; // Redirige al usuario a la página de inicio
    }
}