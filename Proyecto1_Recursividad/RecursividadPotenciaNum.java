
import java.util.*;

public class RecursividadPotenciaNum {

    /*
    Implementar una función recursiva que calcule a^b (a elevado a la potencia de b).
    Ejemplo: potencia(2, 3) = 8.
     */
    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * potencia(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese la base de la potencia: ");
        int a = consola.nextInt();
        System.out.print("Ingrese el exponente de la base: ");
        int b = consola.nextInt();
        int resultado = potencia(a,b);
        System.out.println("La base es " + a + " el exponente es " + b + " y es igual a " + resultado);
    }
}
