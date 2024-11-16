/*
Escriba un método recursivo que devuelva el número de unos en la representación
binaria de N. Use el hecho de que es igual al número de unos en la representación
binaria de N/2, más 1 si N es impar.
 */
package Proyecto1_Recursividad;

import java.util.*;

public class Ejercicio7 {

    public static int repBinaria(int x) {
        if (x == 0) {
            return 0;
        } else {
            return repBinaria(x / 2) + (x % 2);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese un numero para la representacion binaria: ");
        int num = consola.nextInt();
        System.out.println("El número de unos en la representación binaria de " + num + " es: " + repBinaria(num));
    }
}
