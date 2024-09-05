package PROYECTO2_INFO3.src.Trabajando_elPedido;

import java.util.ArrayList;
import java.util.List;

public class GestionPedidos01 {
    private List<Pedido01> listaPedidos;
    private List<Pedido01> pedidosEliminados; // Lista para almacenar pedidos eliminados

    // Constructor
    public GestionPedidos01() {
        this.listaPedidos = new ArrayList<>();
        this.pedidosEliminados = new ArrayList<>();
    }

    // Método para agregar un pedido
    public void agregarPedido(Pedido01 pedido) {
        listaPedidos.add(pedido);
    }

    // Método para listar todos los pedidos
    public void listarPedidos() {
        if (listaPedidos.isEmpty()) {
            System.out.println("No hay pedidos.");
        } else {
            System.out.println("Lista de Pedidos:");
            for (Pedido01 pedido : listaPedidos) {
                System.out.println(pedido);
                System.out.println(); // Línea en blanco entre pedidos
            }
        }
    }

    // Método para obtener un pedido por ID
    public Pedido01 obtenerPedidoPorId(int id) {
        for (Pedido01 pedido : listaPedidos) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }
        return null; // Si no se encuentra el pedido
    }

    // Método para eliminar un pedido si está completado
    public boolean eliminarPedidoSiCompletado(int id) {
        Pedido01 pedido = obtenerPedidoPorId(id);
        if (pedido != null && pedido.isCompletado()) {
            boolean eliminado = listaPedidos.remove(pedido);
            if (eliminado) {
                pedidosEliminados.add(pedido); // Agregar a la lista de eliminados
            }
            return eliminado;
        }
        return false; // Si el pedido no está completado o no se encuentra
    }

    // Método para listar pedidos eliminados
    public void listarPedidosEliminados() {
        if (pedidosEliminados.isEmpty()) {
            System.out.println("No hay pedidos eliminados.");
        } else {
            System.out.println("Lista de Pedidos Eliminados:");
            for (Pedido01 pedido : pedidosEliminados) {
                System.out.println(pedido);
            }
        }
    }

    // Método para listar pedidos no completados
    public void listarPedidosNoCompletados() {
        boolean hayNoCompletados = false;
        for (Pedido01 pedido : listaPedidos) {
            if (!pedido.isCompletado()) {
                if (!hayNoCompletados) {
                    System.out.println("\n");
                    hayNoCompletados = true;
                }
                System.out.println(pedido);
            }
        }
        if (!hayNoCompletados) {
            System.out.println("No hay pedidos no completados.");
        }
    }


     // Método para obtener la lista de pedidos
    public List<Pedido01> obtenerListaPedidos() {
        return new ArrayList<>(listaPedidos);
    }
}

/*Primero, crea una clase que manejará la lista de pedidos. Esta clase incluirá métodos para agregar, eliminar y listar pedidos.*/

/*Método eliminarPedidoSiCompletado:

    Obtener el Pedido: Utiliza el método obtenerPedidoPorId(id) para encontrar el pedido con el ID proporcionado.
    Verificar Estado: Si el pedido existe y su estado completado es true, 
    el método procede a eliminar el pedido de listaPedidos.
    Eliminar el Pedido: Usa listaPedidos.remove(pedido) para eliminar el pedido de la lista. 
    Retorna true si la eliminación fue exitosa y false si el pedido no se encuentra o no está completado. */