/*
Escribe una función recursiva que imprima un conteo regresivo desde un número n
hasta 1. Por ejemplo, n=4 es 4,3,2,1.
 */
package Proyecto1_Recursividad;

import java.util.*;

public class Ejercicio4 {

    public static String num(int x) {
        if (x == 1) {
            return "1";
        } else {
            return x + ", " + num(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int num = consola.nextInt();
        String resultado = num(num);
        System.out.println("El conteo regresivo de " + num + " es = " + resultado);
    }
}
