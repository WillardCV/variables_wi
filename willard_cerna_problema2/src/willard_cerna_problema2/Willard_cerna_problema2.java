/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package willard_cerna_problema2;

import java.util.Scanner;

/**
 *
 * @author WillardCerna
 */
public class Willard_cerna_problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    //calculadora de cuotas mensuales
    //pagos mensuales
    
    //datos
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("ingresar monto");
        double montoprestamo = entrada.nextDouble();
        System.out.println("ingrese los plazos de los meses");
        int plazosmeses = entrada.nextInt();
        System.out.println("ingresar taza de interes ");
        double tazainteres = entrada.nextDouble()/100;
        System.out.println("ingrese la comicion por cuota");
        double comicion = entrada.nextDouble()/100;
        System.out.println("ingrese el porcentaje del seguro mensual");
        double seguro = entrada.nextDouble()/100;
    //proceso de datos
    
double cuotamensual = (montoprestamo/plazosmeses);
double interes = (cuotamensual/tazainteres);
double comisiones = (cuotamensual*comicion);
double Seguro = (cuotamensual*seguro);
double totalapagar = (cuotamensual+interes+comisiones+Seguro);

        System.out.println("---CUOTAS MENSUALES---"
                + "\n cuota de pago mensual"+cuotamensual+""
                 +"\n tota a pagar: "+totalapagar);
                
    
    }
    
}
