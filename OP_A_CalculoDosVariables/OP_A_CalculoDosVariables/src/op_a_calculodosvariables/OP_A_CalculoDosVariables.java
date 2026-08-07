/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op_a_calculodosvariables;

import java.util.Scanner;

/**
 *  OPERACIONES ARITMETICAS
 * Ejercicio 1 ---Calculo con 2 Variables
 */
public class OP_A_CalculoDosVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner SC = new Scanner(System.in);
        
        // VARIABLES
        int base = 0;
        int altura = 0;
        int area = 0;
        int perimetro = 0;
        
        System.out.printf("%sCalculo base y perimetro de un Rectangulo\n","\u001B[34m","\u001B[0m");
        System.out.println("1.Introduzca la medida base del Rectangulo");
        base = SC.nextInt();
        
        System.out.println("2.Introduzca la altura del Rectangulo");
        altura = SC.nextInt();
        
        area = base * altura;
        perimetro = (base * 2)+(altura*2);
        System.out.printf("Area: %d\n",area);
        System.out.printf("Perimetro: %d\n",perimetro);
        
    
    }//Fin MAIN
    
}//FIN PROYECTO
