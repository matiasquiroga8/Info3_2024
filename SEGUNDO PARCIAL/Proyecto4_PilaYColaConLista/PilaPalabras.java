package Proyecto4_PilaYColaConLista;

import java.util.*;

public class PilaPalabras {

    public static void main(String[] args) {
        // Crear una pila para almacenar palabras
        Stack<String> pilaDePalabras = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String palabra;

        System.out.println("Ingresa palabras para apilarlas (escribe 'fin' para terminar):");

        // Solicitar al usuario ingresar palabras hasta que escriba "fin"
        while (true) {
            System.out.print("Ingresa una palabra: ");
            palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }

            pilaDePalabras.push(palabra); // Apilar la palabra
        }

        System.out.println("\nPalabras apiladas:");
        System.out.println(pilaDePalabras);

        System.out.println("\nDesapilando e imprimiendo palabras en orden inverso:");
        while (!pilaDePalabras.isEmpty()) {
            System.out.println(pilaDePalabras.pop()); // Desapilar e imprimir
        }
    }
}
