/*
Escribe una función recursiva que calcule la potencia de un número base elevado a
un exponente. Por ejemplo, 2^3=2*2*2=8
 */
package Proyecto1_Recursividad;

import java.util.*;

public class Ejercicio3 {

    public static long potencia(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * potencia(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = consola.nextInt();
        consola.nextLine();
        System.out.print("Ingrese el exponente: ");
        int expo = consola.nextInt();
        consola.nextLine();
        long resultado = potencia(base, expo);
        System.out.println("La base es " + base + " y el exponente es " + expo + " el resultado de esta potencia es = " + resultado);
    }
}
