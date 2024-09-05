package PROYECTO2_INFO3.src;

import TrabajandoelOrdenador.OrdenamientoPorShell;
import PROYECTO2_INFO3.src.Trabajando_elPedido.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainconShell {
    public static void main(String[] args) {
        // Crear una instancia de GestionPedidos01
        GestionPedidos01 gestionPedidos = new GestionPedidos01();
        Scanner scanner = new Scanner(System.in);

        // Generar 100 pedidos con datos aleatorios
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            String nombreCliente = "Cliente " + i;
            LocalDateTime fechaHora = LocalDateTime.now().plusMinutes(random.nextInt(120));
            double precioTotal = 10 + random.nextDouble() * 40; // Precio entre 10 y 50
            int tiempoPreparacion = 10 + random.nextInt(60); // Tiempo entre 10 y 70 minutos
            Pedido01 pedido = new Pedido01(i, nombreCliente, fechaHora, precioTotal, tiempoPreparacion);
            gestionPedidos.agregarPedido(pedido);
        }

        // Obtener la lista de pedidos
        List<Pedido01> listaPedidos = gestionPedidos.obtenerListaPedidos();

        // Medir el tiempo de ejecución del ordenamiento por Shell
        long inicioTiempo = System.currentTimeMillis();
        OrdenamientoPorShell.ordenarPorPrecio(listaPedidos);
        long finTiempo = System.currentTimeMillis();
        long tiempoEjecucion = finTiempo - inicioTiempo;

        // Listar todos los pedidos ordenados por precio
        System.out.println("Lista de Pedidos Ordenados por Precio:");
        for (Pedido01 pedido : listaPedidos) {
            System.out.println(pedido);
        }

        // Imprimir el tiempo de ejecución
        System.out.println("\nTiempo de ejecución del ordenamiento por Shell: " + tiempoEjecucion + " milisegundos");

        boolean continuar = true;
        while (continuar) {
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
                    pedido.setCompletado(true); // Marcar el pedido como completado
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
            listaPedidos = gestionPedidos.obtenerListaPedidos();
            OrdenamientoPorShell.ordenarPorPrecio(listaPedidos);
            for (Pedido01 p : listaPedidos) {
                System.out.println(p);
            }

            // Preguntar al usuario si desea eliminar otro pedido
            System.out.print("¿Desea eliminar otro pedido? (Sí/No): ");
            String continuarRespuesta = scanner.nextLine().trim().toLowerCase();
            continuar = continuarRespuesta.equals("sí") || continuarRespuesta.equals("si");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
