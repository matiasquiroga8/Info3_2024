
package Proyecto6_ArbolBinario2;

class ArbolAVL {

    // Nodo del árbol AVL
    class Node {
        int data;
        Node left, right;
        int height;
        Node parent;  // Referencia al nodo padre

        public Node(int item) {
            data = item;
            left = right = null;
            height = 1;  // La altura de un nodo hoja es 1
            parent = null;  // Inicialmente no tiene padre
        }
    }

    Node root;

    // Constructor
    public ArbolAVL() {
        root = null;
    }

    // Método para insertar un nodo en el árbol AVL
    public void insert(int data) {
        root = insertRec(root, data, null);
    }

    private Node insertRec(Node node, int data, Node parent) {
        // Paso 1: Realizar la inserción estándar de un árbol binario de búsqueda
        if (node == null) {
            Node newNode = new Node(data);
            newNode.parent = parent; // Establecemos el nodo padre
            return newNode;
        }

        if (data < node.data) {
            node.left = insertRec(node.left, data, node);
        } else if (data > node.data) {
            node.right = insertRec(node.right, data, node);
        } else {
            return node; // No se permiten duplicados
        }

        // Paso 2: Actualizar la altura del nodo
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Paso 3: Obtener el factor de balance (balance factor)
        int balance = getBalance(node);

        // Paso 4: Rotaciones para balancear el árbol
        // Rotación simple a la derecha
        if (balance > 1 && data < node.left.data) {
            return rightRotate(node);
        }

        // Rotación simple a la izquierda
        if (balance < -1 && data > node.right.data) {
            return leftRotate(node);
        }

        // Rotación doble a la derecha
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Rotación doble a la izquierda
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Método para calcular la altura de un nodo
    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // Método para obtener el factor de balance de un nodo
    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    // Rotación simple a la derecha
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Realizar la rotación
        x.right = y;
        y.left = T2;

        // Actualizar alturas
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Actualizar los padres
        if (T2 != null) T2.parent = y;
        x.parent = y.parent;
        y.parent = x;

        // Retornar la nueva raíz
        return x;
    }

    // Rotación simple a la izquierda
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Realizar la rotación
        y.left = x;
        x.right = T2;

        // Actualizar alturas
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Actualizar los padres
        if (T2 != null) T2.parent = x;
        y.parent = x.parent;
        x.parent = y;

        // Retornar la nueva raíz
        return y;
    }

    // Método para imprimir el árbol mostrando la relación padre-hijo
    public void printTree() {
        printTreeRec(root, "", true);
    }

    private void printTreeRec(Node node, String indent, boolean last) {
        if (node != null) {
            String parentInfo = (node.parent != null) ? 
                (node == node.parent.left ? "Hijo Izquierdo de " : "Hijo Derecho de ") + node.parent.data : "Raíz";
            System.out.println(indent + "+- " + node.data + " (" + parentInfo + ")");
            indent += last ? "   " : "|  ";

            printTreeRec(node.left, indent, false);
            printTreeRec(node.right, indent, true);
        }
    }
    
    // Método para eliminar un nodo del árbol AVL
    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }

        // Realizar la eliminación estándar de un árbol binario de búsqueda
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // Nodo a eliminar encontrado
            if (root.left == null || root.right == null) {
                Node temp = null;
                if (root.left == null) {
                    temp = root.right;
                } else {
                    temp = root.left;
                }

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                    root.parent = root.parent;  // Actualizar el padre
                }
            } else {
                Node temp = minValueNode(root.right);
                root.data = temp.data;
                root.right = deleteRec(root.right, temp.data);
            }
        }

        if (root == null) {
            return root;
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
}