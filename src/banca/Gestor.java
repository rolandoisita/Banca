/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;
import java.util.Scanner;
/**
 * Clase Gestor para realiazr operaciones sobre las cuentas y perfiles de los clientes
 * @author roly
 */
public class Gestor {
    
    /**
     * Metodo para crear un cliente
     * @param n recibe el nombre
     * @param a recibe los apellidos
     * @param d la direccion
     * @param id recibe el dni
     * @param t recibe el telefono
     * @param e recibe la edad
     */
    public void CrearCliente(String n,String a,String d,String id,int t,int e){
    
        Cliente c = new Cliente(n,a,d,id,t,e);
    
    }
    
    /**
     * Metodo para crear una cuenta
     * @param c recibe el cliente al que se le crea la cuenta
     * @param s recibe el saldo que va atener la cuenta
     * @param nc recibe el numero de cuenta que va llevar
     * @param f recibe la fecha de creacion de la cuenta
     */
    public void CrearCuenta(Cliente c,int s,String nc,String f){
        
        
        Cuenta a = new Cuenta(s,nc,f);
        c.AñadirCuenta(a);
    
    }
    
    /**
     * Metodo para modificar el perfil de un cliente
     * @param c recibe el cliente que se quiere modificar
     */
    public void ModificarCliente(Cliente c){
         Scanner teclado= new Scanner(System.in);
         int cambio=1;
         while(cambio==0){
                 System.out.println("Que deseas cambiar?/n 1-Nombre/n 2-Apellidos"
                         + " 3-Direccion/n 4-Dni/n 5-Telefono/n 0-Salir");
                 cambio=teclado.nextInt();
                
                 switch(cambio){
                     case 1:
                         System.out.println("Nuevo Nombre");
                         c.setsNombre(teclado.nextLine());
                         break;
                     case 2:
                         System.out.println("Nuevos Apellidos");
                         c.setsApellidos(teclado.nextLine());
                         break;    
                     case 3: 
                         System.out.println("Nueva Direccion");
                         c.setsDireccion(teclado.nextLine());
                         break;
                     case 4:
                         System.out.println("Nuevo Dni");
                         c.setsDni(teclado.nextLine());
                         break;
                     case 5:
                         System.out.println("Nuevo Teledono");
                         c.setiTelefono(teclado.nextInt());
                         break;  
                 }
                 
                }
        
        }
    
    }

