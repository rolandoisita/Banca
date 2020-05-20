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
     * @see RetirarFondos de la Clase Cuenta
     */
    public void SacarDinero(Cuenta c,Tarjeta t,int d){
    
    if(c.RetirarFondos(d,t)){
    
        System.out.println("Has retirado: "+d+" € de tu cuenta./n"+"Le quedan: "+c.getiSaldo()+" € en su cuenta.");
        
    }
    else{
        System.out.println("No se han podido retirar lso fondos por falta de saldo o limite de retirada./n"+"Tiene: "+c.getiSaldo()+" € en su cuenta.");
    }
}

    /**
     * Constructor de la clase para crear nuevos objetos
     * @param sNombre
     * @param sApellidos
     * @param sDireccion
     * @param sDni
     * @param iTelefono
     * @param iEdad
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
     * @see IngresarFondos de la Clase Cuenta
     */
    public void IngresarDinero(Cuenta c, int d){

    c.IngresarFondos(d);
    System.out.println("Se han ingresado "+d+" € a su cuenta.");

}
    
    /**
     *Metodo para añadir una cuenta al Cliente
     * @param c recibe la cuenta que queremos añadir por parametro
     */
    public void AñadirCuenta(Cuenta c){
    
        this.acCuentas.add(c);
        
    };
    
    /**
     *
     * @param sNombre
     */
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    /**
     *
     * @param sApellidos
     */
    public void setsApellidos(String sApellidos) {
        this.sApellidos = sApellidos;
    }

    /**
     *
     * @param sDireccion
     */
    public void setsDireccion(String sDireccion) {
        this.sDireccion = sDireccion;
    }

    /**
     *
     * @param sDni
     */
    public void setsDni(String sDni) {
        this.sDni = sDni;
    }

    /**
     *
     * @param iTelefono
     */
    public void setiTelefono(int iTelefono) {
        this.iTelefono = iTelefono;
    }

    /**
     *
     * @param iEdad
     */
    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    /**
     *
     * @param acCuentas
     */
    public void setAcCuentas(ArrayList<Cuenta> acCuentas) {
        this.acCuentas = acCuentas;
    }

    /**
     *
     * @return
     */
    public String getsNombre() {
        return sNombre;
    }

    /**
     *
     * @return
     */
    public String getsApellidos() {
        return sApellidos;
    }

    /**
     *
     * @return
     */
    public String getsDireccion() {
        return sDireccion;
    }

    /**
     *
     * @return
     */
    public String getsDni() {
        return sDni;
    }

    /**
     *
     * @return
     */
    public int getiTelefono() {
        return iTelefono;
    }

    /**
     *
     * @return
     */
    public int getiEdad() {
        return iEdad;
    }

    /**
     *
     * @return
     */
    public ArrayList<Cuenta> getAcCuentas() {
        return acCuentas;
    }
    
}

