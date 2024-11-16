
package Proyecto8_ArbolRojiNegro;

class RedBlackTree {
    private Node root;

    // Método para la visualización del árbol y su color en cada hoja
    public void printTree(Node node, String indent, boolean last) {
        if (node != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "   ";
            } else {
                System.out.print("L----");
                indent += "|  ";
            }
            String color = node.color == Color.RED ? "RED" : "BLACK";
            System.out.println(node.data + "(" + color + ")");
            printTree(node.left, indent, false);
            printTree(node.right, indent, true);
        }
    }

    public void printTree() {
        printTree(this.root, "", true);
    }

    // Método de rotación izquierda
    private void leftRotate(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        if (temp.left != null) temp.left.parent = node;
        temp.parent = node.parent;
        if (node.parent == null) root = temp;
        else if (node == node.parent.left) node.parent.left = temp;
        else node.parent.right = temp;
        temp.left = node;
        node.parent = temp;
    }

    // Método de rotación derecha
    private void rightRotate(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        if (temp.right != null) temp.right.parent = node;
        temp.parent = node.parent;
        if (node.parent == null) root = temp;
        else if (node == node.parent.right) node.parent.right = temp;
        else node.parent.left = temp;
        temp.right = node;
        node.parent = temp;
    }

    // Método de inserción en el árbol
    public void insert(int data) {
        Node node = new Node(data);
        root = insertBST(root, node);
        fixInsert(node);
    }

    private Node insertBST(Node root, Node node) {
        if (root == null) return node;
        if (node.data < root.data) {
            root.left = insertBST(root.left, node);
            root.left.parent = root;
        } else if (node.data > root.data) {
            root.right = insertBST(root.right, node);
            root.right.parent = root;
        }
        return root;
    }

    private void fixInsert(Node node) {
        Node parent = null;
        Node grandparent = null;
        while (node != root && node.color != Color.BLACK && node.parent.color == Color.RED) {
            parent = node.parent;
            grandparent = parent.parent;
            if (parent == grandparent.left) {
                Node uncle = grandparent.right;
                if (uncle != null && uncle.color == Color.RED) {
                    grandparent.color = Color.RED;
                    parent.color = Color.BLACK;
                    uncle.color = Color.BLACK;
                    node = grandparent;
                } else {
                    if (node == parent.right) {
                        leftRotate(parent);
                        node = parent;
                        parent = node.parent;
                    }
                    rightRotate(grandparent);
                    Color tempColor = parent.color;
                    parent.color = grandparent.color;
                    grandparent.color = tempColor;
                    node = parent;
                }
            } else {
                Node uncle = grandparent.left;
                if (uncle != null && uncle.color == Color.RED) {
                    grandparent.color = Color.RED;
                    parent.color = Color.BLACK;
                    uncle.color = Color.BLACK;
                    node = grandparent;
                } else {
                    if (node == parent.left) {
                        rightRotate(parent);
                        node = parent;
                        parent = node.parent;
                    }
                    leftRotate(grandparent);
                    Color tempColor = parent.color;
                    parent.color = grandparent.color;
                    grandparent.color = tempColor;
                    node = parent;
                }
            }
        }
        root.color = Color.BLACK;
    }
}
