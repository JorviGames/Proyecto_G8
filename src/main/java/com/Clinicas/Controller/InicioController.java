/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Clinicas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yorvi
 */
@Controller
public class InicioController {

    @GetMapping("/")
    public String showInicioPage() {
        return "InicioYRe/inicioS"; // Devuelve la vista inicioS al acceder a la raíz
    }

    @GetMapping("/Registro")
    public String showRegistroPage() {
        return "InicioYRe/Registro"; // Devuelve la vista Registro al acceder a /registro
    }

    @GetMapping("/index")
    public String showIndexPage() {
        return "index"; // Nombre de tu vista index.html
    }
}
