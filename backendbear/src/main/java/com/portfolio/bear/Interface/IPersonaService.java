/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.bear.Interface;

import com.portfolio.bear.Entity.Persona;
import java.util.List;


/**
 *
 * @author bergo
 */
public interface IPersonaService {
	//traer una perdona
	public List<Persona> getPersona();

	//guardar un obejto de tipo persona
	public void savePersona(Persona persona);

	//eliminar un usuario por id
	public void deletePersona(Long id);

	//buscar persona por id
	public Persona findPersona(Long id);
	
}
