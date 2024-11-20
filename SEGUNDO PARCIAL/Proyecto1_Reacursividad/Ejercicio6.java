/*
Escriba un método recursivo que imprima los elementos de un arreglo en orden
inverso.
 */
package Proyecto1_Reacursividad;

import java.util.*;

public class Ejercicio6 {

    public static void revesArray(int[] x, int y) {
        if (y < 0) {
        } else {
            System.out.println(x[y]);
            revesArray(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un valor: ");
            array[i] = consola.nextInt();
            consola.nextLine();
        }
        revesArray(array, array.length - 1);
    }
}
