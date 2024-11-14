
package Proyecto9_TablaHash;

public class Main {
    public static void main(String[] args) {
        // Crear una tabla hash
        HashTable hashTable = new HashTable();

        // Insertar algunos elementos
        hashTable.insert(1, "Apple");
        hashTable.insert(2, "Banana");
        hashTable.insert(12, "Orange"); // Colisión con la clave 2 (12 % 10 == 2)
        hashTable.insert(3, "Grape");

        // Imprimir la tabla hash
        System.out.println("Tabla hash después de inserciones:");
        hashTable.printTable();

        // Buscar un elemento
        System.out.println("\nBuscar clave 2: " + hashTable.search(2));
        System.out.println("Buscar clave 12: " + hashTable.search(12));

        // Eliminar un elemento
        System.out.println("\nEliminar clave 2: " + hashTable.delete(2));

        // Imprimir la tabla hash después de la eliminación
        System.out.println("\nTabla hash después de la eliminación de la clave 2:");
        hashTable.printTable();
    }
}
