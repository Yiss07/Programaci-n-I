/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrurepet_sensorestemperatura;


import java.util.Scanner;

/**
 *
 * 1. Sistema Analisis sensores de temperatura
 */
public class EstruRepet_sensoresTemperatura {

    /**
     * Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados)
       registradas por un sensor industrial. El programa debe detenerse cuando el usuario ingrese el valor
        centinela −999.
     • Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si
       el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe
       mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.
     • Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas
       ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Variables
       double temperatura = 0;
       int centinela = -999;
       double ceroAbsoluto = -273.15;
       double tempMayor= 0;
       double tempMenor= 0;
       double sumaTemp = 0;
       int contador = 0;
       double promedio = 0;
       double diferenciaTermica = 0;
       
        System.out.println("--Sensor de temperatura--");
        System.out.println("Ingrese la temperatura (-999 para terminar):");
        temperatura = sc.nextDouble();
        
           while(temperatura != centinela){
               
               if(temperatura< ceroAbsoluto){
                   System.out.println(" Error: temperatura menor al cero absoluto");
               } else{
               sumaTemp += temperatura;
               contador ++;
               if (contador == 1) {
               tempMayor = temperatura;
               tempMenor = temperatura;
              } else {
              if (temperatura > tempMayor) {
              tempMayor = temperatura;
              }
             if (temperatura < tempMenor) {
             tempMenor = temperatura;
              }
            }//fin else temperaturas
               }//Fin else
               
            System.out.print("Ingrese siguiente temperatura: ");
            temperatura = sc.nextDouble();   
       }//Fin While 
       
        System.out.println("----Resultado de Analisis----");
        if (contador > 0) {
            promedio = sumaTemp / contador;
            diferenciaTermica = tempMayor - tempMenor;
            
            System.out.printf("Temperaturas validas registradas: %d\n", contador);
            System.out.printf("Promedio de temperatura: %.2f C\n", promedio);
            System.out.printf("Temperatura mas alta: %.2f C\n", tempMayor);
            System.out.printf("Temperatura mas baja: %.2f C\n", tempMenor);
            System.out.printf("Diferencia termica (Rango): %.2f C\n", diferenciaTermica);
        } else {
            System.out.println("No se ingresaron temperaturas validas a calcular.");
        }
        
    }//Fin Main
    
}//Fin Proyecto
