/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrurepet_conversorunidadesfisicas;

import java.util.Scanner;

/**
 *
 * Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú
debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y
4) Salir.
• Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden
ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de
error y volver a pedir el dato.
• Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la
operación aritmética correspondiente. El menú debe repetirse usando do-while hasta que
el usuario elija la opción 4.
 */
public class EstruRepet_conversorUnidadesFisicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    //Variables
    double conversion = 0;
    double pies = 3.28;
    double libras = 2.20;
    double pulgadas =2.54;
    double resultado = 0;
    int opcion = 0;
    
    do{
        System.out.println("\n---MENU-----");
        System.out.println("---Conversion de medidas de longitud y peso-----");
        System.out.println("--Seleccione una opcion:");
        System.out.println("1. Metros a Pies");
        System.out.println("2. Kilogramos a libras");
        System.out.println("3. centimetros a pulgadas");
        System.out.println("4. salir");
        opcion = sc.nextInt();
        
        if (opcion ==4){
            System.out.println("Sesion cerrada.");
        break;
        }if (opcion >4){
        System.out.println("Opcion no valida.");
        continue;
        }
        
        System.out.println("Ingrese el dato a convertir:");
        conversion = sc.nextDouble();
        if(conversion <0){
            System.out.println("No se pueden ingresar valores negativos, intente de nuevo");
        continue;
        }
        
        switch (opcion){    
            case 1:
                resultado = conversion*pies;
                System.out.printf("%s metros equivalen a %.2f pies ",conversion,resultado);
                break;
            case 2:
                resultado = conversion*libras;
                System.out.printf("%s kilogramos equivalen a %.2f libras ",conversion,resultado);
                break;
            case 3:
                resultado = conversion/pulgadas;
                System.out.printf("%s centimetros equivalen a %.2f  pulgadas",conversion,resultado);
                break;    
        }//fin switch 
    }while(opcion >= 1 || opcion <=3);
          
    }//fin Main
}//Fin Proyecto
