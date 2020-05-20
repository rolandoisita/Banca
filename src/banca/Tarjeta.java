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
public class Tarjeta {
 
    int iLimiteRetidara;
    int iLimitePagoOnline;

    public void setiLimiteRetidara(int iLimiteRetidara) {
        this.iLimiteRetidara = iLimiteRetidara;
    }

    public void setiLimitePagoOnline(int iLimitePagoOnline) {
        this.iLimitePagoOnline = iLimitePagoOnline;
    }

    public int getiLimiteRetidara() {
        return iLimiteRetidara;
    }

    public int getiLimitePagoOnline() {
        return iLimitePagoOnline;
    }
         
}
