/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.bear.Security.Repository;

import com.portfolio.bear.Security.Entity.Rol;
import com.portfolio.bear.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bergo
 */
@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
	Optional<Rol> findByRolNombre (RolNombre rolNombre);
	
}
