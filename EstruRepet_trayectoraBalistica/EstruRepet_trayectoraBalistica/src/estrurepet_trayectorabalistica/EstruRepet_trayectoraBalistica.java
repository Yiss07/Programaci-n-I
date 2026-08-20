/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrurepet_trayectorabalistica;

import java.util.Scanner;

/**
 *
 * Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
correspondiente a la trayectoria.
• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
entre 1 y 89 grados.
• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
segundo 𝑡 = 10.
• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.
 */
public class EstruRepet_trayectoraBalistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Variables
        double velInicio = 0;
        int grados = 0;
        double radianes = 0;
        double xHorizontal = 0;
        double yVertical =0;
        double velVertical = 0;
        double gravedad = 9.81;
        double alturaInicial =0;
         int segundoMax = 0;
        double alturaMax =0;
        double tiempoMax =0;
        
        System.out.println("---LANZAMINENTO DE PROYECTIL----");
        System.out.println("Ingrese velocidad Inicial en m/s:");
        velInicio = sc.nextDouble();
          if (velInicio <=0){
            System.out.println("Invalido. La velocidad debe ser mayor a 0");
        }
        System.out.println("Ingrese el angulo de lanzamiento:");
        grados =sc.nextInt();
        if (grados <=0){
            System.out.println("Invalido. El angulo incial no puede ser 0");
        }else if (grados >89){
            System.out.println("Invalido. El angulo incial debe ser menor a 90");}
        else{
            System.out.println("");}
        
        radianes = Math.toRadians(grados);
        
        velVertical = velInicio* Math.sin(radianes);
        tiempoMax = velVertical/gravedad;
        segundoMax = (int) Math.round(tiempoMax);
         
        System.out.println("---SIMULACION-----");
        for(int tiempo = 1; tiempo <=10; tiempo++){
        xHorizontal= velInicio* Math.cos(radianes)*tiempo;
        yVertical = alturaInicial + (velVertical * tiempo) - (0.5 * gravedad * Math.pow(tiempo, 2));
        
        if (yVertical < 0) {
                System.out.printf("Segundo %d || Posicion Horizontal: %.2f m || Altura: %.2f m -> El proyectil impacto el suelo.\n", tiempo, xHorizontal, yVertical);
                break;
                
            } else if (tiempo == segundoMax) {
                System.out.printf("Segundo %d || Posicion Horizontal: %.2f m || Altura: %.2f m -> Altura MAXIMA del proyectil\n", tiempo, xHorizontal, yVertical);
            } else {
                System.out.printf("Segundo %d || Posicion Horizontal: %.2f m || Altura: %.2f m\n", tiempo, xHorizontal, yVertical);
            }

        } // Fin For
        
        
           
     
            
            
 
        
    }//Fin Main
}//Fin Proyecto
