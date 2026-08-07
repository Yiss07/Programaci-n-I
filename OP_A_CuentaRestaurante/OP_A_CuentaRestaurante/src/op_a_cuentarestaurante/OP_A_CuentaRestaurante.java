/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op_a_cuentarestaurante;

import java.util.Scanner;

/**
 *
 * @author Yiss
 */
public class OP_A_CuentaRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);
         //VARIABLES
         double montoTotal = 0;
         int cantidadPersonas = 0;
         double pagoPorPersona = 0;
        
        System.out.print("Ingrese el monto total de la cuenta del restaurante: ");
        montoTotal = scanner.nextDouble();
        
        System.out.print("Ingrese la cantidad de personas en la mesa: ");
        cantidadPersonas = scanner.nextInt();
        
       
        pagoPorPersona = montoTotal / cantidadPersonas;
        System.out.printf("Cada persona debe pagar: $%.2f%n", pagoPorPersona);
        
    }//Fin MAIN
    
}
