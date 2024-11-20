package Proyecto4_PilaYColaConLista;

public class Cola<T> {

    private Nodo<T> frente; // Primer elemento de la cola
    private Nodo<T> finalCola; // Último elemento de la cola
    private int tamaño; // Tamaño de la cola

    // Constructor
    public Cola() {
        this.frente = null;
        this.finalCola = null;
        this.tamaño = 0;
    }

    // Método para agregar un elemento al final de la cola (enqueue)
    public void enqueue(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (finalCola == null) { // Si la cola está vacía
            frente = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
        }
        finalCola = nuevoNodo;
        tamaño++;
    }

    // Método para eliminar el elemento del frente de la cola (dequeue)
    public T dequeue() {
        if (frente == null) {
            throw new IllegalStateException("La cola está vacía.");
        }
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) { // Si la cola queda vacía
            finalCola = null;
        }
        tamaño--;
        return dato;
    }

    // Método para ver el elemento del frente sin eliminarlo (top o peek)
    public T top() {
        if (frente == null) {
            throw new IllegalStateException("La cola está vacía.");
        }
        return frente.dato;
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }

    // Método para obtener el tamaño de la cola
    public int tamaño() {
        return tamaño;
    }

    // Método para mostrar todos los elementos de la cola
    public void mostrarCola() {
        Nodo<T> actual = frente;
        System.out.print("Cola: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
