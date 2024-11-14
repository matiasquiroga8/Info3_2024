
package Proyecto8ejercicio4;

public class Main {
    public static void main(String[] args) {
        ArbolRojinegro arbol = new ArbolRojinegro();

        // Inserción de nodos
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(50);

        System.out.println("Árbol original:");
        arbol.imprimirArbol(arbol.getRaiz(), "", true);

        // Realizar una rotación a la izquierda
        arbol.insertar(60); // Esto causará un rebalanceo con rotación
        System.out.println("\nDespués de la rotación izquierda:");
        arbol.imprimirArbol(arbol.getRaiz(), "", true);

        // Realizar una rotación a la derecha
        arbol.insertar(25); // Esto causará una rotación en el lado derecho
        System.out.println("\nDespués de la rotación derecha:");
        arbol.imprimirArbol(arbol.getRaiz(), "", true);
    }
}