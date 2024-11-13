package PROYECTO7ejerc5_INFO3;

class RedBlackTree {
    private Node root;

    public RedBlackTree() {
        root = null; // Inicia el árbol con un nodo raíz null
    }

    // Verifica si el árbol cumple con todas las propiedades de un árbol rojinegro
    public boolean isRedBlackTree() {
        if (root == null) {
            return true; // Un árbol vacío es un árbol rojinegro
        }

        // Propiedad 1: La raíz debe ser negra
        if (root.color) {
            System.out.println("La raíz debe ser negra.");
            return false;
        }

        // Propiedad 2 y 3: Todos los nodos nulos son negros y los nodos rojos no tienen hijos rojos
        if (!verifyRedProperty(root)) {
            System.out.println("Propiedad de nodo rojo violada.");
            return false;
        }

        // Propiedad 4: Cada camino desde un nodo a sus descendientes nulos tiene el mismo número de nodos negros
        int blackHeight = calculateBlackHeight(root);
        if (blackHeight == -1) {
            System.out.println("Propiedad de altura negra violada.");
            return false;
        }

        return true;
    }

    private boolean verifyRedProperty(Node node) {
        if (node == null) {
            return true; // Los nodos nulos son negros, cumplen con la propiedad
        }

        // Si un nodo es rojo, sus hijos deben ser negros
        if (node.color) {
            if (node.left != null && node.left.color || node.right != null && node.right.color) {
                return false;
            }
        }

        return verifyRedProperty(node.left) && verifyRedProperty(node.right);
    }

    private int calculateBlackHeight(Node node) {
        if (node == null) {
            return 0; // Los nodos nulos no cuentan, su altura negra es 0
        }

        int leftBlackHeight = calculateBlackHeight(node.left);
        int rightBlackHeight = calculateBlackHeight(node.right);

        if (leftBlackHeight == -1 || rightBlackHeight == -1 || leftBlackHeight != rightBlackHeight) {
            return -1; // La altura negra es inconsistente
        }

        // Si el nodo es negro, incrementamos la altura negra
        return leftBlackHeight + (node.color ? 0 : 1);
    }

    // Métodos de prueba: Insertar nodos para verificar el árbol
    public void insert(int data) {
        Node newNode = new Node(data);
        root = insertBST(root, newNode);
        fixViolations(newNode);
    }

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

    private void fixViolations(Node node) {
        // Correcciones de color y balanceo, omitiendo aquí el código específico
        // de balanceo para simplificar el enfoque en verificación de propiedades.
    }
}
