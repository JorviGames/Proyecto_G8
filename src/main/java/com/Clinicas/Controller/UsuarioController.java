
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Clinicas.Controller;

import com.Clinicas.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UsuarioController {

    @Autowired
    private HttpSession session; // Necesario para acceder a la sesión

    @GetMapping("/")
    public String index(Model model) {
        // Verifica si hay una sesión activa
        boolean sessionActive = session.getAttribute("usuario") != null; // Reemplaza "usuario" con el nombre de tu atributo de sesión

        // Envía la variable a la vista
        model.addAttribute("sessionActiva", sessionActive);

        return "index"; // Reemplaza "index" con el nombre de tu vista HTML
    }

    @GetMapping("/registro")
    public String mostrarFormularioRegistro() {
        return "InicioYRe/Registro";
    }
    
    
}

