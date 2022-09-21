package com.portfolio.BeAr.servicio;

import com.portfolio.BeAr.Interface.IPersonaService;
import com.portfolio.BeAr.entidad.Persona;
import com.portfolio.BeAr.repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bergo
 */
@Service
public class ImpPersonaServicio implements IPersonaService {
    @Autowired IPersonaRepositorio ipersonaRepository;
    
    /**
     *
     * @return
     */
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll(); 
        return persona;
    }            

    /**
     *
     * @param persona
     */
    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }
      
    /**
     *
     * @param id
     */
    @Override
    public void deletePersona(Long id) {
         ipersonaRepository.deleteById(id);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Persona findPersona(Long id) {
         Persona persona = ipersonaRepository.findById(id).orElse(null);
         return persona;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Persona editPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
         
 }
    

