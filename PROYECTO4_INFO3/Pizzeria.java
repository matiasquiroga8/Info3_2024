import java.util.LinkedList;
import java.util.List;

public class Pizzeria {
    private ColaConLista colaPedidos;
    private PilaConLista pilaPedidosCompletados;

    public Pizzeria() {
        colaPedidos = new ColaConLista();
        pilaPedidosCompletados = new PilaConLista();
    }

    public void nuevoPedido(Pedido pedido) {
        colaPedidos.enqueue(pedido);
    }

    public void completarPedido() {
        Pedido pedido = colaPedidos.dequeue();
        if (pedido != null) {
            pilaPedidosCompletados.push(pedido);
        }
    }

    public Pedido pedidoEnPreparacion() {
        return colaPedidos.top();
    }

    public Pedido pedidoCompletado() {
        return pilaPedidosCompletados.top();
    }

    public int totalPedidosEnPreparacion() {
        return colaPedidos.size();
    }

    public int totalPedidosCompletados() {
        return pilaPedidosCompletados.size();
    }

    public void mostrarPedidosEnPreparacion() {
        colaPedidos.mostrar();
    }

    public void mostrarPedidosCompletados() {
        pilaPedidosCompletados.mostrar();
    }

    public List<Pedido> getPedidosEnPreparacion() {
        List<Pedido> listaPedidos = new LinkedList<>();
        ColaConLista tempCola = new ColaConLista();

        while (!colaPedidos.isEmpty()) {
            Pedido pedido = colaPedidos.dequeue();
            listaPedidos.add(pedido);
            tempCola.enqueue(pedido); // Guardar en la cola temporal
        }

        // Devolver los pedidos a la cola original
        while (!tempCola.isEmpty()) {
            colaPedidos.enqueue(tempCola.dequeue());
        }

        return listaPedidos;
    }

    // Método para ordenar los pedidos en preparación
    public void ordenarPedidos() {
        List<Pedido> pedidosEnPreparacion = getPedidosEnPreparacion(); // Obtener la lista de pedidos

        // Utilizar el método de ordenamiento por inserción de la clase Ordenador
        Ordenador.ordenamientoPorInsercion(pedidosEnPreparacion);

        // Vaciar la cola original y volver a llenarla con los pedidos ordenados
        while (!colaPedidos.isEmpty()) {
            colaPedidos.dequeue(); // Vaciar la cola
        }

        for (Pedido pedido : pedidosEnPreparacion) {
            colaPedidos.enqueue(pedido); // Reagregar los pedidos ordenados a la cola
        }

        System.out.println("Pedidos en preparación ordenados por tiempo de preparación.");
    }
}
