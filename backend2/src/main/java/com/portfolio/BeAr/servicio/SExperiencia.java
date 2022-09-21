
package com.portfolio.BeAr.servicio;

import com.portfolio.BeAr.entidad.Experiencia;
import com.portfolio.BeAr.repositorio.RExperiencia;
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
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
            
    /**
     *
     * @return
     */
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }        
    
    /**
     *
     * @param id
     * @return
     */
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    
    /**
     *
     * @param nombreEx
     * @return
     */
    public Optional<Experiencia> getByNombreEx(String nombreEx){
        return rExperiencia.findByNombreEx(nombreEx);
    }
    
    /**
     *
     * @param expe
     */
    public void save(Experiencia expe){
        rExperiencia.save(expe);
    }
    
    /**
     *
     * @param id
     */
    public void delete (int id){
        rExperiencia.deleteById(id);
    }
    
    /**
     *
     * @param id
     * @return
     */
    public boolean existsById (int id){
        return rExperiencia.existsById(id);
    }
    
    /**
     *
     * @param nombreEx
     * @return
     */
    public boolean existsByNombreEx (String nombreEx){
        return rExperiencia.existsByNombreEx(nombreEx);
    }
}
