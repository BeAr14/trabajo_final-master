
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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEx;
    private String descripcionEx;
    
    //constructor

    /**
     *
     */

    public Experiencia() {
    }

    /**
     *
     * @param nombreEx
     * @param descripcionEx
     */
    public Experiencia(String nombreEx, String descripcionEx) {
        this.nombreEx = nombreEx;
        this.descripcionEx = descripcionEx;
    }

//get y set

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
