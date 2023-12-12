/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Clinicas.service;

import com.Clinicas.domain.Usuario;

/**
 *
 * @author yorvi
 */
public interface UsuarioService {

    boolean validarCredenciales(String email, String contrasena);
    boolean registrarUsuario(Usuario usuario);
}
