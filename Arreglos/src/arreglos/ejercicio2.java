/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class ejercicio2 {

    /**
     * Realizar un algoritmo que llene un vector de tamaño N con valores
     * aleatorios y le pida al usuario un número a buscar en el vector. El
     * programa mostrará dónde se encuentra el numero y si se encuentra repetido
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in); 
            int num,cont=0;
            int []vector = new int [10];
            for (int i = 0; i < 10; i++) {
                vector[i]= (int)(Math.random()*10);
            }
            System.out.println("ingrese un numero al diez que quiera encontrar en el vector");
            num = leer.nextInt();
            
            for (int i = 0; i < 10; i++) {
                if (vector[i]==num) {
                    cont++;
                    System.out.println("el numero se encuentra en la posicion "+i);
                }
            }
             System.out.println("se repite "+ cont + " veces");
        }
   
    }
