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
public class GestorTest {
    
    public GestorTest() {
    }
    
    /**
     * Test of CrearCliente method, of class Gestor.
     * comprobamos que el cliente se crea corectamente
     */
    @Test
    public void testCrearCliente() {
        Gestor g1= new Gestor();
        
        assertTrue(g1.CrearCliente("naruto","uzumaki","konoha","3434X",6666666,25)==true);
        assertFalse(g1.CrearCliente("naruto","uzumaki","konoha","3434X",6666666,25)!=true);
        
    }

    /**
     * Test of CrearCuenta method, of class Gestor.
     * comprobamos que se cra la cuenta correctamente
     */
    @Test
    public void testCrearCuenta() {
        Gestor g1= new Gestor();
        Cliente c = new Cliente("sasuke","uchiha","konoha","232124X", 453242, 24);
        
        assertTrue(g1.CrearCuenta(c,10000, "1721253172", "20/05/2020")==true);
        assertFalse(g1.CrearCuenta(c,10000, "1721253172", "20/05/2020")!=true);
    }

    /**
     * Test of ModificarCliente method, of class Gestor.
     * No se como probar este metodo
     */
    @Test
    public void testModificarCliente() {
       
        
        
    }
    
}
