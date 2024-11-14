
package Proyecto8ejercicio6;

class RedBlackTree {
    private Node root;

    public RedBlackTree() {
        root = null;
    }

    // Método para insertar un nodo en el árbol (modificado para asegurar la raíz negra)
    public void insert(int data) {
        Node newNode = new Node(data);
        root = insertBST(root, newNode);
        fixViolations(newNode);
    }

    // Inserta el nodo en el árbol de búsqueda binaria (BST)
    private Node insertBST(Node root, Node node) {
        if (root == null) {
            return node;
        }

        if (node.data < root.data) {
            root.left = insertBST(root.left, node);
            root.left.parent = root;
        } else if (node.data > root.data) {
            root.right = insertBST(root.right, node);
            root.right.parent = root;
        }

        return root;
    }

    // Método para corregir las violaciones de las propiedades de un árbol rojinegro
    private void fixViolations(Node node) {
        // Aquí deberíamos realizar las rotaciones necesarias y cambio de colores para cumplir
        // con las reglas del árbol rojinegro. Este método debe ser implementado si es necesario.
        
        // Para simplificar, asumimos que la raíz siempre será negra después de la inserción.
        if (root != null) {
            root.color = false; // Aseguramos que la raíz sea negra
        }
    }

    // Método para calcular la mayor altura negra
    public int getMaxBlackHeight() {
        int height = calculateBlackHeight(root);
        if (height == -1) {
            System.out.println("El árbol no cumple con las propiedades de un árbol rojinegro.");
        }
        return height;
    }

    // Método recursivo para calcular la altura negra del árbol
    private int calculateBlackHeight(Node node) {
        if (node == null) {
            return 0; // Un nodo nulo tiene altura negra 0
        }

        // Recursivamente calculamos la altura negra en los subárboles izquierdo y derecho
        int leftBlackHeight = calculateBlackHeight(node.left);
        int rightBlackHeight = calculateBlackHeight(node.right);

        // Si las alturas negras no coinciden o alguno de los subárboles es inconsistente, retornamos -1
        if (leftBlackHeight == -1 || rightBlackHeight == -1 || leftBlackHeight != rightBlackHeight) {
            return -1; // Inconsistencia en las alturas negras
        }

        // Si el nodo es negro, incrementamos la altura negra
        int currentHeight = leftBlackHeight + (node.color ? 0 : 1); // Si el nodo es negro (color == false), sumamos 1
        System.out.println("Nodo: " + node.data + ", Color: " + (node.color ? "Rojo" : "Negro") + ", Altura negra: " + currentHeight);
        return currentHeight;
    }

    // Método para verificar si el árbol cumple con las propiedades de un árbol rojinegro
    public boolean isRedBlackTree() {
        if (root == null) {
            return true; // Un árbol vacío es un árbol rojinegro
        }

        // Propiedad 1: La raíz debe ser negra
        if (root.color) {
            return false; // La raíz debe ser negra
        }

        // Propiedad 2 y 3: Todos los nodos nulos son negros y los nodos rojos no tienen hijos rojos
        if (!verifyRedProperty(root)) {
            return false; // Violación de la propiedad de los nodos rojos
        }

        // Propiedad 4: Cada camino desde un nodo a sus descendientes nulos tiene el mismo número de nodos negros
        int blackHeight = calculateBlackHeight(root);
        return blackHeight != -1; // Si la altura negra es -1, hay una inconsistencia
    }

    // Método para verificar si se cumple la propiedad de los nodos rojos (un nodo rojo no puede tener hijos rojos)
    private boolean verifyRedProperty(Node node) {
        if (node == null) {
            return true;
        }

        // Si el nodo es rojo, sus hijos deben ser negros
        if (node.color) {
            if (node.left != null && node.left.color || node.right != null && node.right.color) {
                return false;
            }
        }

        return verifyRedProperty(node.left) && verifyRedProperty(node.right);
    }
}