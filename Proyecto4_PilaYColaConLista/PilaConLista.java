
package Proyecto4_PilaYColaConLista;

public class PilaConLista {
    private Nodo top;

    private class Nodo {
        Pedido pedido;
        Nodo siguiente;

        Nodo(Pedido pedido) {
            this.pedido = pedido;
            this.siguiente = null;
        }
    }

    public PilaConLista() {
        this.top = null;
    }

    public void push(Pedido pedido) {
        Nodo nuevoNodo = new Nodo(pedido);
        nuevoNodo.siguiente = top;
        top = nuevoNodo;
    }

    public Pedido pop() {
        if (isEmpty()) {
            return null;
        }
        Pedido pedido = top.pedido;
        top = top.siguiente;
        return pedido;
    }

    public Pedido top() {
        return (top != null) ? top.pedido : null;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int size() {
        int count = 0;
        Nodo temp = top;
        while (temp != null) {
            count++;
            temp = temp.siguiente;
        }
        return count;
    }

    public void mostrar() {
        Nodo temp = top;
        System.out.println("Pedidos completados:");
        while (temp != null) {
            System.out.println(temp.pedido);
            temp = temp.siguiente;
        }
    }
}

//Esta es la implementación de una Pila utilizando Listas Enlazadas.
// Se maneja con los métodos clásicos de una pila como push, pop, y top.