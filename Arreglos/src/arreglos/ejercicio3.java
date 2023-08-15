/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author AldiLee
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments . Recorrer un vector de N enteros
     * contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos,
     * etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {

        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] =(int) (Math.random() * 100000);
             System.out.print("["+vector[i]+"] ");
        }
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0 && vector[i] < 10) {
                cont1++;
            } else if (vector[i] > 10 && vector[i] < 100) {
                cont2++;
            } else if (vector[i] > 100 && vector[i] < 1000) {
                cont3++;
            } else if (vector[i] > 1000 && vector[i] < 10000) {
                cont4++;
            } else if (vector[i] > 10000 && vector[i] < 100000) {
                cont5++;
            }
        }
        System.out.println("hay " + cont1 + " numeros de una cifra\n"
                + "hay " + cont2 + " numeros de dos cifras\n"
                + "hay " + cont3 + " numeros de tres cifras\n"
                + "hay " + cont4 + " numeros de cuatro cifras\n"
                + "hay " + cont5 + " numeros de cinco cifras");
    }

}
