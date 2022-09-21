
package com.portfolio.BeAr.Interface;

import com.portfolio.BeAr.entidad.Persona;
import java.util.List;

/**
 *
 * @author bergo
 */
public interface IPersonaService {
    //trae lista personas

    /**
     *
     * @return
     */
    public List<Persona> getPersona();
    
    //guardar persona

    /**
     *
     * @param persona
     */
    public void savePersona(Persona persona);
    
    //eliminar persona

    /**
     *
     * @param id
     */
    public void deletePersona(Long id);
    
    //buscar perdona

    /**
     *
     * @param id
     * @return
     */
    public Persona findPersona(Long id);
    
    //editar persona

    /**
     *
     * @param id
     * @return
     */
    public Persona editPersona(Long id);
    
}
