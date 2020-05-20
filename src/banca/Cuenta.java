/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;
import java.util.ArrayList;
/**
 * Clase cuenta para guardar los datos de las cuentas de los clientes y hacer algunas operaciones   
 * @author roly
 */
public class Cuenta {
    
    int iSaldo;
    String sNumero_cuenta;
    int []iSaldo_mensual=new int[12];
    ArrayList<Tarjeta> atTarjetas;
    String Fecha_apertura;
    
    /**
     * Metodo para retirar fondos de la cuenta
     * @param d recibe por parametro la cantidad que deseas retirar de la cuenta
     * @param t recibe una tarjeta asociada  la cuenta con la que se van a retirar los fondos
     * @return boolean devuelve true si se ha podido retirar los fondos y false y no se ha podido
     */
    public boolean RetirarFondos(int d, Tarjeta t){
    int resta;
    resta=this.iSaldo-d;
        if(resta<0 && d>t.getiLimiteRetidara()){
            return false;
        }
        else{
        this.iSaldo-=d;
            return true;
        }
    }
    
    /**
     * Metodo para ingresar dinero en la cuenta
     * @param d recibe la cantidad que se quiere ingresar
     * @return boolean devuelve true si se han añadido los fondos
     */
    public boolean IngresarFondos(int d){
    
        this.iSaldo+=d;
        return true;
    
    }
    
    /**
     * Metodo para saber el saldo medio de la cuenta 
     * @return int devuelve el saldo medio 
     */
    public int SaldoMedio(){
    int suma=0;
        for(int i=0;i<this.iSaldo_mensual.length;i++){
            suma+=this.iSaldo_mensual[i];
        }
    return suma/12;
    }
    
    /**
     * Metodo para añadir una tarjeta  a la cuenta
     * @param t recibe la tarjeta por parametro
     *  @return boolean
     */
    public boolean AñadirTarjeta(Tarjeta t){
    
        atTarjetas.add(t);
        return true;
    }
            
    /**
     * Constructor de la clase Cuenta
     * @param iSaldo saldo
     * @param sNumero_cuenta numero cuenta
     * @param Fecha_apertura fecha
     */
    public Cuenta(int iSaldo,String sNumero_cuenta, String Fecha_apertura) {
        this.iSaldo = iSaldo;
        this.sNumero_cuenta = sNumero_cuenta;
        
        this.Fecha_apertura = Fecha_apertura;
        
        for(int i=0;i<this.iSaldo_mensual.length;i++){
        
            this.iSaldo_mensual[i]=Math.round((int)(Math.random()*1000));
            
        }
    }
    
    
    public int getiSaldo() {
        return iSaldo;
    }

   
    public String getsNumero_cuenta() {
        return sNumero_cuenta;
    }

   
    public String getFecha_apertura() {
        return Fecha_apertura;
    }

    
    public void setiSaldo(int iSaldo) {
        this.iSaldo = iSaldo;
    }

   
    public void setsNumero_cuenta(String sNumero_cuenta) {
        this.sNumero_cuenta = sNumero_cuenta;
    }

    public void setFecha_apertura(String Fecha_apertura) {
        this.Fecha_apertura = Fecha_apertura;
    }
    
    
}
