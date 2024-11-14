
package Proyecto4_PilaYColaConLista;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        // Bucle principal del menú
        while (opcion != 0) {
            System.out.println("\n--- Menú de Gestión de Pedidos ---");
            System.out.println("1. Agregar nuevo pedido");
            System.out.println("2. Completar pedido");
            System.out.println("3. Ver pedido en preparación");
            System.out.println("4. Ver último pedido completado");
            System.out.println("5. Ver total de pedidos en preparación");
            System.out.println("6. Ver total de pedidos completados");
            System.out.println("7. Ordenar pedidos en preparación");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    // Agregar un nuevo pedido
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Ingrese el precio del pedido: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese el tiempo de preparación (en minutos): ");
                    int tiempo = scanner.nextInt();

                    // Crear un nuevo pedido
                    Pedido nuevoPedido = new Pedido(cliente, precio, tiempo);
                    pizzeria.nuevoPedido(nuevoPedido); // Agregar el pedido a la pizzería
                    System.out.println("Pedido agregado exitosamente.");
                    break;

                case 2:
                    // Completar un pedido
                    Pedido completado = pizzeria.pedidoEnPreparacion();
                    if (completado != null) {
                        pizzeria.completarPedido();
                        System.out.println("Pedido completado: " + completado);
                    } else {
                        System.out.println("No hay pedidos en preparación.");
                    }
                    break;

                case 3:
                    // Ver el pedido en preparación
                    Pedido enPreparacion = pizzeria.pedidoEnPreparacion();
                    if (enPreparacion != null) {
                        System.out.println("Pedido en preparación: " + enPreparacion);
                    } else {
                        System.out.println("No hay pedidos en preparación.");
                    }
                    break;

                case 4:
                    // Ver el último pedido completado
                    Pedido ultimoCompletado = pizzeria.pedidoCompletado();
                    if (ultimoCompletado != null) {
                        System.out.println("Último pedido completado: " + ultimoCompletado);
                    } else {
                        System.out.println("No hay pedidos completados.");
                    }
                    break;

                case 5:
                    // Ver total de pedidos en preparación
                    int totalEnPreparacion = pizzeria.totalPedidosEnPreparacion();
                    System.out.println("Total de pedidos en preparación: " + totalEnPreparacion);
                    if (totalEnPreparacion > 0) {
                        System.out.println("Pedidos en preparación:");
                        pizzeria.mostrarPedidosEnPreparacion();
                    }
                    break;

                case 6:
                    // Ver total de pedidos completados
                    int totalCompletados = pizzeria.totalPedidosCompletados();
                    System.out.println("Total de pedidos completados: " + totalCompletados);
                    if (totalCompletados > 0) {
                        System.out.println("Pedidos completados:");
                        pizzeria.mostrarPedidosCompletados();
                    }
                    break;

                case 7:
                    // Ordenar pedidos en preparación
                    int totalPedidos = pizzeria.totalPedidosEnPreparacion();
                    if (totalPedidos > 0) {
                        // Obtener la lista de pedidos en preparación y ordenar
                        pizzeria.ordenarPedidos(); // Asume que esta función se implementa dentro de Pizzeria
                    } else {
                        System.out.println("No hay pedidos en preparación para ordenar.");
                    }
                    break;

                case 0:
                    // Salir del programa
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    // Opción no válida
                    System.out.println("Opción no válida, por favor seleccione otra.");
                    break;
            }
        }

        scanner.close(); // Cerrar el escáner
    }
}
