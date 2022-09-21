/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BeAr.Seguridad.Repositorio;

import com.portfolio.BeAr.Seguridad.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bergo
 */
@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer>{

    /**
     *
     * @param nombreUsuario
     * @return
     */
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    /**
     *
     * @param nombreUsuario
     * @return
     */
    boolean existsByNombreUsuario(String nombreUsuario);

    /**
     *
     * @param mail
     * @return
     */
    boolean existsByEmail(String mail);
    
}
