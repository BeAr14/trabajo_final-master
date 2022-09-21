
package com.portfolio.BeAr.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author bergo
 */
public class dtoExperiencia {
    @NotBlank
    private String nombreEx;
    @NotBlank
    private String descripcionEx;
    
    //constructor

    /**
     *
     */

    public dtoExperiencia() {
    }

    /**
     *
     * @param nombreEx
     * @param descripcionEx
     */
    public dtoExperiencia(String nombreEx, String descripcionEx) {
        this.nombreEx = nombreEx;
        this.descripcionEx = descripcionEx;
    }
    
    //get y set

    /**
     *
     * @return
     */

    public String getNombreEx() {
        return nombreEx;
    }

    /**
     *
     * @param nombreEx
     */
    public void setNombreEx(String nombreEx) {
        this.nombreEx = nombreEx;
    }

    /**
     *
     * @return
     */
    public String getDescripcionEx() {
        return descripcionEx;
    }

    /**
     *
     * @param descripcionEx
     */
    public void setDescripcionEx(String descripcionEx) {
        this.descripcionEx = descripcionEx;
    }
    
    
    
}
