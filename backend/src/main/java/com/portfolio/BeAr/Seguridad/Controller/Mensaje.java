/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BeAr.Seguridad.Controller;

/**
 *
 * @author bergo
 */
public class Mensaje {

    private String msj;

//constructor
    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.msj = mensaje;
    }

//get y set
    public String getMensaje() {
        return msj;
    }

    public void setMensaje(String mensaje) {
        this.msj = mensaje;
    }

}
