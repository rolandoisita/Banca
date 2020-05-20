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
     * @Return int Devuelve el saldo restante en la cuenta, si no se puede realizar devuelve 0
     * @see RetirarFondos de la Clase Cuenta
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
    public int IngresarDinero(Cuenta c, int d){

    c.IngresarFondos(d);
    return c.getiSaldo();

}
    
    /**
     *Metodo para añadir una cuenta al Cliente
     * @param c recibe la cuenta que queremos añadir por parametro
     */
    public boolean AñadirCuenta(Cuenta c){
    
        this.acCuentas.add(c);
        return true; 
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

