import java.math.BigInteger;
import java.util.Scanner;

public class ejerci1_proyect1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número entero para calcular su factorial (o 'q' para salir): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Saliendo del programa.");
                break;
            }

            try {
                int numero = Integer.parseInt(input);

                if (numero < 0) {
                    System.out.println("El factorial de un número negativo no está definido.");
                } else {
                    BigInteger bigNumero = BigInteger.valueOf(numero);
                    long startTime = System.nanoTime(); // Inicia la medición de tiempo
                    BigInteger resultado = Factorial.calcularFactorial(bigNumero);
                    long endTime = System.nanoTime(); // Termina la medición de tiempo

                    System.out.println("El factorial de " + numero + " es: " + resultado);
                    System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " nanosegundos");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número entero válido.");
            }
        }

        scanner.close();
    }
}