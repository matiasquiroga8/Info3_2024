
package Proyecto4_PilaYColaConLista;

public class Nodo<T> {
    T dato; // Dato almacenado en el nodo
    Nodo<T> siguiente; // Referencia al siguiente nodo

    // Constructor
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
