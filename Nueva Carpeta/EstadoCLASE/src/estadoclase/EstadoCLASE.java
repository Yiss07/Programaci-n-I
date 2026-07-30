/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadoclase;

import java.util.Scanner;

/**
 *
 * @author Yiss
 */
public class EstadoCLASE {

    /**
     * 1. Conocer las estructuras de seleccion
     * a. Toma de Decision simple
     * b. Toma de decision doble
     * c. decisiones numericos y caracteres/cadenas
     */
    
    /* Se necesita desarrollar un algoritmo que determine si un bote
       de agua de 500 ml esta arriba de la mitad.
        a. esta arriba de la mitad (dato numerico)
        b. contiene agua o no (dato de caracter)
        c. Es amigable con el ambiente  (dato de cadena)
    
*/
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner input = new Scanner(System.in);
    // conociendo la estructura
    // 1. palabra clave "if" y/o "else"
    // 2. El grupo de instrucciones se encierra entre { }
    // 3. No se usa ";" para los bloques
    // La condicion es una comparacion bajo cualquiera de los siguientes elementos:
    /*  a. < menos
        b. > menos
        c. <= menor o igual 
        d. >= mayor o igual
        e. ==igual 
        f. != distinto (signos pegados)
    */
    //VARIABLES
    int cantidadAgua = 0;
    char respuesta = '@';
    String respuestaAmbiente = "John Doe";
    
        System.out.println("El bote es de 500 mL");
        System.out.print("Cuanto liquido dices que contiene?");
        cantidadAgua = input.nextInt();
        
        //solo if, decision simple
        if(cantidadAgua >= 250){
            //condicion es VERDADERO
            System.out.println(" Si, tiene mas de mitad");
            System.out.println(" Telo puedes beber!!");
            System.out.println("No nos quedamos sin nada... hay suficiente");
        }
        input.nextLine();//Limpieza de Buffer
        System.out.println(" El liquido que contiene es H20? (a= Si, b=no)");
        respuesta = input.nextLine().charAt(0);
        
        //Estructura de decision doble
        if(respuesta =='a'){
            //condicion verdadero
            System.out.println("""
                               Si es agua lo que contiene 
                               No es otra cosa... nada embriagante.!!
                               """);
        }
        else{
            //condicion Falsa
            System.out.println("""
                               Uy Uy Uy 
                               Que sera?...
                               """);
        }
        
        System.out.printf("\nEse bote que contiene %d mL",cantidadAgua);
        System.out.println("\n Es amigable con el ambiente?");
        respuestaAmbiente = input.nextLine();
        System.out.printf("Dato de Variable: %s",respuestaAmbiente);
        
        System.out.println("Seguro?");
        respuestaAmbiente = input.nextLine().toUpperCase();
        System.out.printf("Dato de variable: %s",respuestaAmbiente);
        
        System.out.println("100% Seguro?");
        respuestaAmbiente = input.next().toLowerCase();
        System.out.printf("Dato de Variable: %s", respuestaAmbiente);
        
        if(respuestaAmbiente.equals("Si")){
            System.out.println("Es amigable");
        }
        
        else{
            System.out.println("No es nada amigable");
        }
   
    }//Fin de Main
}//Fin de Class
