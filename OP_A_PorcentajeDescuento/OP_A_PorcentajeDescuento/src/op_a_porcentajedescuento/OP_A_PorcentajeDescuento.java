/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op_a_porcentajedescuento;

import java.util.Scanner;

/**
 *
 * @author Yiss
 */
public class OP_A_PorcentajeDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         //VARIABLES
         double precioOriginal = 0;
         double porcentajeDescuento = 0;
         double montoDescuento = 0;
         double  precioFinal = 0;
        
        System.out.print("Ingrese el precio del articulo: ");
        precioOriginal = scanner.nextDouble();
        
        System.out.print("Ingrese el porcentaje de descuento (en números): ");
        porcentajeDescuento = scanner.nextDouble();
        
        // Descuento y precio final
        montoDescuento = precioOriginal * (porcentajeDescuento / 100);
        precioFinal = precioOriginal - montoDescuento;
        
        System.out.printf("El monto del descuento es: $%.2f%n", montoDescuento);
        System.out.printf("El precio final a pagar es: $%.2f%n", precioFinal); 
    }//Fin MAIN
    
}
