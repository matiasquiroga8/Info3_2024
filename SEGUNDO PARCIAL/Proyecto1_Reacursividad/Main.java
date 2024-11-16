package Proyecto1_Recursividad;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("\n¿A cual de los 7 ejercicios desea ir?(0 para salir): ");
            opcion = consola.nextInt();
            consola.nextLine();
            switch (opcion) {
                case 0 -> System.out.println("Adios!");
                case 1 -> Ejercicio1.main(args);
                case 2 -> Ejercicio2.main(args);
                case 3 -> Ejercicio3.main(args);
                case 4 -> Ejercicio4.main(args);
                case 5 -> Ejercicio5.main(args);
                case 6 -> Ejercicio6.main(args);
                case 7 -> Ejercicio7.main(args);
                default -> System.out.println("Opcion no valida!");
            }
        } while (opcion != 0);
    }
}
