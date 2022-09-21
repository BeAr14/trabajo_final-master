/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BeAr.servicio;

import com.portfolio.BeAr.entidad.Educacion;
import com.portfolio.BeAr.repositorio.REducacion;
import java.util.List;
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
public class Seducacion {
    @Autowired
    REducacion rEducacion;
    
    /**
     *
     * @return
     */
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
    /**
     *
     * @param nombreE
     * @return
     */
    public Optional<Educacion> getByNombreE(String nombreE){
        return rEducacion.findByNombreE(nombreE);
 }
    
    /**
     *
     * @param educacion
     */
    public void save(Educacion educacion){
    rEducacion.save(educacion);
    }
    
    /**
     *
     * @param id
     */
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    /**
     *
     * @param id
     * @return
     */
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    /**
     *
     * @param nombreE
     * @return
     */
    public boolean existsByNombreE(String nombreE){
        return rEducacion.existsByNombreE(nombreE);
    }
}
    
