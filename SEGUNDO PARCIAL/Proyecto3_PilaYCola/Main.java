package Proyecto3_PilaYCola;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cola");
            System.out.println("2. Expresión Matemática");
            System.out.println("3. Ordenar Cola");
            System.out.println("4. Palíndromo");
            System.out.println("5. Pila");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1 -> // Llamar al main de la clase Cola
                    Cola.main(null);
                case 2 -> // Llamar al main de la clase Expresión Matemática
                    ExpresionMatematica.main(null);
                case 3 -> // Llamar al main de la clase OrdenarCola
                    OrdenarCola.main(null);
                case 4 -> // Llamar al main de la clase Palíndromo
                    Palindromo.main(null);
                case 5 -> // Llamar al main de la clase Pila
                    Pila.main(null);
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        consola.close();
    }
}
