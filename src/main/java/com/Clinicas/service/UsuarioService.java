
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Clinicas.service;

import com.Clinicas.domain.Usuario;
import java.util.List;

/**
 *
 * @author yorvi
 */
public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    
    public Usuario getUsuarioById(Long id);
    
    public void save(Usuario usuario);
    
    public void delete(Usuario usuario);

    boolean validarCredenciales(String email, String contrasena);

    boolean registrarUsuario(Usuario usuario);

    Usuario obtenerUsuarioPorEmailYContrasena(String email, String contrasena);
    Usuario obtenerUsuarioPorEmail(String email);
}
