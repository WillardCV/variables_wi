/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package willard_cerna_problema3;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.Q;

/**
 *
 * @author WillardCerna
 */
public class Willard_cerna_problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
    int clicstotales;
    int clic1;
    double precioclic1;
    
    int clic2;
    double precioclic2;
    
    int clic3;
    double precioclic3;
    
    double totalapagar= 0;
    double is = 1.16;
    double cpc = 0;
    double totalisv =0;
    
        System.out.println("ingresar los clics totales:");
        clicstotales = entrada.nextInt();
        
        System.out.println("ingresar primeros clics:");
        clic1 = entrada.nextInt();
        
        System.out.println("precio de primeros clics:");
        precioclic1 = entrada.nextDouble();
    
        System.out.println("ingresar segundos clics:");
        clic2 = entrada.nextInt();
        
        System.out.println("precio de segundos clics:");
        precioclic2 = entrada.nextDouble();
        
        System.out.println("ingresar terceros clics:");
        clic3 = entrada.nextInt();
        
        System.out.println("precio de terceros clics:");
        precioclic3 = entrada.nextDouble();
        
        totalapagar =clic1*precioclic1+clic2*precioclic2+clic3*precioclic3;
        cpc = totalapagar/clicstotales;
        totalisv = totalapagar*0;
        
        System.out.println(String.format("0.2f",cpc));
         System.out.println(String.format("0.2f",totalisv));
        
    }
    
}
