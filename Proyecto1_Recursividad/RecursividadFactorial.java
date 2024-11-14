import java.util.*;

public class RecursividadFactorial {
     /*
    Escribir una función recursiva que calcule el factorial de un número entero n.
    Ejemplo: factorial(5) = 120.
     */
    public static long Factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * Factorial(x - 1);
        }
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el factorial que desea averiguar: ");
        int num = consola.nextInt();
        long resultado = Factorial(num);
        System.out.println("El factorial de " + num + " es igual a " + resultado);
    }
}
