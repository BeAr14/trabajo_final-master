
package com.portfolio.BeAr.repositorio;

import com.portfolio.BeAr.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bergo
 */
@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Long> {
    
}
