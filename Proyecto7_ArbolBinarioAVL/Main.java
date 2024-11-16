
package Proyecto7_ArbolBinarioAVL;

public class Main {
    public static void main(String[] args) {
        RojiNegro tree = new RojiNegro();

        // Inserción de nodos
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);

        System.out.println("Árbol antes de eliminar 30:");
        tree.printTree();

        // Eliminar nodo con valor 30
        tree.delete(30);

        System.out.println("\nÁrbol después de eliminar 30:");
        tree.printTree();

        // Verificar si el árbol sigue siendo Rojinegro
        if (tree.isRedBlackTreeValid()) {
            System.out.println("\nEl árbol sigue siendo un árbol Rojinegro.");
        } else {
            System.out.println("\nEl árbol NO es un árbol Rojinegro.");
        }
    }
}