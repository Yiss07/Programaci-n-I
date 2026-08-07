/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op_a_opmatematicamixta;

import java.util.Scanner;

/**Ejercicio Extra
 * Operacion Matemarica Mixta
 * Conversion de Fahrenheit a Celsius
 */
public class OP_A_OPMatematicaMixta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner SC = new Scanner(System.in);
        
        //VARIABLES
        double gradoFahr = 0;
        double gradoCels = 0;
        
        System.out.printf("%sConversion grados Fahrenheit a Celsius\n","\u001B[34m","\u001B[0m");
        System.out.println("Introduzca los grados Fahrenheit");
        gradoFahr = SC.nextDouble();
        
        gradoCels = (gradoFahr -32)*5/9;
       System.out.printf("%.2f grados Fahrenheit es = a %.2f grados Celsius\n",gradoFahr,gradoCels);
        
        
    }//Fin Main
    
}
