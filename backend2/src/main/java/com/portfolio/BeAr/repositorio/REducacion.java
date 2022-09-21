/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.BeAr.repositorio;

import com.portfolio.BeAr.entidad.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bergo
 */
@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{

    /**
     *
     * @param nombreE
     * @return
     */
    public Optional<Educacion> findByNombreE(String nombreE);

    /**
     *
     * @param nombreE
     * @return
     */
    public boolean existsByNombreE(String nombreE);
    
}
