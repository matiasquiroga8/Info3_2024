package PROYECTO6_INFO3;

public class Main {

    public static void main(String[] args) {
        ArbolAVL tree = new ArbolAVL();

        // 2. Generar un árbol binario AVL con la secuencia: 10, 100, 20, 80, 40, 70
        System.out.println("Generando árbol binario AVL con la secuencia: 10, 100, 20, 80, 40, 70");
        int[] values = {10, 100, 20, 80, 40, 70};
        for (int value : values) {
            tree.insert(value);
        }
        tree.printTree();

        // 3. Generar un árbol binario AVL con la secuencia ordenada: 5, 10, 20, 30, 40, 50, 60
        System.out.println("\nGenerando árbol binario AVL con la secuencia ordenada: 5, 10, 20, 30, 40, 50, 60");
        int[] orderedValues = {5, 10, 20, 30, 40, 50, 60};
        for (int value : orderedValues) {
            tree.insert(value);
        }
        tree.printTree();

         // 1. Crear el árbol AVL con la estructura inicial dada
         System.out.println("Generando árbol AVL inicial con la secuencia: 4, 2, 1, 30, 10, 5, 20, 50, 40, 60");
         int[] initialValues = {4, 2, 1, 30, 10, 5, 20, 50, 40, 60};
         for (int value : initialValues) {
             tree.insert(value);
         }
         System.out.println("Árbol AVL inicial:");
         tree.printTree();

          // 3. Eliminar el nodo con valor 1 y volver a imprimir el árbol
        System.out.println("\nEliminando el nodo con valor 1");
        tree.delete(1);
        System.out.println("Árbol AVL después de eliminar el nodo 1:");
        tree.printTree();

        // 4. Eliminar el nodo con valor 30 y volver a imprimir el árbol
        System.out.println("\nEliminando el nodo con valor 30");
        tree.delete(30);
        System.out.println("Árbol AVL después de eliminar el nodo 30:");
        tree.printTree();
    }
}
