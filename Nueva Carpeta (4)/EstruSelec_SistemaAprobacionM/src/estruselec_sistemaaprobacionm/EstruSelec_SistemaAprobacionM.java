/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruselec_sistemaaprobacionm;

import java.util.Scanner;

/**
 *
 * @author Yiss
 */
public class EstruSelec_SistemaAprobacionM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 1 Sistema de aprobacion de Materia
        //VARIABLES
        Scanner SC = new Scanner(System.in);
        String nombreEstudiante = "@";
        double nota1 = 0;
        double nota2 = 0;
        double promedio = 0;
        
        System.out.println("SISTEMA DE PROMEDIO");
        System.out.println("Ingrese el nombre del Alumno:");
        nombreEstudiante = SC.nextLine();
        System.out.println("Ingrese la nota del examen del 1er parcial:");
        nota1 = SC.nextDouble();
        System.out.println("Ingrese la nota del examen del 2do parcial:");
        nota2 = SC.nextDouble();
        
        promedio = (nota1 + nota2)/2;
        if (promedio >= 65.0){
            System.out.printf("\nEl promedio es: %.2f\n",promedio);
            System.out.println("APROBADO");
            }//Fin IF promedio
            else{
            System.out.printf("El promedio es %.2f\n",promedio);
            System.out.println("REPROBADO");
                    }//Fin ELSE       
    }//Fin MAIN
}//Fin Proyecto
