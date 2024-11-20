package Proyecto4_PilaYColaConLista;

import java.util.*;

public class PilaConLista<T> {

    // Lista para almacenar los elementos de la pila
    private List<T> pila;

    // Constructor
    public PilaConLista() {
        this.pila = new ArrayList<>();
    }

    // Método para agregar un elemento a la pila (push)
    public void push(T elemento) {
        pila.add(elemento);
    }

    // Método para eliminar y devolver el elemento en la cima de la pila (pop)
    public T pop() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return pila.remove(pila.size() - 1);
    }

    // Método para ver el elemento en la cima sin eliminarlo (top o peek)
    public T top() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return pila.get(pila.size() - 1);
    }

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return pila.isEmpty();
    }

    // Método para mostrar los elementos de la pila
    public void mostrarPila() {
        System.out.println("Contenido de la pila: " + pila);
    }

    // Programa principal para probar la pila
    public static void main(String[] args) {
        PilaConLista<Integer> pila = new PilaConLista<>();

        System.out.println("Agregando elementos a la pila...");
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.mostrarPila();

        System.out.println("\nEl elemento en la cima es: " + pila.top());

        System.out.println("\nEliminando elemento de la cima...");
        pila.pop();
        pila.mostrarPila();

        System.out.println("\nEl elemento en la cima ahora es: " + pila.top());

        System.out.println("\nVerificando si la pila está vacía: " + pila.estaVacia());

        System.out.println("\nEliminando todos los elementos...");
        pila.pop();
        pila.pop();

        pila.mostrarPila();
        System.out.println("¿La pila está vacía? " + pila.estaVacia());
    }
}
