package PROYECTO7ejerc6_INFO3;

class Node {
    int data; // Valor del nodo
    Node left, right, parent; // Punteros a los nodos hijo izquierdo, derecho y al padre
    boolean color; // El color del nodo: true para rojo, false para negro

    // Constructor del nodo, establece el color por defecto como rojo
    public Node(int data) {
        this.data = data;
        this.left = this.right = this.parent = null;
        this.color = true; // Rojo por defecto
    }
}
