/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Clinicas.dao;

import com.Clinicas.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yorvi
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByEmailAndContrasena(String email, String contrasena);
    Usuario findByEmail(String email);
    Usuario findByIdentificacion(String identificacion); // Agregamos este método
}
