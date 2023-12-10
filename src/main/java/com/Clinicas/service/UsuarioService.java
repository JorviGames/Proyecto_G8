/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Clinicas.service;

import com.Clinicas.domain.Usuario;
import java.util.List;

/**
 *
 * @author Dylan
 */
public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    
    public Usuario getUsuario(Usuario cita);
    
    public void save(Usuario cita);
    
    public void delete(Usuario cita);
    
    
}
