import java.util.Stack;

public class PilaPedidos {
    private Stack<String> pila;

    public PilaPedidos() {
        pila = new Stack<>();
    }

    // Método para agregar un pedido completado a la pila
    public void push(String pedido) {
        pila.push(pedido);
    }

    // Método para quitar el último pedido de la pila
    public String pop() {
        if (!isEmpty()) {
            return pila.pop();
        } else {
            return null; // No hay pedidos para deshacer
        }
    }

    // Método para ver el último pedido completado sin removerlo
    public String top() {
        if (!isEmpty()) {
            return pila.peek();
        } else {
            return null;
        }
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    // Método para vaciar completamente la pila
    public void makeEmpty() {
        pila.clear();
    }

    // Método para mostrar todos los pedidos completados en la pila
    public void mostrarPilaCompleta() {
        if (isEmpty()) {
            System.out.println("La pila de pedidos completados está vacía.");
        } else {
            System.out.println("Pedidos completados en la pila:");
            for (int i = pila.size() - 1; i >= 0; i--) {
                System.out.println(pila.get(i));
            }
        }
    }
}

//PilaPedidos gestiona los pedidos completados, permitiendo "deshacer" 
//un pedido si fue procesado incorrectamente.