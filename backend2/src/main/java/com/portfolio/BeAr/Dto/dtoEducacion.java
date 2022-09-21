/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BeAr.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author bergo
 */
public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    /**
     *
     */
    public dtoEducacion() {
    }

    /**
     *
     * @param nombreE
     * @param descripcionE
     */
    public dtoEducacion(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
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
