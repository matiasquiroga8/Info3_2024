package Proyecto8ejercicio5;

public class Main {

    public static void main(String[] args) {
        ArbolRojiNegro rbTree = new ArbolRojiNegro();

        // Inserta nodos para construir un árbol rojinegro
        rbTree.insert(10);
        rbTree.insert(20);
        rbTree.insert(30);
        rbTree.insert(15);

        // Verifica si el árbol cumple con todas las propiedades rojinegras
        if (rbTree.isRedBlackTree()) {
            System.out.println("El árbol cumple con todas las propiedades de un árbol rojinegro.");
        } else {
            System.out.println("El árbol no cumple con las propiedades de un árbol rojinegro.");
        }
    }
}
