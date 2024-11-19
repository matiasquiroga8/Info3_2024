package Proyecto4_PilaYColaConLista;

import java.util.*;

public class ColaNumeros {

    public static void main(String[] args) {
        // Crear una cola para almacenar números enteros
        Queue<Integer> cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la cola de números.");
        System.out.println("Ingresa números enteros para encolarlos. Ingresa -1 para terminar.");

        // Solicitar números al usuario y encolarlos
        while (true) {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();

            if (numero == -1) { // Condición de salida
                break;
            }
            cola.add(numero); // Encolar el número
        }

        System.out.println("\nNúmeros encolados: " + cola);

        // Desencolar y sumar los números
        int suma = 0;
        System.out.println("\nDesencolando números y calculando la suma...");
        while (!cola.isEmpty()) {
            int numero = cola.poll(); // Desencolar el número
            System.out.println("Número desencolado: " + numero);
            suma += numero; // Sumar el número
        }

        System.out.println("\nLa suma de los números es: " + suma);
    }
}
