
package Proyecto4_PilaYColaConLista;

public class ColaConLista {
    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();

        System.out.println("Agregando elementos a la cola...");
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.mostrarCola();

        System.out.println("\nEl elemento del frente es: " + cola.top());

        System.out.println("\nEliminando elemento del frente...");
        cola.dequeue();
        cola.mostrarCola();

        System.out.println("\nEl elemento del frente ahora es: " + cola.top());

        System.out.println("\nVerificando si la cola está vacía: " + cola.estaVacia());

        System.out.println("\nEliminando todos los elementos...");
        cola.dequeue();
        cola.dequeue();

        cola.mostrarCola();
        System.out.println("¿La cola está vacía? " + cola.estaVacia());
    }
}
