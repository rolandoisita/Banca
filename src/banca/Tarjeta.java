/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

/**
 * Clase Tarjeta para almacenar los datos de las tarjetas de los clientes
 * @author roly
 */
public class Tarjeta {
 
    int iLimiteRetidara;
    int iLimitePagoOnline;
    int iPagosRealizados;

    /**
     * Constructor de la tarjeta
     * @param iLimiteRetidara
     * @param iLimitePagoOnline
     */
    public Tarjeta(int iLimiteRetidara, int iLimitePagoOnline) {
        this.iLimiteRetidara = iLimiteRetidara;
        this.iLimitePagoOnline = iLimitePagoOnline;
        this.iPagosRealizados=Math.round((int)Math.random()*100);
    }

    /**
     *
     * @param iPagosRealizados
     */
    public void setiPagosRealizados(int iPagosRealizados) {
        this.iPagosRealizados = iPagosRealizados;
    }

    /**
     *
     * @return
     */
    public int getiPagosRealizados() {
        return iPagosRealizados;
    }

    /**
     *
     * @param iLimiteRetidara
     */
    public void setiLimiteRetidara(int iLimiteRetidara) {
        this.iLimiteRetidara = iLimiteRetidara;
    }

    /**
     *
     * @param iLimitePagoOnline
     */
    public void setiLimitePagoOnline(int iLimitePagoOnline) {
        this.iLimitePagoOnline = iLimitePagoOnline;
    }

    /**
     *
     * @return
     */
    public int getiLimiteRetidara() {
        return iLimiteRetidara;
    }

    /**
     *
     * @return
     */
    public int getiLimitePagoOnline() {
        return iLimitePagoOnline;
    }
         
}
