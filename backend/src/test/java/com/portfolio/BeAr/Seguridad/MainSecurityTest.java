/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.portfolio.BeAr.Seguridad;

import com.portfolio.BeAr.Seguridad.jwt.JwtTokenFilter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author bergo
 */
public class MainSecurityTest {
    
    public MainSecurityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of jwtTokenFilter method, of class MainSecurity.
     */
    @Test
    public void testJwtTokenFilter() {
        System.out.println("jwtTokenFilter");
        MainSecurity instance = new MainSecurity();
        JwtTokenFilter expResult = null;
        JwtTokenFilter result = instance.jwtTokenFilter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passwordEncoder method, of class MainSecurity.
     */
    @Test
    public void testPasswordEncoder() {
        System.out.println("passwordEncoder");
        MainSecurity instance = new MainSecurity();
        PasswordEncoder expResult = null;
        PasswordEncoder result = instance.passwordEncoder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configure method, of class MainSecurity.
     */
    @Test
    public void testConfigure_HttpSecurity() throws Exception {
        System.out.println("configure");
        HttpSecurity http = null;
        MainSecurity instance = new MainSecurity();
        instance.configure(http);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticationManager method, of class MainSecurity.
     */
    @Test
    public void testAuthenticationManager() throws Exception {
        System.out.println("authenticationManager");
        MainSecurity instance = new MainSecurity();
        AuthenticationManager expResult = null;
        AuthenticationManager result = instance.authenticationManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticationManagerBean method, of class MainSecurity.
     */
    @Test
    public void testAuthenticationManagerBean() throws Exception {
        System.out.println("authenticationManagerBean");
        MainSecurity instance = new MainSecurity();
        AuthenticationManager expResult = null;
        AuthenticationManager result = instance.authenticationManagerBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configure method, of class MainSecurity.
     */
    @Test
    public void testConfigure_AuthenticationManagerBuilder() throws Exception {
        System.out.println("configure");
        AuthenticationManagerBuilder auth = null;
        MainSecurity instance = new MainSecurity();
        instance.configure(auth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
