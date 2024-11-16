/*
Escribe una función recursiva que calcule el factorial de un número entero positivo n.
Por ejemplo, 4! es 1x2x3x4=24.
 */
package Proyecto1_Recursividad;

import java.util.*;

public class Ejercicio1 {

    public static long factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el numero que desee calcular el factorial: ");
        int num = consola.nextInt();
        long resultado = factorial(num);
        System.out.println("El factorial de " + num + " es igual a = " + resultado);
    }
}
