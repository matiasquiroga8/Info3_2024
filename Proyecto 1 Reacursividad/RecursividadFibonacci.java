import java.util.*;

public class RecursividadFibonacci {
    /*
    Crear una función recursiva que devuelva el n-ésimo número de la secuencia
    de Fibonacci.
    Ejemplo: fibonacci(6) = 8.
     */
    
    public static int fibonacci(int x) {
        if (x <= 1) {
            return x;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el numero para fibonacciar: ");
        int num = consola.nextInt();
        int resultado = fibonacci(num);
        System.out.println("El n-ésimo numero de " + num + " es igual a " + resultado);
    }
}
