
package com.portfolio.BeAr.repositorio;

import com.portfolio.BeAr.entidad.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bergo
 */
@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {

    /**
     *
     * @param nombreEx
     * @return
     */
    public Optional<Experiencia> findByNombreEx(String nombreEx);

    /**
     *
     * @param nombreEx
     * @return
     */
    public boolean existsByNombreEx(String nombreEx);
}
