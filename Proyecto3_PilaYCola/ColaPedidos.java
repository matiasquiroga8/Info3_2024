package Proyecto3_PilaYCola;
import java.util.*;

public class ColaPedidos {
    private Queue<String> cola;
    private int capacidadMaxima;

    public ColaPedidos(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        cola = new LinkedList<>();
    }

    // Método para agregar un pedido a la cola
    public boolean enqueue(String pedido) {
        if (!isFull()) {
            cola.add(pedido);
            return true;
        } else {
            return false; // La cola está llena
        }
    }

    // Método para remover el pedido al frente de la cola
    public String dequeue() {
        if (!isEmpty()) {
            return cola.poll();
        } else {
            return null; // No hay pedidos en la cola
        }
    }

    // Método para ver el pedido al frente de la cola sin removerlo
    public String top() {
        if (!isEmpty()) {
            return cola.peek();
        } else {
            return null;
        }
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    // Método para verificar si la cola está llena
    public boolean isFull() {
        return cola.size() >= capacidadMaxima;
    }

    // Método para mostrar todos los pedidos en la cola
    public void mostrarColaCompleta() {
        if (isEmpty()) {
            System.out.println("La cola de pedidos está vacía.");
        } else {
            System.out.println("Pedidos en la cola:");
            for (String pedido : cola) {
                System.out.println(pedido);
            }
        }
    }
}

//ColaPedidos maneja la lista de pedidos pendientes de preparación.