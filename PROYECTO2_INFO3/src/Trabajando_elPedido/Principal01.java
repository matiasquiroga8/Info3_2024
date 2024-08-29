package PROYECTO2_INFO3.src.Trabajando_elPedido;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal01 {
    public static void main(String[] args) {
        // Crear una instancia de GestionPedidos01
        GestionPedidos01 gestionPedidos = new GestionPedidos01();
        Scanner scanner = new Scanner(System.in);

        // Crear algunos pedidos
        Pedido01 pedido1 = new Pedido01(1, "Juan Pérez", LocalDateTime.now(), 25.50, 30);
        Pedido01 pedido2 = new Pedido01(2, "Ana Gómez", LocalDateTime.now().plusHours(1), 15.75, 20);
        Pedido01 pedido3 = new Pedido01(3, "Luis Martínez", LocalDateTime.now().plusHours(2), 30.00, 45);

        // Agregar pedidos a la gestión
        gestionPedidos.agregarPedido(pedido1);
        gestionPedidos.agregarPedido(pedido2);
        gestionPedidos.agregarPedido(pedido3);

        // Listar todos los pedidos
        System.out.println("Lista de Pedidos:");
        gestionPedidos.listarPedidos();

        // Solicitar al usuario el ID del pedido que desea verificar
        System.out.print("Ingrese el ID del pedido para verificar si está completado: ");
        int idPedido = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        // Obtener y mostrar el pedido específico
        Pedido01 pedido = gestionPedidos.obtenerPedidoPorId(idPedido);
        if (pedido != null) {
            System.out.println("Detalles del Pedido con ID " + idPedido + ":");
            System.out.println(pedido);

            // Solicitar al usuario si el pedido está completado
            System.out.print("¿Está completado el pedido? (Sí/No): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            boolean completado = respuesta.equals("sí") || respuesta.equals("si");

            // Si el pedido está completado, eliminarlo
            if (completado) {
                boolean eliminado = gestionPedidos.eliminarPedidoSiCompletado(idPedido);
                if (eliminado) {
                    System.out.println("Pedido con ID " + idPedido + " eliminado correctamente.");
                } else {
                    System.out.println("No se pudo eliminar el pedido con ID " + idPedido + ". Puede que no esté completado.");
                }
            } else {
                System.out.println("El pedido con ID " + idPedido + " no está completado y no se eliminará.");
            }
        } else {
            System.out.println("Pedido con ID " + idPedido + " no encontrado.");
        }

        // Listar pedidos después de la eliminación
        System.out.println("\nLista de Pedidos después de la eliminación (si corresponde):");
        gestionPedidos.listarPedidos();

        // Cerrar el scanner
        scanner.close();
    }
}
