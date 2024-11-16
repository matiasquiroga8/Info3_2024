/*
Escribe una función recursiva que calcule la suma de los primeros n enteros
positivos. Por ejemplo, n=4 es 1+2+3+4=10.
 */
package Proyecto1_Recursividad;

import java.util.*;

public class Ejercicio2 {

    public static int sumaEnteros(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x + sumaEnteros(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = consola.nextInt();
        int resultado = sumaEnteros(num);
        System.out.println("La suma recursiva de el entero " + num + " es igual a = " + resultado);
    }
}
