
package Proyecto4_PilaYColaConLista;

public class ColaConLista {
    private NodoFrente frente;
    private NodoFrente finalNodo; // Cambié de NodoFinal a NodoFrente

    private class NodoFrente {
        Pedido pedido;
        NodoFrente siguiente;

        NodoFrente(Pedido pedido) {
            this.pedido = pedido;
            this.siguiente = null;
        }
    }

    public ColaConLista() {
        this.frente = null;
        this.finalNodo = null; // Mantiene la referencia al final de la cola
    }

    public void enqueue(Pedido pedido) {
        NodoFrente nuevoNodo = new NodoFrente(pedido);
        if (frente == null) {
            frente = nuevoNodo;
            finalNodo = nuevoNodo; // Ajustado para apuntar correctamente al nodo final
        } else {
            finalNodo.siguiente = nuevoNodo; // Añadir el nuevo nodo al final
            finalNodo = nuevoNodo; // Actualizar el nodo final
        }
    }

    public Pedido dequeue() {
        if (frente == null) {
            return null; // Cola vacía
        }
        Pedido pedido = frente.pedido; // Obtener el pedido del frente
        frente = frente.siguiente; // Mover el frente a la siguiente
        return pedido; // Retornar el pedido
    }

    public Pedido top() {
        return (frente != null) ? frente.pedido : null; // Retornar el pedido en el frente sin eliminar
    }

    public boolean isEmpty() {
        return (frente == null); // Verificar si la cola está vacía
    }

    public int size() {
        int count = 0;
        NodoFrente temp = frente; // Usar NodoFrente
        while (temp != null) {
            count++;
            temp = temp.siguiente;
        }
        return count; // Retornar el tamaño de la cola
    }

    public void mostrar() {
        NodoFrente temp = frente; // Usar NodoFrente
        System.out.println("Pedidos en preparación:");
        while (temp != null) {
            System.out.println(temp.pedido); // Asumimos que Pedido tiene un método toString()
            temp = temp.siguiente; // Avanzar al siguiente nodo
        }
    }
}


//Aquí implementas la Cola utilizando Listas Enlazadas.
// Los métodos importantes son enqueue para agregar un pedido al final de la cola y 
//dequeue para remover el pedido al frente de la cola.