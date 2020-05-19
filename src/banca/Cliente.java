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
    String sDireccion;
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

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setsApellidos(String sApellidos) {
        this.sApellidos = sApellidos;
    }

    public void setsDireccion(String sDireccion) {
        this.sDireccion = sDireccion;
    }

    public void setsDni(String sDni) {
        this.sDni = sDni;
    }

    public void setiTelefono(int iTelefono) {
        this.iTelefono = iTelefono;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public void setAcCuentas(ArrayList<Cuenta> acCuentas) {
        this.acCuentas = acCuentas;
    }

    public String getsNombre() {
        return sNombre;
    }

    public String getsApellidos() {
        return sApellidos;
    }

    public String getsDireccion() {
        return sDireccion;
    }

    public String getsDni() {
        return sDni;
    }

    public int getiTelefono() {
        return iTelefono;
    }

    public int getiEdad() {
        return iEdad;
    }

    public ArrayList<Cuenta> getAcCuentas() {
        return acCuentas;
    }
    
}

