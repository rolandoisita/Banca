/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

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
public class CuentaTest {
    
    public CuentaTest() {
    }
    /**
     * Test of RetirarFondos method, of class Cuenta.
     * Probamos el metodo retirar dinero
     */
    @Test
    public void testRetirarFondos() {
        Cuenta c1 = new Cuenta(250,"72382364","20/05/2020");
        Tarjeta t1 = new Tarjeta(300,300);
        /**
         * Probamos que los fondos se han retirado corectamente si los limites de la tarjeta no se pasan
         * y que la cuenta no se queda en negativo
         */
        assertTrue(c1.RetirarFondos(200,t1)==true);
        assertFalse(c1.RetirarFondos(200, t1)!=true);
        /**
         * Probamos que si retiramos mas dinero que el limite de la tarjeta
         * o que la cuenta se quede negativo no se retiran los fondos
         */
        assertTrue(c1.RetirarFondos(400, t1)==false);
        assertTrue(c1.RetirarFondos(300, t1)==false);
    }

    /**
     * Test of IngresarFondos method, of class Cuenta.
     * Probamos que los fondos se añaden a la cuenta correctamente
     */
    @Test
    public void testIngresarFondos() {
        Cuenta c1 = new Cuenta(250,"72382364","20/05/2020");
        
        assertTrue(c1.IngresarFondos(300)==true);
        assertFalse(c1.IngresarFondos(300)!=true);
    }
    /**
     * Test of AñadirTarjeta method, of class Cuenta.
     * Probamos que la tareta se añade correctamente a la cuenta
     */
    @Test
    public void testAñadirTarjeta() {
        Cuenta c1 = new Cuenta(250,"72382364","20/05/2020");
        Tarjeta t1 = new Tarjeta(300,300);
        
        assertTrue(c1.AñadirTarjeta(t1)==true);
         assertFalse(c1.AñadirTarjeta(t1)!=true);
    }

    
   
    
}
