/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

/**
 *
 * @author roly
 */
public class Gestor {
    
    
    public void CrearCuenta(Cliente c,int s,String nc, int ta, int lr,int lo,String f){
        
        
        Cuenta a = new Cuenta(s,nc,ta,lr,lo,0,0,f);
        c.AñadirCuenta(a);
    
    }
}
