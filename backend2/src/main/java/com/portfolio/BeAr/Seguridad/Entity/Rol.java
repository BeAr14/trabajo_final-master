/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BeAr.Seguridad.Entity;

import com.portfolio.BeAr.Seguridad.Enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author bergo
 */
@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;
    
    //constructor

    /**
     *
     */

    public Rol() {
    }

    /**
     *
     * @param rolNombre
     */
    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    
    //getter y setter

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public RolNombre getRolNombre() {
        return rolNombre;
    }

    /**
     *
     * @param rolNombre
     */
    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
      
 }
