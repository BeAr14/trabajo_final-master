/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BeAr.Seguridad.Service;

import com.portfolio.BeAr.Seguridad.Entity.Rol;
import com.portfolio.BeAr.Seguridad.Enums.RolNombre;
import com.portfolio.BeAr.Seguridad.Repositorio.IRolRepositorio;
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
public class RolService {
    @Autowired
    IRolRepositorio irolRepositorio;
    
    /**
     *
     * @param rolNombre
     * @return
     */
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepositorio.findRolNombre(rolNombre);
    }
    
    /**
     *
     * @param rol
     */
    public void save (Rol rol){
        irolRepositorio.save(rol);
    }
    
    
}
