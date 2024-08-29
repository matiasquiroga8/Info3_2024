
import java.util.*;

public class RecursividadNumNat {

    /*
    Implementar una función recursiva que calcule la suma de los primeros n
    números naturales.
    Ejemplo: suma(5) = 15.
     */
    public static long sumaNaturales(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + sumaNaturales(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el Numero que desea sumar: ");
        int num = consola.nextInt();
        long resultado = sumaNaturales(num);
        System.out.println("La suma de " + num + " es igual a " + resultado);
    }
}
