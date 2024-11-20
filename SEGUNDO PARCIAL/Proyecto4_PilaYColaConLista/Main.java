package Proyecto4_PilaYColaConLista;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Cola con Lista");
            System.out.println("2. Expresión Matemática");
            System.out.println("3. Ordenamiento de Cola");
            System.out.println("4. Palíndromo con Cola");
            System.out.println("5. Cola de Números");
            System.out.println("6. Pila con Lista");
            System.out.println("7. Pila de Palabras");
            System.out.println("8. Conversión Decimal a Binario");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ColaConLista.main(null);
                    break;
                case 2:
                    ExpresionMatematica.main(null);
                    break;
                case 3:
                    OrdenamientoCola.main(null);
                    break;
                case 4:
                    PalindromoCola.main(null);
                    break;
                case 5:
                    ColaNumeros.main(null);
                    break;
                case 6:
                    PilaConLista.main(null);
                    break;
                case 7:
                    PilaPalabras.main(null);
                    break;
                case 8:
                    DecimalBinario.main(null);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 9);
    }
}
