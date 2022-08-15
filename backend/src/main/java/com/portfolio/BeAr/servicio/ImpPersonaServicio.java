package com.portfolio.BeAr.servicio;

import com.portfolio.BeAr.Interface.IPersonaService;
import com.portfolio.BeAr.entidad.Persona;
import com.portfolio.BeAr.repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpPersonaServicio implements IPersonaService {
    @Autowired IPersonaRepositorio ipersonaRepository;
    
    
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll(); 
        return persona;
    }            

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }
      

    @Override
    public void deletePersona(Long id) {
         ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
         Persona persona = ipersonaRepository.findById(id).orElse(null);
         return persona;
    }

    @Override
    public Persona editPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
         
 }
    

