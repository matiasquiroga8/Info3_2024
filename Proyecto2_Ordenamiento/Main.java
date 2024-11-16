package Ordenamiento;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Pizzeria gestion = new Pizzeria();
        Ordenador ordenador = new Ordenador(gestion);
        int opcion;

        do {
            System.out.println();
            System.out.println("¿Qué quiere hacer?\n1-Cargar nuevo pedido.\n2-Eliminar pedido.\n3-Actualizar informacion pedido.\n4-Ordenar pedidos.\n5-Mostrar todos los pedidos\n6-Cerrar el programa.");
            opcion = consola.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Numero de pedido: ");
                    int numPedido = consola.nextInt();
                    consola.nextLine();

                    System.out.println("Nombre del cliente: ");
                    String nombre = consola.nextLine();

                    System.out.println("Apellido del cliente: ");
                    String apellido = consola.nextLine();

                    System.out.println("Precio total del pedido: ");
                    double precio = consola.nextDouble();
                    consola.nextLine();

                    System.out.println("Tiempo estimado del pedido: ");
                    double tiempo = consola.nextDouble();
                    consola.nextLine();

                    gestion.agregarPedido(new Pedido(nombre, apellido, precio, tiempo, (numPedido - 1)));
                }
                case 2 -> {
                    System.out.println("Numero del pedido que desea eliminar: ");
                    int numPedido = consola.nextInt();
                    gestion.eliminarPedido(numPedido - 1);
                }
                case 3 -> {
                    System.out.println("Numero del pedido que desea actualizar: ");
                    int numPedido = consola.nextInt();
                    consola.nextLine();

                    System.out.println("Nombre del cliente: ");
                    String nombre = consola.nextLine();

                    System.out.println("Apellido del cliente: ");
                    String apellido = consola.nextLine();

                    System.out.println("Precio total del pedido: ");
                    double precio = consola.nextDouble();
                    consola.nextLine();

                    System.out.println("Tiempo estimado del pedido: ");
                    double tiempo = consola.nextDouble();
                    consola.nextLine();

                    gestion.actualizarPedido((numPedido - 1), nombre, apellido, tiempo, precio);
                }
                case 4 -> {
                    System.out.println("¿Como desea ordenar los pedidos?");
                    System.out.println("1-Ordenar por precio total.\n2-Ordenar por tiempo de preparacion.\n3-Ordenar por nombre.\n");
                    int opcion1 = consola.nextInt();
                    switch (opcion1) {
                        case 1 -> {
                            System.out.println("\nPedidos ordenados por precio total:");
                            ordenador.ordenarPorPrecio();
                            gestion.mostrarPedidos();
                        }
                        case 2 -> {
                            System.out.println("\nPedidos ordenados por tiempo de preparación:");
                            ordenador.ordenarPorTiempo();
                            gestion.mostrarPedidos();
                        }
                        case 3 -> {
                            System.out.println("\nPedidos ordenados por nombre del cliente:");
                            ordenador.ordenarPorNombreCliente();
                            gestion.mostrarPedidos();
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Los pedidos hasta el momento son:");
                    gestion.mostrarPedidos();
                }
                case 6 ->
                    System.out.println("Gracias por usar nuestro programa, Adios");
            }
        } while (opcion != 6);
    }
}
