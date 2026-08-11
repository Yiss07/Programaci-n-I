/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruselec_descuentostienda;

import java.util.Scanner;

/**
 *
 * @author Yiss
 */
public class EstruSelec_DescuentosTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 2 Clasificacion de Descuentos de Tienda de Software enunciado
        //VARIABLES
        Scanner input = new Scanner(System.in);
        double preciOriginal = 0;
        double preciDescuento = 0;
        double total = 0;
        int edad = 0;
        char membresia = 'a';
        
        
        final double descuentoMayor = 0.20;
        final double descuentoMedio = 0.15;
        final double descuentoMenor = 0.10;
 
        System.out.println("--TIENDA DE SOFTWARE--"); 
        System.out.println("Introduzca el precio del articulo:");
        preciOriginal = input.nextDouble();
        System.out.println("--APLICACION DESCUENTO--");
        System.out.println("Ingrese su edad para aplicar el descuento:");
        edad = input.nextInt();
        
         input.nextLine();//Limpieza de Buffer
            
        System.out.println("Tiene membresia? Si/No");
        membresia = input.nextLine().charAt(0);
        if (edad>=18){
            if(edad>=65 || membresia =='S'|| membresia =='s'){
               
                preciDescuento = (preciOriginal * descuentoMayor);
                total = preciOriginal - preciDescuento;
                System.out.printf("\n Precio articulo: %.2f\n",preciOriginal);
                System.out.println(" Descuento aplicado: 20% ");
                System.out.printf("\nTotal a pagar: %.2f\n",total);
                }//if descuento mayor de edad
            else{
               
                 preciDescuento = (preciOriginal * descuentoMenor);
                total = preciOriginal - preciDescuento;
                System.out.printf("\nPrecio articulo: %.2f\n",preciOriginal);
                System.out.println(" Descuento aplicado: 10% ");
                System.out.printf("\nTotal a pagar: %.2f\n",total);
            }//else descuento mayor de edad
                }//Fin If MAYOR DE EDAD
        if(edad<=18){
            if(edad>=12 && membresia == 'S'||membresia == 's'){
                
                preciDescuento = preciOriginal * descuentoMedio;
                total = preciOriginal - preciDescuento;
                System.out.printf("\n Precio articulo: %.2f\n",preciOriginal);
                System.out.println(" Descuento aplicado: 15% ");
                System.out.printf("\nTotal a pagar: %.2f\n",total);
            }//fin if descuento mayor 12
            else{
               
                System.out.printf("\nPrecio articulo: %.2f\n",preciOriginal);
                System.out.println("No aplica a descuento ");
                 System.out.printf("\nTotal a pagar: %.2f\n",preciOriginal);           
            }// Fin else descuento menor de edad
        }//fin descuento MENOR DE EDAD
    }//Fin MAIN
    
}//fIN PROYECTO
