/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacion_de_sangre;

import java.util.Scanner;

/**
 *
 * @author Yiss
 * Objetivos
 * 1. Estructura de Seleccion Anidadas
 * 2. Operadores Booleanos
 *      a. AND &&
 *      b. OR ||
 *      c. NOT !
 * 3. Operacion Ternaria 
 */

// AND && (Y)
/* Semana Morazanica 
    1. Dinero       Tiempo      Resultado
        SI(V)          SI (V)          SALES(V)
        SI(V)          NO (F)          NO SE SALE(F)
        NO(f)          SI (V)          NO SE SALE (F)
        NO(F)          NO (F)          NO SE SALE (F)
*/

 //OR || (O)
        /*
            Comida del FoodCourt del Molote
        
            Hamburguesa     Pasta       Resultado
                Si(V)       Si(V)       LOGRA COMER (V)
                Si(V)       No(F)       LOGRA COMER (V)
                No(F)       Si(V)       LOGRA COMER (V)
                No(F)       No(F)       NO LOGRA COMER (F)
        */
        
 //NOT ! (Negacion / Opuesto)
        
        /*
            SI TE GUSTA LA CLASE        RESULTADO
            SI(V)                       No(F)
            No(F)                       Si(V)
        */

public class Donacion_de_Sangre {

    /**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Declaración de VARIABLES
        int edad = 0;
        int peso = 0;
        boolean desayuno = true;
        char respuesta = '0';
        int hierro = 0;
        String genero = "John Doe";
                
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.println("Ingrese su peso en Libras: ");
        peso = input.nextInt();
        
        if( edad >= 18 && edad <= 65 && peso >= 110){
         input.nextLine();
            System.out.println("Ya ha desayunado? Si o No");
            respuesta = input.nextLine().charAt(0);
            if(respuesta == 'S'|| respuesta == 's'){
                System.out.println("Si puede donar sangre");
                desayuno = true;
            }
            else{
                System.out.println("Es necesario que comas");
                desayuno = false;}
        }// FIN DEL IF EDAD
            
            else{
            System.out.println("No puede donar sangre");
        }
    System.out.println("Ingrese su nivel de hierro en la sangre:");
    hierro = input.nextInt();
    
     input.nextLine();
     
    System.out.println("Ingrese su Genero");
    genero = input.nextLine().toUpperCase();
        
     if ((hierro>= 14 && genero.equals("MASCULINO)"))|| (hierro>= 12 && genero.equals ("FEMENINO"))){
            System.out.println("Si se puede donar sangre");
        }
        else{
            System.out.println("no,se puede donar sangre");
        }
        
        
        
    }/*FIN MAIN*/
    
}/*FIN Proyecto*/
