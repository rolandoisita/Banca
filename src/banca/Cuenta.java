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
public class Cuenta {
    
    int iSaldo;
    String sNumero_cuenta;
    int []iSaldo_mensual=new int[12];
    ArrayList<Tarjeta> atTarjetas;
    
    String Fecha_apertura;
    
    public void ComporbarSaldo(){}
    
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
    
    public boolean IngresarFondos(int d){
    
        this.iSaldo+=d;
        return true;
    
    }
    
    public int SaldoMedio(){
    int suma=0;
        for(int i=0;i<this.iSaldo_mensual.length;i++){
            suma+=this.iSaldo_mensual[i];
        }
    return suma/12;
    }
    
    public void AñadirTarjeta(Tarjeta t){
    
        atTarjetas.add(t);
    
    }
            
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
