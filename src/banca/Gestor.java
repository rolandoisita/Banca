/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;
import java.util.Scanner;
/**
 *
 * @author roly
 */
public class Gestor {
    
    
    public void CrearCuenta(Cliente c,int s,String nc, int ta, int lr,int lo,String f){
        
        
        Cuenta a = new Cuenta(s,nc,ta,lr,lo,f);
        c.AñadirCuenta(a);
    
    }
    
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

