/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BeAr.Seguridad.Repositorio;

import com.portfolio.BeAr.Seguridad.Entity.Rol;
import com.portfolio.BeAr.Seguridad.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRolRepositorio extends JpaRepository<Rol, Integer>{
    Optional<Rol> findRolNombre(RolNombre rolNombre);
    
}
