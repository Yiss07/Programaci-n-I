/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author Yiss
 */
public class HolaMundo {
// Comentario de una sola linea
// Esto tambien debe ser un comentario 
    
    /* Pleca Asterisco -> Para abrir bloque
    Asterisco pleca -> para cerrar bloque 
    Todo lo que esta entre ello, se toma como comenatario 
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // JAVA es sensible a Mayusculas - Minusculas
    
    /* Objetivo 
    1. Imprimir en la pantalla
      a. Diferentes formas para poder imprimir en pantalla
      b. Caracteres de escape 
      2. Captura de Datos por parte del usuario. 
    */
    // Imprimir en pantalla //
    
   System.out.println("Hola...como estas"); 
   System.out.println("Este es mi primer programa");
   System.out.println("Yujuu...estoy con Java");
   
   System.out.print("Eymi Rivera");
   System.out.print("Soy Alumna");
   System.out.println("");
   
   System.out.printf("Esto es la clase de %S \n ","Programacion");
   //System.out.println(""); ALT+ 92 -> \
   // \n salto de lines
   
   System.out.printf("Esto es %S la clase de","Programacion");
   System.out.println("");
   
   System.out.printf("%S Esto es la clase de ","Programacion");
   System.out.println("");
   
   System.out.printf("Hola \n como \n estas \n en la clase %s\n?","Programacion");
   System.out.printf("Hola \t como \t estas \t en la clase %s\t?","Programacion");     
           
   
   // Variables
   int tiempo; //Tipo Entero
   double promedio; //Tipo Decimal
   String nombre; //Tipo cadena, tipo de dato complejo
   char inicial; // Tipo caracter -> letra, digitoNumerico, simbolo especial "!
   boolean estado; //Tipo Booleano, tue/false
   
   tiempo = 3;
   nombre ="Eymi";
   inicial = 'A';
   
   System.out.printf("Tu nombre es: %s \n" ,nombre);
   System.out.printf("%d veces a la semana recibes la clase \n" ,tiempo);
   System.out.printf("Te llamare %C inicial" ,inicial);
   
   
}//FIN de la funcion MAIN
   
}// Fin de la clase Hola Mundo 
