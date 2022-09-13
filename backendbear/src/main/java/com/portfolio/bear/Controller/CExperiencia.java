/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.bear.Controller;

import com.portfolio.bear.Dto.dtoExperiencia;
import com.portfolio.bear.Entity.Experiencia;
import com.portfolio.bear.Security.Controller.Mensaje;
import com.portfolio.bear.Service.SExperiencia;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bergo
 */
@RestController
@RequestMapping("explab")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {

	@Autowired
	SExperiencia sExperiencia;

	@GetMapping("/lista")
	public ResponseEntity<List<Experiencia>> list() {
		List<Experiencia> list = sExperiencia.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp) {
		if (StringUtils.isBlank(dtoexp.getNombreE())) {
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		}
		if (StringUtils.isBlank(dtoexp.getDescripcionE())) {
			return new ResponseEntity(new Mensaje("La descripción es obligatoria"), HttpStatus.BAD_REQUEST);
		}

		if (sExperiencia.existsByNombreE(dtoexp.getNombreE())) {
			return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
		}

		Experiencia experiencia = new Experiencia(dtoexp.getNombreE(), dtoexp.getDescripcionE());
		sExperiencia.save(experiencia);

		return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexp) {
		// validamos si existe ID
		if (!sExperiencia.existsById(id)) {
			return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
		}
		//compara nombre exper
		if (sExperiencia.existsByNombreE(dtoexp.getNombreE()) && sExperiencia.getByNombreE(dtoexp.getNombreE()).get().getId() != id) {
			return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
		}
		//no puede estar vacio
		if (StringUtils.isBlank(dtoexp.getNombreE())) {
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		}

		Experiencia experiencia = new Experiencia(dtoexp.getNombreE(), dtoexp.getDescripcionE());
		sExperiencia.save(experiencia);
		return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
	}

	public ResponseEntity<?> delete(@PathVariable("id") int id) {
		if (!sExperiencia.existsById(id)) {
			return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
		}

		sExperiencia.delete(id);

		return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
	}

}
