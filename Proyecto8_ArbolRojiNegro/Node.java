package Proyecto8_ArbolRojiNegro;

enum Color {
    RED, BLACK;
}

class Node {

    int data;
    Color color;
    Node left, right, parent;

    public Node(int data) {
        this.data = data;
        this.color = Color.RED;
        this.left = this.right = this.parent = null;
    }
}
