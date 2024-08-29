package PROYECTO2_INFO3.src.Trabajando_elPedido;

import java.util.ArrayList;
import java.util.List;

public class GestionPedidos01 {
    private List<Pedido01> listaPedidos;

    // Constructor
    public GestionPedidos01() {
        this.listaPedidos = new ArrayList<>();
    }

    // Método para agregar un pedido
    public void agregarPedido(Pedido01 pedido) {
        listaPedidos.add(pedido);
    }

    

    // Método para listar todos los pedidos
    public void listarPedidos() {
        for (Pedido01 pedido : listaPedidos) {
            System.out.println(pedido);
            System.out.println(); // Línea en blanco entre pedidos
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
            return listaPedidos.remove(pedido);
        }
        return false; // Si el pedido no está completado o no se encuentra
    }
}


/*Primero, crea una clase que manejará la lista de pedidos. Esta clase incluirá métodos para agregar, eliminar y listar pedidos.*/

/*Método eliminarPedidoSiCompletado:

    Obtener el Pedido: Utiliza el método obtenerPedidoPorId(id) para encontrar el pedido con el ID proporcionado.
    Verificar Estado: Si el pedido existe y su estado completado es true, 
    el método procede a eliminar el pedido de listaPedidos.
    Eliminar el Pedido: Usa listaPedidos.remove(pedido) para eliminar el pedido de la lista. 
    Retorna true si la eliminación fue exitosa y false si el pedido no se encuentra o no está completado. */