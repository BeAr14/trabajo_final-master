
package com.portfolio.BeAr.Interface;

import com.portfolio.BeAr.entidad.Persona;
import java.util.List;



public interface IPersonaService {
    //trae lista personas
    public List<Persona> getPersona();
    
    //guardar persona
    public void savePersona(Persona persona);
    
    //eliminar persona
    public void deletePersona(Long id);
    
    //buscar perdona
    public Persona findPersona(Long id);
    
    //editar persona
    public Persona editPersona(Long id);
    
}
