
package Proyecto9_TablaHash;

import java.util.LinkedList;

class HashTable {
    // Definimos el tamaño de la tabla hash
    private static final int SIZE = 10;
    
    // Usamos un array de listas enlazadas para cada posición
    private LinkedList<Entry>[] table;

    // Constructor
    @SuppressWarnings("unchecked")
    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Método para calcular el hash (índice en la tabla)
    private int hash(int key) {
        return key % SIZE;
    }

    // Método de inserción
    public void insert(int key, String value) {
        int index = hash(key);
        Entry newEntry = new Entry(key, value);
        
        // Recorremos la lista en el índice correspondiente
        for (Entry entry : table[index]) {
            if (entry.getKey() == key) {
                entry.setValue(value); // Si la clave ya existe, actualizamos el valor
                return;
            }
        }

        // Si no encontramos la clave, insertamos la nueva entrada
        table[index].add(newEntry);
    }

    // Método de búsqueda
    public String search(int key) {
        int index = hash(key);
        
        // Buscamos en la lista correspondiente
        for (Entry entry : table[index]) {
            if (entry.getKey() == key) {
                return entry.getValue(); // Si encontramos la clave, devolvemos el valor
            }
        }

        return null; // Si no encontramos la clave
    }

    // Método de eliminación
    public boolean delete(int key) {
        int index = hash(key);
        
        // Recorremos la lista en el índice correspondiente
        for (Entry entry : table[index]) {
            if (entry.getKey() == key) {
                table[index].remove(entry); // Eliminamos la entrada
                return true;
            }
        }
        
        return false; // Si no encontramos la clave
    }

    // Método para imprimir la tabla hash (para ver su contenido)
    public void printTable() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Index " + i + ": ");
            for (Entry entry : table[i]) {
                System.out.print("[" + entry.getKey() + " => " + entry.getValue() + "] ");
            }
            System.out.println();
        }
    }
}
