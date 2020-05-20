/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;
import java.util.ArrayList;
/**
 * Una clase CLiente para guardar los datos de los clientes ademas de poder realizar algunas operacioens
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
    
    /**
     * Metodo para retirar dinero de una cuenta del cliente.
     * @param c recibe una cuenta del cliente por parametro
     * @param t recibe una tarjeta del cliente por parametro
     * @param d recibe la cantidad de dinero que se desea retirar de la cuenta
     * @return saldo
     */
    public int SacarDinero(Cuenta c,Tarjeta t,int d){
    
    if(c.RetirarFondos(d,t)){
    
        return c.getiSaldo();
        
    }
    else{
        return 0;
    }
}

    /**
     * Constructor de la clase para crear nuevos objetos
     * @param sNombre nombre
     * @param sApellidos apellidos
     * @param sDireccion direccion
     * @param sDni dni
     * @param iTelefono telefono
     * @param iEdad edad
     */
    public Cliente(String sNombre, String sApellidos, String sDireccion, String sDni, int iTelefono, int iEdad) {
        this.sNombre = sNombre;
        this.sApellidos = sApellidos;
        this.sDireccion = sDireccion;
        this.sDni = sDni;
        this.iTelefono = iTelefono;
        this.iEdad = iEdad;
    }
    
    /**
     * Metodo para ingresar dinero en una cuenta del cliente
     * @param c recibe una cuenta del cliente por parametro
     * @param d recibe la cantidad que se desea ingresar
     * @return saldo
     */
    public int IngresarDinero(Cuenta c, int d){

    c.IngresarFondos(d);
    return c.getiSaldo();

}
    
    /**
     *Metodo para añadir una cuenta al Cliente
     * @param c recibe la cuenta que queremos añadir por parametro
     * @return  boolean 
     */
    public boolean AñadirCuenta(Cuenta c){
    
        this.acCuentas.add(c);
        return true; 
    };
    
   
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

