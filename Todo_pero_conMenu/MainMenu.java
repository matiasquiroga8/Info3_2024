import PROYECTO2_INFO3.src.Trabajando_elPedido.*;
import PROYECTO3_INFO3.Main.*;
import PROYECTO4_INFO3.Main.*;
import PROYECTO5_INFO3.Main.*;
import PROYECTO6_INFO3.Main.*;
import PROYECTO7_INFO3.Main.*;
import PROYECTO7ejerc4_INFO3.*;
import PROYECTO7ejerc5_INFO3.*;
import PROYECTO7ejerc6_INFO3.*;
import PROYECTO8General_INFO3.*;
import PROYECTO8MonticuloBinario_INFO3.*;
import PROYECTO8TablaHash_INFO3.*;
import Proyecto1_Reacursividad.*;
import Proyecto2_Ordenamiento.*;
import Proyecto3_PilaYCola.*;
import Proyecto4_PilaYColaConLista.*;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean continuar = true;

        while (continuar) {
            // Mostrar el menú
            System.out.println("\n ===== Menú de Proyectos ===== \n");
            System.out.println(" PROYECTO2_INFO3-->Sistema de Gestión de Pedidos en una Pizzería donde se\n" + //
                                "aplicarán tres métodos de ordenamiento (inserción, Shellsort y Quicksort) para organizar y\n" + //
                                "gestionar la lista de pedidos según diferentes criterios: tiempo de preparación, precio total, y\n" + //
                                "nombre del cliente.");
                System.out.println("2 Trabajando_elPedido");
                System.out.println("2.1 MainconInsercion (ingrese sin el punto)");
                System.out.println("2.2 MainconQuicksort");
                System.out.println("2.3 MainconShell ");
            System.out.println("\n");

            System.out.println("3. PROYECTO3_INFO3-->sistema de gestión de pedidos de una pizzería, integrando ahora\n" + //
                                "estructuras de datos como Pilas y Colas con arreglos para mejorar la gestión y\n" + //
                                "procesamiento de los pedidos.");
            System.out.println("\n");

            System.out.println("4. PROYECTO4_INFO3-->Ampliar el sistema de gestión de pedidos de la pizzería,\n" + //
                                "reemplazando las estructuras de datos basadas en arreglos por Pilas y Colas\n" + //
                                "implementadas con Listas Enlazadas. Esto permitirá una gestión más eficiente y\n" + //
                                "dinámica de los pedidos, además de preparar el sistema para manejar una cantidad variable\n" + //
                                "de pedidos sin los límites de tamaño que imponen los arreglos.");
            System.out.println("\n");                    

            System.out.println("5. PROYECTO5_INFO3-->TEMA : ARBOL BINARIO");
            System.out.println("\n");


            System.out.println("6. PROYECTO6_INFO3-->TEMA : ARBOL AVL");
            System.out.println("\n");

            System.out.println("PROYECTO7 TEMA : ARBOL ROJINEGRO");
            System.out.println("7. PROYECTO7_INFO3-->TEMA : ARBOL ROJINEGRO");
            System.out.println("8. PROYECTO7ejerc4_INFO3");
            System.out.println("9. PROYECTO7ejerc5_INFO3");
            System.out.println("10. PROYECTO7ejerc6_INFO3");
            System.out.println("\n");


            System.out.println("PROYECTO8 TEMA : MONTICULO BINARIO, TABLA HASH Y GENERAL CON LIBRERIAS NATIVAS DE JAVA");
            System.out.println("11. PROYECTO8General_INFO3-->TEMA: GENERAL CON LIBRERIAS NATIVAS DE JAVA");
            System.out.println("12. PROYECTO8MonticuloBinario_INFO3-->TEMA: MONTICULO BINARIO");
            System.out.println("13. PROYECTO8TablaHash_INFO3-->TEMA: TABLA HASH");

            System.out.println("SEGUNDO PARCIAL - EJERCICIOS EXTRAS DEL PROFESOR SOBRE RECURSIVIDAD,ORDENAMIENTO,PILA,LISTA,COLA");
            System.out.println("3.1 Proyecto1_Reacursividad-->TEMA: RECURSIVIDAD (ingrese sin el punto)");
            System.out.println("3.2 Proyecto2_Ordenamiento-->TEMA: ORDENAMIENTO");
            System.out.println("3.3 Proyecto3_PilaYCola-->TEMA: Pila y Cola");
            System.out.println("3.4 Proyecto4_PilaYColaConLista-->TEMA: Pila y Cola con Lista");


            System.out.println("\n");

            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                
                case 2:
                    PROYECTO2_INFO3.src.Trabajando_elPedido.Principal01.main(args);
                    break;
                case 21:
                    PROYECTO2_INFO3.src.MainconInsercion.main(args);
                    break;
                case 22:
                    PROYECTO2_INFO3.src.MainconQuicksort.main(args);
                    break;
                case 23:
                    PROYECTO2_INFO3.src.MainconShell.main(args);
                    break;
                case 3:
                    PROYECTO3_INFO3.Main.main(args);
                    break;
                case 4:
                    PROYECTO4_INFO3.Main.main(args);
                    break;    
                case 5:
                    PROYECTO5_INFO3.Main.main(args);
                    break;
                case 6:
                    PROYECTO6_INFO3.Main.main(args);
                    break;
                case 7:
                    PROYECTO7_INFO3.Main.main(args);
                    break;
                case 8:
                    PROYECTO7ejerc4_INFO3.Main.main(args);
                    break;
                case 9:
                    PROYECTO7ejerc5_INFO3.Main.main(args);
                    break;
                case 10:
                    PROYECTO7ejerc6_INFO3.Main.main(args);
                    break;
                case 11:
                    PROYECTO8General_INFO3.Main.main(args);
                    break;
                case 12:
                    PROYECTO8MonticuloBinario_INFO3.Main.main(args);
                    break;
                case 13:
                    PROYECTO8TablaHash_INFO3.Main.main(args);
                    break;         
                case 31:
                    Proyecto1_Reacursividad.Main.main(args);
                    break;         
                case 32:
                    Proyecto2_Ordenamiento.Main.main(args);
                    break;         
                case 33:
                    Proyecto3_PilaYCola.Main.main(args);
                    break;         
                case 34:
                    Proyecto4_PilaYColaConLista.Main.main(args);
                    break;         


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
