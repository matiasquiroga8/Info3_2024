package Proyecto4_PilaYColaConLista;

import java.util.*;

public class DecimalBinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número decimal
        System.out.print("Ingresa un número decimal: ");
        int numeroDecimal = scanner.nextInt();

        // Convertir el número a binario utilizando una pila
        String binario = convertirABinario(numeroDecimal);

        // Mostrar el resultado
        System.out.println("La representación binaria es: " + binario);
    }

    // Método para convertir un número decimal a binario usando una pila
    public static String convertirABinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0"; // Caso especial si el número es 0
        }

        Stack<Integer> pila = new Stack<>();

        // Algoritmo de división sucesiva por 2
        while (numeroDecimal > 0) {
            pila.push(numeroDecimal % 2); // Guardar el resto en la pila
            numeroDecimal /= 2;          // Dividir el número por 2
        }

        // Construir el número binario desde la pila
        StringBuilder binario = new StringBuilder();
        while (!pila.isEmpty()) {
            binario.append(pila.pop()); // Desapilar los elementos para formar el binario
        }

        return binario.toString();
    }
}
