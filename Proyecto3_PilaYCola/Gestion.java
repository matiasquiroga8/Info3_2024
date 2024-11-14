package Proyecto3_PilaYCola;
import java.util.*;

public class Gestion {
    private ColaPedidos cola;
    private PilaPedidos pila;

    public Gestion(int capacidadCola) {
        cola = new ColaPedidos(capacidadCola);
        pila = new PilaPedidos();
    }

    // Método para agregar un nuevo pedido a la cola
    public void agregarPedido(String pedido) {
        if (cola.enqueue(pedido)) {
            System.out.println("Pedido agregado a la cola: " + pedido);
        } else {
            System.out.println("La cola está llena. No se puede agregar el pedido.");
        }
    }

    // Método para preparar el pedido (mover de la cola a la pila)
    public void prepararPedido() {
        String pedido = cola.dequeue();
        if (pedido != null) {
            pila.push(pedido);
            System.out.println("Pedido preparado: " + pedido);
        } else {
            System.out.println("No hay pedidos en la cola para preparar.");
        }
    }

    // Método para deshacer el último pedido completado (mover de la pila a la cola)
    public void deshacerUltimoPedido() {
        String pedido = pila.pop();
        if (pedido != null) {
            cola.enqueue(pedido);
            System.out.println("Pedido deshecho: " + pedido);
        } else {
            System.out.println("No hay pedidos para deshacer.");
        }
    }

    // Método para ver el último pedido completado
    public void verUltimoPedidoCompletado() {
        String pedido = pila.top();
        if (pedido != null) {
            System.out.println("Último pedido completado: " + pedido);
        } else {
            System.out.println("No hay pedidos completados.");
        }
    }

    // Método para ver el próximo pedido en la cola
    public void verProximoPedido() {
        String pedido = cola.top();
        if (pedido != null) {
            System.out.println("Próximo pedido en la cola: " + pedido);
        } else {
            System.out.println("No hay pedidos en la cola.");
        }
    }

    // Método para vaciar la pila
    public void vaciarPila() {
        pila.makeEmpty();
        System.out.println("La pila de pedidos completados ha sido vaciada.");
    }

    // Método para mostrar todos los pedidos completados en la pila
    public void verPilaCompleta() {
        pila.mostrarPilaCompleta();
    }

    // Método para mostrar todos los pedidos en la cola
    public void verColaCompleta() {
        cola.mostrarColaCompleta();
    }
}

//GestionPedidos combina las funcionalidades de la pila y la cola para 
//gestionar los pedidos eficientemente.