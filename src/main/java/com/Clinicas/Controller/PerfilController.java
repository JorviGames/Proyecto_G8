/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Clinicas.Controller;

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

    @GetMapping("/perfil")
    public String verPerfil() {
        // Lógica para cargar los datos del perfil del usuario
        return "perfil"; // Este es el nombre de la vista del perfil
    }
}
