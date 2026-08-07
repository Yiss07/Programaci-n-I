/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op_a_conversiontiempo;

import java.util.Scanner;

/**
 *
 * @author Yiss
 */
public class OP_A_ConversionTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //VARIABLES
        int minutosTotales = 0;
        int horas = 0;
        int minutos = 0;
                
        System.out.print("Ingrese una cantidad de tiempo en minutos: ");
        minutosTotales = scanner.nextInt();
        
        horas = minutosTotales / 60;
        minutos = minutosTotales % 60;
        
        System.out.printf("%d minutos equivalen a %d horas y %d minutos exactos.",minutosTotales,horas,minutos);
    }//Fin Main
    
}
