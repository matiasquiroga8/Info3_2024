package Proyecto3_PilaYCola;

import java.util.*;

public class OrdenarCola {

    // Método para ordenar una cola en orden ascendente
    public static void ordenarColaAscendente(Queue<Integer> cola) {
        Queue<Integer> colaAuxiliar = new LinkedList<>();

        while (!cola.isEmpty()) {
            // Encuentra el menor elemento de la cola
            int menor = encontrarMenor(cola);
            // Remueve el menor de la cola original y añádelo a la auxiliar
            moverElemento(cola, colaAuxiliar, menor);
        }

        // Transfiere los elementos ordenados de vuelta a la cola original
        cola.addAll(colaAuxiliar);
    }

    // Encuentra el menor elemento en la cola
    private static int encontrarMenor(Queue<Integer> cola) {
        int menor = Integer.MAX_VALUE;

        int size = cola.size();
        for (int i = 0; i < size; i++) {
            int elemento = cola.poll(); // Desencolar elemento
            if (elemento < menor) {
                menor = elemento; // Actualizar el menor encontrado
            }
            cola.offer(elemento); // Reinsertar el elemento en la cola
        }

        return menor;
    }

    // Mueve un elemento específico de la cola original a la cola auxiliar
    private static void moverElemento(Queue<Integer> cola, Queue<Integer> colaAuxiliar, int elemento) {
        int size = cola.size();
        boolean elementoMovido = false;

        for (int i = 0; i < size; i++) {
            int actual = cola.poll(); // Desencolar elemento
            if (actual == elemento && !elementoMovido) {
                colaAuxiliar.offer(actual); // Mover el elemento a la cola auxiliar
                elementoMovido = true;
            } else {
                cola.offer(actual); // Reinsertar el elemento en la cola original
            }
        }
    }

    // Método para imprimir una cola
    public static void mostrarCola(String mensaje, Queue<Integer> cola) {
        System.out.print(mensaje + ": ");
        for (Integer elemento : cola) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    // Programa principal para probar la funcionalidad
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.offer(10);
        cola.offer(5);
        cola.offer(30);
        cola.offer(20);
        cola.offer(15);

        // Mostrar la cola original
        mostrarCola("Cola original", cola);

        // Ordenar la cola en orden ascendente
        ordenarColaAscendente(cola);

        // Mostrar la cola ordenada
        mostrarCola("Cola ordenada", cola);
    }
}
