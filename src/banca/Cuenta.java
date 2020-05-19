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
public class Cuenta {
    
    int iSaldo;
    String sNumero_cuenta;
    int iTarjeta_asociada;
    int iLimite_retirada;
    int iLimite_online;
    int iSaldo_medio;
    int iPagos_realiazdos;
    String Fecha_apertura;
    
    public void ComporbarSaldo(){}
    
    public boolean RetirarFondos(int d){
    int resta;
    resta=this.iSaldo-d;
        if(resta<0){
            return false;
        }
        else{
        this.iSaldo-=d;
            return true;
        }
    }
    public Cuenta(int iSaldo, String sNumero_cuenta, int iTarjeta_asociada, int iLimite_retirada, int iLimite_online, int iSaldo_medio, int iPagos_realiazdos, String Fecha_apertura) {
        this.iSaldo = iSaldo;
        this.sNumero_cuenta = sNumero_cuenta;
        this.iTarjeta_asociada = iTarjeta_asociada;
        this.iLimite_retirada = iLimite_retirada;
        this.iLimite_online = iLimite_online;
        this.iSaldo_medio = iSaldo_medio;
        this.iPagos_realiazdos = iPagos_realiazdos;
        this.Fecha_apertura = Fecha_apertura;
    }

    public int getiSaldo() {
        return iSaldo;
    }

    public String getsNumero_cuenta() {
        return sNumero_cuenta;
    }

    public int getiTarjeta_asociada() {
        return iTarjeta_asociada;
    }

    public int getiLimite_retirada() {
        return iLimite_retirada;
    }

    public int getiLimite_online() {
        return iLimite_online;
    }

    public int getiSaldo_medio() {
        return iSaldo_medio;
    }

    public int getiPagos_realiazdos() {
        return iPagos_realiazdos;
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

    public void setiTarjeta_asociada(int iTarjeta_asociada) {
        this.iTarjeta_asociada = iTarjeta_asociada;
    }

    public void setiLimite_retirada(int iLimite_retirada) {
        this.iLimite_retirada = iLimite_retirada;
    }

    public void setiLimite_online(int iLimite_online) {
        this.iLimite_online = iLimite_online;
    }

    public void setiSaldo_medio(int iSaldo_medio) {
        this.iSaldo_medio = iSaldo_medio;
    }

    public void setiPagos_realiazdos(int iPagos_realiazdos) {
        this.iPagos_realiazdos = iPagos_realiazdos;
    }

    public void setFecha_apertura(String Fecha_apertura) {
        this.Fecha_apertura = Fecha_apertura;
    }
    
    
}
