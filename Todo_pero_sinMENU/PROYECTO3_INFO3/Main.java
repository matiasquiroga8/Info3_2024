import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionPedidos gestion = new GestionPedidos(5); // Capacidad máxima de la cola: 5
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE GESTIÓN DE PEDIDOS ---");
            System.out.println("1. Agregar Pedido");
            System.out.println("2. Preparar Pedido");
            System.out.println("3. Deshacer Último Pedido");
            System.out.println("4. Ver Último Pedido Completado");
            System.out.println("5. Ver Próximo Pedido en la Cola");
            System.out.println("6. Vaciar Pila de Pedidos Completados");
            System.out.println("7. Ver Pila Completa de Pedidos Completados");
            System.out.println("8. Ver Cola Completa de Pedidos Agregados");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del pedido: ");
                    String pedido = scanner.nextLine();
                    gestion.agregarPedido(pedido);
                    break;

                case 2:
                    gestion.prepararPedido();
                    break;

                case 3:
                    gestion.deshacerUltimoPedido();
                    break;

                case 4:
                    gestion.verUltimoPedidoCompletado();
                    break;

                case 5:
                    gestion.verProximoPedido();
                    break;

                case 6:
                    gestion.vaciarPila();
                    break;

                case 7:
                    gestion.verPilaCompleta();
                    break;

                case 8:
                    gestion.verColaCompleta();
                    break;

                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}


//Con este sistema, puedes manejar pedidos, prepararlos, deshacer los 
//completados, y verificar el estado tanto de la cola como de la pila en cualquier momento.