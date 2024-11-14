package Proyecto9General;

import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear las colecciones
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Menú principal
        while (true) {
            System.out.println("\n-- Menú Principal --");
            System.out.println("1. ArrayList");
            System.out.println("2. LinkedList");
            System.out.println("3. HashMap");
            System.out.println("4. TreeMap");
            System.out.println("5. LinkedHashMap");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    arrayListMenu(arrayList);
                    break;
                case 2:
                    linkedListMenu(linkedList);
                    break;
                case 3:
                    hashMapMenu(hashMap);
                    break;
                case 4:
                    treeMapMenu(treeMap);
                    break;
                case 5:
                    linkedHashMapMenu(linkedHashMap);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Menú para ArrayList
    private static void arrayListMenu(ArrayList<String> arrayList) {
        while (true) {
            System.out.println("\n-- Menú ArrayList --");
            System.out.println("1. Agregar un objeto");
            System.out.println("2. Imprimir ArrayList");
            System.out.println("3. Imprimir un elemento");
            System.out.println("4. Borrar un elemento");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el objeto: ");
                    String objeto = sc.nextLine();
                    arrayList.add(objeto);
                    break;
                case 2:
                    System.out.println("ArrayList: " + arrayList);
                    break;
                case 3:
                    System.out.print("Introduce el índice del elemento a imprimir: ");
                    int index = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (index >= 0 && index < arrayList.size()) {
                        System.out.println("Elemento en el índice " + index + ": " + arrayList.get(index));
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 4:
                    System.out.print("Introduce el índice del elemento a borrar: ");
                    int removeIndex = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (removeIndex >= 0 && removeIndex < arrayList.size()) {
                        arrayList.remove(removeIndex);
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Menú para LinkedList
    private static void linkedListMenu(LinkedList<String> linkedList) {
        while (true) {
            System.out.println("\n-- Menú LinkedList --");
            System.out.println("1. Agregar un objeto");
            System.out.println("2. Imprimir LinkedList");
            System.out.println("3. Imprimir un elemento");
            System.out.println("4. Borrar un elemento");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el objeto: ");
                    String objeto = sc.nextLine();
                    linkedList.add(objeto);
                    break;
                case 2:
                    System.out.println("LinkedList: " + linkedList);
                    break;
                case 3:
                    System.out.print("Introduce el índice del elemento a imprimir: ");
                    int index = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (index >= 0 && index < linkedList.size()) {
                        System.out.println("Elemento en el índice " + index + ": " + linkedList.get(index));
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 4:
                    System.out.print("Introduce el índice del elemento a borrar: ");
                    int removeIndex = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (removeIndex >= 0 && removeIndex < linkedList.size()) {
                        linkedList.remove(removeIndex);
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Menú para HashMap
    private static void hashMapMenu(Map<Integer, String> hashMap) {
        while (true) {
            System.out.println("\n-- Menú HashMap --");
            System.out.println("1. Agregar un objeto");
            System.out.println("2. Imprimir HashMap");
            System.out.println("3. Imprimir un elemento");
            System.out.println("4. Borrar un elemento");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la clave: ");
                    int key = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Introduce el valor: ");
                    String value = sc.nextLine();
                    hashMap.put(key, value);
                    break;
                case 2:
                    System.out.println("HashMap: " + hashMap);
                    break;
                case 3:
                    System.out.print("Introduce la clave del elemento a imprimir: ");
                    int keyToPrint = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (hashMap.containsKey(keyToPrint)) {
                        System.out.println("Elemento con clave " + keyToPrint + ": " + hashMap.get(keyToPrint));
                    } else {
                        System.out.println("Clave no encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Introduce la clave del elemento a borrar: ");
                    int keyToRemove = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (hashMap.containsKey(keyToRemove)) {
                        hashMap.remove(keyToRemove);
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Clave no encontrada.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Menú para TreeMap
    private static void treeMapMenu(Map<Integer, String> treeMap) {
        while (true) {
            System.out.println("\n-- Menú TreeMap --");
            System.out.println("1. Agregar un objeto");
            System.out.println("2. Imprimir TreeMap");
            System.out.println("3. Imprimir un elemento");
            System.out.println("4. Borrar un elemento");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la clave: ");
                    int key = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Introduce el valor: ");
                    String value = sc.nextLine();
                    treeMap.put(key, value);
                    break;
                case 2:
                    System.out.println("TreeMap: " + treeMap);
                    break;
                case 3:
                    System.out.print("Introduce la clave del elemento a imprimir: ");
                    int keyToPrint = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (treeMap.containsKey(keyToPrint)) {
                        System.out.println("Elemento con clave " + keyToPrint + ": " + treeMap.get(keyToPrint));
                    } else {
                        System.out.println("Clave no encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Introduce la clave del elemento a borrar: ");
                    int keyToRemove = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (treeMap.containsKey(keyToRemove)) {
                        treeMap.remove(keyToRemove);
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Clave no encontrada.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Menú para LinkedHashMap
    private static void linkedHashMapMenu(Map<Integer, String> linkedHashMap) {
        while (true) {
            System.out.println("\n-- Menú LinkedHashMap --");
            System.out.println("1. Agregar un objeto");
            System.out.println("2. Imprimir LinkedHashMap");
            System.out.println("3. Imprimir un elemento");
            System.out.println("4. Borrar un elemento");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la clave: ");
                    int key = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Introduce el valor: ");
                    String value = sc.nextLine();
                    linkedHashMap.put(key, value);
                    break;
                case 2:
                    System.out.println("LinkedHashMap: " + linkedHashMap);
                    break;
                case 3:
                    System.out.print("Introduce la clave del elemento a imprimir: ");
                    int keyToPrint = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (linkedHashMap.containsKey(keyToPrint)) {
                        System.out.println("Elemento con clave " + keyToPrint + ": " + linkedHashMap.get(keyToPrint));
                    } else {
                        System.out.println("Clave no encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Introduce la clave del elemento a borrar: ");
                    int keyToRemove = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if (linkedHashMap.containsKey(keyToRemove)) {
                        linkedHashMap.remove(keyToRemove);
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Clave no encontrada.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
