/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op_a_libreriamath;

import java.util.Scanner;

/**
 *  OPERACIONES ARITMETICAS
 * 2. Ejercicio 2-- Uso de Libreria Math
 */
public class OP_A_LibreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner SC = new Scanner(System.in);
        //VARIABLES
        int radio = 0;
        double area = 0;
        double circunferencia = 0;
        
        System.out.printf("%sCalculo area y circunferencia de un circulo\n","\u001B[34m","\u001B[0m");
        System.out.println("Introduzca el radio de un circulo");
        radio = SC.nextInt();
        
        area = Math.PI* Math.pow(radio, 2);
        circunferencia = (2 * radio )* Math.PI;
        System.out.printf("Area: %.2f \n",area);
        System.out.printf("Circunferencia: %.2f \n",circunferencia);
    }//Fin MAIN
    
}
