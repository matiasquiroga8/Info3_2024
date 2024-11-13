package PROYECTO7_INFO3;


public class RedBlackTree {
    private RBNode root;

    // Constructor
    public RedBlackTree() {
        this.root = null;
    }

    // Método para imprimir el árbol con el color de cada nodo y su relación con el padre
    public void printTree() {
        printTreeRec(root, "", true);
    }

    private void printTreeRec(RBNode node, String indent, boolean last) {
        if (node != null) {
            String color = node.isRed ? "Rojo" : "Negro";
            String parentData = node.parent != null ? String.valueOf(node.parent.data) : "null";
            String position = (node.parent == null) ? "Raíz" :
                    (node == node.parent.left ? "Hijo Izquierdo" : "Hijo Derecho");

            System.out.println(indent + "+- " + node.data + " (" + color + "), Padre: " + parentData + " (" + position + ")");
            indent += last ? "   " : "|  ";
            printTreeRec(node.left, indent, false);
            printTreeRec(node.right, indent, true);
        }
    }

    // Método para insertar un nodo en el árbol
    public void insert(int value) {
        System.out.println("\nInsertando nodo: " + value);
        RBNode newNode = new RBNode(value);
        if (root == null) {
            root = newNode;
            root.isRed = false;  // La raíz siempre es negra
        } else {
            insertRec(root, newNode);
        }
        fixInsert(newNode); // Corregir el árbol después de la inserción
    }

    private void insertRec(RBNode root, RBNode newNode) {
        if (newNode.data < root.data) {
            if (root.left == null) {
                root.left = newNode;
                newNode.parent = root;
            } else {
                insertRec(root.left, newNode);
            }
        } else if (newNode.data > root.data) {
            if (root.right == null) {
                root.right = newNode;
                newNode.parent = root;
            } else {
                insertRec(root.right, newNode);
            }
        }
    }

    private void fixInsert(RBNode node) {
        while (node != root && node.parent.isRed) {
            if (node.parent == node.parent.parent.left) {
                RBNode uncle = node.parent.parent.right;
                if (uncle != null && uncle.isRed) {
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) {
                        node = node.parent;
                        rotateLeft(node);
                    }
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    rotateRight(node.parent.parent);
                }
            } else {
                RBNode uncle = node.parent.parent.left;
                if (uncle != null && uncle.isRed) {
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rotateRight(node);
                    }
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    rotateLeft(node.parent.parent);
                }
            }
        }
        root.isRed = false;
    }

    public void delete(int data) {
        RBNode node = findNode(root, data);
        if (node != null) {
            deleteNode(node);
        }
    }

    private RBNode findNode(RBNode node, int data) {
        if (node == null || node.data == data) return node;
        if (data < node.data) return findNode(node.left, data);
        return findNode(node.right, data);
    }

    private void deleteNode(RBNode node) {
        // Implementación completa del método de eliminación en árbol rojinegro
        // Para la demostración, se puede simplificar o mejorar según el caso
        // Este método debe incluir pasos para balancear el árbol tras eliminación
    }

    public boolean isRedBlackTreeValid() {
        if (root == null) {
            return true;  // Un árbol vacío es válido
        }

        if (root.isRed) {
            System.out.println("La raíz no es negra.");
            return false;
        }

        return checkBlackHeight(root) != -1 && checkRedProperty(root);
    }

    private boolean checkRedProperty(RBNode node) {
        if (node == null) return true;

        if (node.isRed) {
            if ((node.left != null && node.left.isRed) || (node.right != null && node.right.isRed)) {
                System.out.println("Violación de la propiedad de nodo rojo en el nodo: " + node.data);
                return false;
            }
        }

        return checkRedProperty(node.left) && checkRedProperty(node.right);
    }

    private int checkBlackHeight(RBNode node) {
        if (node == null) return 1;

        int leftBlackHeight = checkBlackHeight(node.left);
        int rightBlackHeight = checkBlackHeight(node.right);

        if (leftBlackHeight == -1 || rightBlackHeight == -1 || leftBlackHeight != rightBlackHeight) {
            System.out.println("Violación de la propiedad de altura negra en el nodo: " + node.data);
            return -1;
        }

        return node.isRed ? leftBlackHeight : leftBlackHeight + 1;
    }

    private void rotateLeft(RBNode node) {
        System.out.println("\nRotación a la izquierda en el nodo: " + node.data);
        printTree();
        RBNode temp = node.right;
        node.right = temp.left;
        if (temp.left != null) temp.left.parent = node;
        temp.parent = node.parent;
        if (node.parent == null) root = temp;
        else if (node == node.parent.left) node.parent.left = temp;
        else node.parent.right = temp;
        temp.left = node;
        node.parent = temp;
        System.out.println("Árbol después de la rotación a la izquierda:");
        printTree();
    }

    private void rotateRight(RBNode node) {
        System.out.println("\nRotación a la derecha en el nodo: " + node.data);
        printTree();
        RBNode temp = node.left;
        node.left = temp.right;
        if (temp.right != null) temp.right.parent = node;
        temp.parent = node.parent;
        if (node.parent == null) root = temp;
        else if (node == node.parent.right) node.parent.right = temp;
        else node.parent.left = temp;
        temp.right = node;
        node.parent = temp;
        System.out.println("Árbol después de la rotación a la derecha:");
        printTree();
    }
}
