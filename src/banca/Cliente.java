/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;
import java.util.ArrayList;
/**
 *
 * @author roly
 */
public class Cliente {
    String sNombre;
    String sApellidos;
    String sDni;
    int iTelefono;
    int iEdad;
    ArrayList<Cuenta> acCuentas;
public void SacarDinero(Cuenta c,int d){
    
    if(c.RetirarFondos(d)){
    
        System.out.println("Has retirado: "+d+" € de tu cuenta./n"+"Le quedan: "+c.getiSaldo()+" € en su cuenta.");
        
    }
    else{
        System.out.println("No tienes fondos suficientes./n"+"Tiene: "+c.getiSaldo()+" € en su cuenta.");
    }
}
    

public void IngresarDinero(){}

}
