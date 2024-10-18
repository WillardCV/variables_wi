/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wi;

import java.util.Scanner;

/**
 *
 * @author WillardCerna
 */
public class Wi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //boleta de empeado
            Scanner entrada = new Scanner(System.in);
            // datos
            String nombre;
            
            int horam;
            double tarifa;
            
            System.out.println("ingrese el nombre del empleado");
            nombre = entrada.nextLine();
            
            System.out.println("ingrese las horas tabajadas");
            horam = entrada.nextInt();
            
            System.out.println("tarifa por hora");
            tarifa = entrada.nextInt();
            
            double salario =(horam*tarifa);
            
            System.out.println("----plantilla de empleado----"+
                    "\n nombre del empleado: "+nombre+
                    "\n horas trabajadas: "+horam+
                    "\n tarifa :"+tarifa+
                    "\n Salario del empleado: "+salario);
            
            
            
            
                    
        }}
       
           
        
        
        
        
            
        
                
        
                
                
                
                
                
                
                
        
        
    
                 

