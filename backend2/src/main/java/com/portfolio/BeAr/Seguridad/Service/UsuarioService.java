/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BeAr.Seguridad.Service;

import com.portfolio.BeAr.Seguridad.Entity.Rol;
import com.portfolio.BeAr.Seguridad.Entity.Usuario;
import com.portfolio.BeAr.Seguridad.Enums.RolNombre;
import com.portfolio.BeAr.Seguridad.Repositorio.IUsuarioRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bergo
 */
@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepositorio iusuarioRepositorio;
    
    /**
     *
     * @param nombreUsuario
     * @return
     */
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepositorio.findByNombreUsuario(nombreUsuario);
    }
    
    /**
     *
     * @param nombreUsuario
     * @return
     */
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepositorio.existsByNombreUsuario(nombreUsuario);
    }
    
    /**
     *
     * @param email
     * @return
     */
    public boolean existsByEmail(String email){
        return iusuarioRepositorio.existsByEmail(email);
    }
      
    /**
     *
     * @param usuario
     */
    public void save (Usuario usuario){
        iusuarioRepositorio.save(usuario);
    }
}
