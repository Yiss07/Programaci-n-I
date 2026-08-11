/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruselec_calculadoraarimetica;

import java.util.Scanner;

/**
 *
 * @author Yiss
 */
public class EstruSelec_CalculadoraArimetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 3 Calculadora Aritmetica de consola
        //VARIABLE
        Scanner SC = new Scanner(System.in);
       int num_1 = 0;
       int num_2 = 0;
       char seleccionMenu = '@';
       double resultado = 0;
       
        System.out.println("--CALCULADORA--");
        System.out.println("Ingrese la operacion a realizar:");
        System.out.println("A. Suma");
        System.out.println("B. Resta");
        System.out.println("C. Division");
        System.out.println("D. Multiplicacion");
        System.out.println("F. Modulo %");
        seleccionMenu = SC.nextLine().toUpperCase().charAt(0);
        
        
        switch(seleccionMenu){
            case 'A':
                System.out.println(" Suma");
                System.out.println("Ingrese los digitos enteros a sumar:");
                num_1 = SC.nextInt();
                System.out.println("+");
                num_2 = SC.nextInt();
                resultado = num_1 + num_2;
                System.out.printf("Total: %.2f",resultado);
                break;
                
            case 'B':
                System.out.println("Resta");
                System.out.println("Ingrese los digitos enteros a restar:");
                num_1 = SC.nextInt();
                System.out.println("-");
                num_2 = SC.nextInt();
                resultado = num_1 - num_2;
                System.out.printf("Total: %.2f",resultado);
                break;
            case 'C':
                System.out.println("Division");
                System.out.println("Ingrese los digitos enteros a dividir:");
                num_1 = SC.nextInt();
                System.out.println("/");
                num_2 = SC.nextInt();
                if(num_2 == 0){
                    System.out.println("No es posible dividir entre 0");
                }
                else {resultado = num_1 / num_2;
                System.out.printf("Total: %.2f",resultado);
                }
                break;
            case 'D':
                System.out.println("Multiplicacion");
                System.out.println("Ingrese los digitos enteros a multiplicar:");
                num_1 = SC.nextInt();
                System.out.println("X");
                num_2 = SC.nextInt();
                resultado = num_1 * num_2;
                System.out.printf("Total: %.2f",resultado);
                break;
            case 'F':
                 System.out.println("Modulo %");
                System.out.println("Ingrese los digitos para calcular el resto de la division:");
                num_1 = SC.nextInt();
                System.out.println("/");
                num_2 = SC.nextInt();
                resultado = num_1 % num_2;
                System.out.printf("Total restante: %.2f",resultado);
                break;
            default:
                System.out.println("Operacion operador no reconocido");
                break;    
        }//Fin switch    
    }//fin MAIN
    
}// Fin Proyecto
