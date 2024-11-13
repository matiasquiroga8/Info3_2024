package PROYECTO7ejerc6_INFO3;

public class Main {
    public static void main(String[] args) {
        RedBlackTree rbTree = new RedBlackTree();
        
        // Insertar nodos en el árbol
        rbTree.insert(10);
        rbTree.insert(20);
        rbTree.insert(30);
        rbTree.insert(15);
        rbTree.insert(5);

        // Imprimir la mayor altura negra del árbol
        int maxBlackHeight = rbTree.getMaxBlackHeight();
        if (maxBlackHeight != -1) {
            System.out.println("La mayor altura negra del árbol es: " + maxBlackHeight);
        } else {
            System.out.println("El árbol no cumple con las propiedades de un árbol rojinegro.");
        }
    }
}
