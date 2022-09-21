/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.BeAr.Seguridad.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author bergo
 */
public class JwtDto {
    private String token;
    private String bearer = "bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authorities;
    
    //constructor

    /**
     *
     * @param token
     * @param nombreUsuario
     * @param authorities
     */

    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }

   //get y set

    /**
     *
     * @return
     */

    public String getToken() {
        return token;
    }

    /**
     *
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     *
     * @return
     */
    public String getBearer() {
        return bearer;
    }

    /**
     *
     * @param bearer
     */
    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    /**
     *
     * @return
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     *
     * @param nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     *
     * @return
     */
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    /**
     *
     * @param authorities
     */
    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
    
    
}
