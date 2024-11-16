/*
Escriba un método recursivo que calcule el producto de dos números enteros
usando sumas sucesivas. Por ejemplo, 2x4=2+2+2+2=8
 */
package Proyecto1_Recursividad;

import java.util.*;

public class Ejercicio5 {

    public static long producto(int x, int y) {
        if (y == 0 | x == 0) {
            return 0;
        } else {
            return x + producto(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = consola.nextInt();
        consola.nextLine();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = consola.nextInt();
        consola.nextLine();
        long resultado = producto(num1, num2);
        System.out.println("El producto entre " + num1 + " y " + num2 + " es igual a = " + resultado);
    }
}
