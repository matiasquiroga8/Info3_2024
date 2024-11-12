package PROYECTO7ejerc5_INFO3;

class Node {
    int data; // Valor almacenado en el nodo
    Node left, right, parent; // Punteros a los nodos hijo izquierdo, derecho y al padre
    boolean color; // El color del nodo: true para rojo, false para negro

    // Constructor para un nodo, inicializa el valor de datos y establece el color en rojo por defecto
    public Node(int data) {
        this.data = data;
        this.left = this.right = this.parent = null;
        this.color = true; // El color por defecto es rojo
    }
}
