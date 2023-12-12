package com.Clinicas.service.impl;

import com.Clinicas.dao.UsuarioDao;
import com.Clinicas.domain.Usuario;
import com.Clinicas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioDao usuarioDao;

    @Autowired
    public UsuarioServiceImpl(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public boolean validarCredenciales(String email, String contrasena) {
        // Lógica para validar las credenciales en la base de datos
        Usuario usuario = usuarioDao.findByEmailAndContrasena(email, contrasena);
        return usuario != null; // Retorna true si se encuentra el usuario con esas credenciales
    }

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        Usuario existingEmail = usuarioDao.findByEmail(usuario.getEmail());
        Usuario existingIdentificacion = usuarioDao.findByIdentificacion(usuario.getIdentificacion());

        if (existingEmail != null || existingIdentificacion != null) {
            // Email o Identificación ya existen en la base de datos
            return false;
        }

        usuarioDao.save(usuario);
        return true;
    }

    @Override
    public Usuario obtenerUsuarioPorEmailYContrasena(String email, String contrasena) {
        // Retorna el usuario por email y contraseña
        return usuarioDao.findByEmailAndContrasena(email, contrasena);
    }
    
    @Override
    public Usuario obtenerUsuarioPorEmail(String email) {
        return usuarioDao.findByEmail(email);
    }


}
