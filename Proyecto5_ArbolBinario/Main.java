
package Proyecto5_ArbolBinario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Árbol que NO permite duplicados
        ArbolBinario treeNoDuplicates = new ArbolBinario();           
        System.out.println("Generando árbol binario SIN duplicados:");
        treeNoDuplicates.generateRandomTree(10, false);  // false para NO duplicados
        
        System.out.println("Árbol binario generado (sin duplicados):");
        treeNoDuplicates.printTree();

        System.out.println("Recorrido Inorder (sin duplicados):");
        treeNoDuplicates.inorder();
        System.out.println();

        int depthNoDuplicates = treeNoDuplicates.depth();
        System.out.println("Profundidad del árbol (sin duplicados): " + depthNoDuplicates);

        // Pedir al usuario que ingrese el valor del nodo a eliminar
        System.out.print("Ingresa el valor del nodo que deseas eliminar (sin duplicados): ");
        int valueToDeleteNoDuplicates = scanner.nextInt();
        
        // Eliminar el nodo en el árbol sin duplicados
        System.out.println("Borrando el valor: " + valueToDeleteNoDuplicates + " (sin duplicados)");
        treeNoDuplicates.dtree(valueToDeleteNoDuplicates);
        System.out.println("Árbol después de la eliminación (sin duplicados):");
        treeNoDuplicates.printTree();
        
        System.out.println("Recorrido Inorder después de la eliminación (sin duplicados):");
        treeNoDuplicates.inorder();
        System.out.println("\n------------------------------------\n");

        // Árbol que permite duplicados
        ArbolBinario treeWithDuplicates = new ArbolBinario();
        System.out.println("Generando árbol binario CON duplicados:");
        treeWithDuplicates.generateRandomTree(10, true);  // true para PERMITIR duplicados
        
        System.out.println("Árbol binario generado (con duplicados):");
        treeWithDuplicates.printTree();

        System.out.println("Recorrido Inorder (con duplicados):");
        treeWithDuplicates.inorder();
        System.out.println();

        int depthWithDuplicates = treeWithDuplicates.depth();
        System.out.println("Profundidad del árbol (con duplicados): " + depthWithDuplicates);

        // Pedir al usuario que ingrese el valor del nodo a eliminar (con duplicados)
        System.out.print("Ingresa el valor del nodo que deseas eliminar (con duplicados): ");
        int valueToDeleteWithDuplicates = scanner.nextInt();
        
        // Eliminar el nodo en el árbol con duplicados
        System.out.println("Borrando el valor: " + valueToDeleteWithDuplicates + " (con duplicados)");
        treeWithDuplicates.dtree(valueToDeleteWithDuplicates);

        System.out.println("Recorrido Inorder después de la eliminación (con duplicados):");
        treeWithDuplicates.inorder();

        scanner.close();
    }
}