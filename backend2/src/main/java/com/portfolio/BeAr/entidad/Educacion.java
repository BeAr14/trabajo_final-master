/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BeAr.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author bergo
 */
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;

    /**
     *
     */
    public Educacion() {
    }

    /**
     *
     * @param nombreE
     * @param descripcionE
     */
    public Educacion(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

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
    public String getNombreE() {
        return nombreE;
    }

    /**
     *
     * @param nombreE
     */
    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    /**
     *
     * @return
     */
    public String getDescripcionE() {
        return descripcionE;
    }

    /**
     *
     * @param descripcionE
     */
    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    
    
}
