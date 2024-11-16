package ProyectoFinalMenu;

import Proyecto2_Ordenamiento.Main.*;
import Proyecto3_PilaYCola.Main.*;
import Proyecto4_PilaYColaConLista.Main.*;
import Proyecto5_ArbolBinario.Main.*;
import Proyecto6_ArbolBinario2.Main.*;
import Proyecto7_ArbolBinarioAVL.Main.*;
import Proyecto8_ArbolRojiNegro.*;
import Proyecto8ejercicio4.*;
import Proyecto8ejercicio5.*;
import Proyecto8ejercicio6.*;
import Proyecto9General.*;
import Proyecto9_MonticuloBinario.*;
import Proyecto9_TablaHash.Main.*;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean continuar = true;

        while (continuar) {
            // Mostrar el menú
            System.out.println("\n ===== Menú de Proyectos ===== \n");
            System.out.println(" Proyecto2_Ordenamiento-->Sistema de Gestión de Pedidos en una Pizzería donde se\n"
                    + //
                    "aplicarán tres métodos de ordenamiento (inserción, Shellsort y Quicksort) para organizar y\n"
                    + //
                    "gestionar la lista de pedidos según diferentes criterios: tiempo de preparación, precio total, y\n"
                    + //
                    "nombre del cliente.");
            System.out.println("\n");

            System.out.println("3. Proyecto3_PilaYCola-->sistema de gestión de pedidos de una pizzería, integrando ahora\n"
                    + //
                    "estructuras de datos como Pilas y Colas con arreglos para mejorar la gestión y\n"
                    + //
                    "procesamiento de los pedidos.");
            System.out.println("\n");

            System.out.println("4. Proyecto4_PilaYColaConLista-->Ampliar el sistema de gestión de pedidos de la pizzería,\n"
                    + //
                    "reemplazando las estructuras de datos basadas en arreglos por Pilas y Colas\n"
                    + //
                    "implementadas con Listas Enlazadas. Esto permitirá una gestión más eficiente y\n"
                    + //
                    "dinámica de los pedidos, además de preparar el sistema para manejar una cantidad variable\n"
                    + //
                    "de pedidos sin los límites de tamaño que imponen los arreglos.");
            System.out.println("\n");

            System.out.println("5. Proyecto5_ArbolBinario-->TEMA : ARBOL BINARIO");
            System.out.println("\n");

            System.out.println("6. Proyecto6_ArbolBinario2");
            System.out.println("\n");

            System.out.println("7. Proyecto7_ArbolBinarioAVL");
            System.out.println("8. Proyecto8_ArbolRojiNegro");
            System.out.println("9. Proyecto8ejercicio4");
            System.out.println("10. Proyecto8ejercicio5");
            System.out.println("11. Proyecto8ejercicio6");
            System.out.println("\n");

            System.out.println("PROYECTO9 TEMA : MONTICULO BINARIO, TABLA HASH Y GENERAL CON LIBRERIAS NATIVAS DE JAVA");
            System.out.println("12. Proyecto9General-->TEMA: GENERAL CON LIBRERIAS NATIVAS DE JAVA");
            System.out.println("13. Proyecto9_MonticuloBinario-->TEMA: MONTICULO BINARIO");
            System.out.println("14. Proyecto9_TablaHash-->TEMA: TABLA HASH");
            System.out.println("\n");

            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {

                case 2:
                    Proyecto2_Ordenamiento.Main.main(args);
                    break;
                case 3:
                    Proyecto3_PilaYCola.Main.main(args);
                    break;
                case 4:
                    Proyecto4_PilaYColaConLista.Main.main(args);
                    break;
                case 5:
                    Proyecto5_ArbolBinario.Main.main(args);
                    break;
                case 6:
                    Proyecto6_ArbolBinario2.Main.main(args);
                    break;
                case 7:
                    Proyecto7_ArbolBinarioAVL.Main.main(args);
                    break;
                case 8:
                    Proyecto8_ArbolRojiNegro.Main.main(args);
                    break;
                case 9:
                    Proyecto8ejercicio4.Main.main(args);
                    break;
                case 10:
                    Proyecto8ejercicio5.Main.main(args);
                    break;
                case 11:
                    Proyecto8ejercicio6.Main.main(args);
                    break;
                case 12:
                    Proyecto9General.Main.main(args);
                    break;
                case 13:
                    Proyecto9_MonticuloBinario.Main.main(args);
                    break;
                case 14:
                    Proyecto9_TablaHash.Main.main(args);
                case 0:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            if (option != 0) {
                System.out.print("¿Deseas elegir otra opción del menú? (s/n): ");
                char respuesta = scanner.next().charAt(0);
                if (respuesta != 's' && respuesta != 'S') {
                    continuar = false;
                }
            }
        }

        scanner.close();
    }
}
