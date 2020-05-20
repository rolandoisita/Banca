/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author roly
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    /**
     * Test of SacarDinero method, of class Cliente.
     * Probamos si el metodo funciona como deberia y si funcionan las restricciones de saldo
     */
    @Test
    public void testSacarDinero() {
       Cliente c = new Cliente("Naruto","Uzumaki","konoha","232124X", 45642, 23);
       Cuenta c1 = new Cuenta(500,"72382364","20/05/2020");
       Tarjeta t1 = new Tarjeta(300,300);
       
        assertTrue(c.SacarDinero(c1,t1,100)==400);
        assertFalse(c.SacarDinero(c1, t1, 100)!=400);
        
        
        assertTrue(c.SacarDinero(c1, t1,400)==0);
        assertFalse(c.SacarDinero(c1, t1, 400)!=0);
    }

    /**
     * Test of IngresarDinero method, of class Cliente.
     */
    @Test
    public void testIngresarDinero() {
       Cliente c = new Cliente("Naruto","Uzumaki","konoha","232124X", 45642, 23);
       Cuenta c1 = new Cuenta(500,"72382364","20/05/2020");
       Tarjeta t1 = new Tarjeta(300,300);
       
        assertTrue(c.IngresarDinero(c1,300)==800);
        assertFalse(c.IngresarDinero(c1,300)!=800);
    }

    /**
     * Test of AñadirCuenta method, of class Cliente.
     */
    @Test
    public void testAñadirCuenta() {
      
       Cliente c = new Cliente("Naruto","Uzumaki","konoha","232124X", 45642, 23);
       Cuenta c1 = new Cuenta(500,"72382364","20/05/2020");
        
        assertTrue(c.AñadirCuenta(c1)==true);
        assertFalse(c.AñadirCuenta(c1)==false);
    }

}
 
