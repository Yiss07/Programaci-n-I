/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op_a_interessimple;

import java.util.Scanner;

/**
 *  OPERACIONES ARITMETICAS
 * Ejercicio 3_Interes simple
 */
public class OP_A_InteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner SC = new Scanner(System.in);
        //VARIABLES
        int capitalInicial = 0;
        int interesAnual = 0;
        int tiempoAños = 0;
        int interesFinal = 0;
        int montoFinal= 0;
        
        System.out.printf("%sCalculo de Interes de Prestamo\n","\u001B[34m","\u001B[0m");
        System.out.println("Introduzca el capital Inicial");
        capitalInicial = SC.nextInt();
        
        System.out.println("Introduzca el Interes Anual");
        interesAnual = SC.nextInt();
        
        System.out.println("Introduzca la cantidad de Años del prestamo");
        tiempoAños = SC.nextInt();
        
        interesFinal = (capitalInicial * interesAnual * tiempoAños)/100;
        System.out.printf("\nEl interes final sobre su Prestamo en %d años, seria de: %d",tiempoAños,interesFinal);
        montoFinal = capitalInicial + interesFinal;
        System.out.printf("\nMonto Final: %d\n", montoFinal);
    }//Fin MAIN
    
}// FIN PROYECTO
