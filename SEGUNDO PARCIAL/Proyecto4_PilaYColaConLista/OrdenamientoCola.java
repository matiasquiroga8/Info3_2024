package Proyecto4_PilaYColaConLista;

import java.util.*;

public class OrdenamientoCola {

    public static void main(String[] args) {
        // Crear una cola de números enteros
        Queue<Integer> cola = new LinkedList<>();
        cola.add(5);
        cola.add(2);
        cola.add(8);
        cola.add(1);
        cola.add(3);

        System.out.println("Cola original: " + cola);

        // Ordenar la cola
        ordenarCola(cola);

        System.out.println("Cola ordenada en forma ascendente: " + cola);
    }

    // Método para ordenar una cola en forma ascendente utilizando una pila
    public static void ordenarCola(Queue<Integer> cola) {
        Stack<Integer> pila = new Stack<>();

        // Paso 1: Transferir todos los elementos de la cola a la pila
        while (!cola.isEmpty()) {
            pila.push(cola.poll());
        }

        // Paso 2: Ordenar la pila utilizando una cola como auxiliar
        while (!pila.isEmpty()) {
            int temp = pila.pop();

            // Insertar el elemento en la posición correcta en la cola
            int tamaño = cola.size();
            boolean agregado = false;

            for (int i = 0; i < tamaño; i++) {
                int front = cola.poll();
                if (!agregado && temp < front) {
                    cola.add(temp);
                    agregado = true;
                }
                cola.add(front);
            }

            if (!agregado) {
                cola.add(temp);
            }
        }
    }
}
