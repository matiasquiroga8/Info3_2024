package Proyecto7_ArbolBinarioAVL;

class RBNode {

    int data;
    boolean isRed;
    RBNode left, right, parent;

    public RBNode(int data) {
        this.data = data;
        this.isRed = true; // Nuevos nodos siempre son rojos
        this.left = this.right = this.parent = null;
    }
}
