/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n.conversiones;
import java.util.Scanner;
/**
 *
 * @author Yiss
 */
public class NConversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // TODO code application logic here
 
     /*Desarrollar un algoritmo que me permite convertir valores de longitud deacuerdo a la base que se tenga
    Pulgadas- centimetros
    kilometros-Millas
    grados Celsius a grados Farenheit*/
    
        //DECLARACION VARIABLES 
        int pulgada = 0; //= -> Asignando un valor por el signo =
        double resultadoCM = 0;
        
        System.out.println("Tenemos 5 pulgadas");
        System.out.println("Cuanto es eso en CM ?");
        
        pulgada = 5;
        resultadoCM = pulgada * 2.54;
        System.out.printf("%d pulgadas es equivalente a %.2f cm", pulgada, resultadoCM);
        
        pulgada = 12;
        resultadoCM = pulgada * 2.54;
        System.out.printf("\n%.2f cm es equivalente a %d pulgadas", resultadoCM,pulgada);
        
        
        Scanner teclado = new Scanner (System.in);
        //Declaracion Variables
        double kilometros = 100;
        double millas = 0;
        
        System.out.println("\nDime cuentos kilometros son?");
        kilometros = teclado.nextDouble();
        
        millas = kilometros / 1.6;
        System.out.printf("%.2f km es = a %.3f millas", kilometros, millas);
       
        //Celsius a grados Farenheit
        //Declarar variables
        double celsius = 0;
        double farenheit = 0;
        
        System.out.println(" \n Cuantos grados celcius son?");
        celsius = teclado.nextDouble();
        
        farenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f grados celsius es = a %.3f grados farenheit",celsius,farenheit);
        
    }
    
}
