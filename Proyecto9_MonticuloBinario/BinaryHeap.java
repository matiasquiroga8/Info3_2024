
package Proyecto9_MonticuloBinario;

public class BinaryHeap {
    private Node root;
    private int size;

    // Constructor para inicializar el montículo
    public BinaryHeap() {
        root = null;
        size = 0;
    }

    // Insertar un nuevo valor en el montículo
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
        size++;
        heapifyUp(root);  // Asegura que el heap cumpla con la propiedad después de la inserción
    }

    // Método auxiliar para insertar un valor en el árbol
    private void insert(Node current, int value) {
        if (current.leftChild == null) {
            current.leftChild = new Node(value);
        } else if (current.rightChild == null) {
            current.rightChild = new Node(value);
        } else {
            insert(current.leftChild, value);  // Insertar en el subárbol izquierdo si está vacío
        }
    }

    // Método para reorganizar el árbol (mantener la propiedad de heap) después de la inserción
    private void heapifyUp(Node node) {
        if (node == null || node.leftChild == null) {
            return;
        }
        if (node.leftChild.value > node.value) {
            swap(node, node.leftChild);
            heapifyUp(node.leftChild); // Recursivamente ajustamos hacia arriba
        }
        if (node.rightChild != null && node.rightChild.value > node.value) {
            swap(node, node.rightChild);
            heapifyUp(node.rightChild); // Recursivamente ajustamos hacia arriba
        }
    }

    // Método para intercambiar los valores de dos nodos
    private void swap(Node a, Node b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    // Método para imprimir la estructura del árbol
    public void printHeap() {
        if (root == null) {
            System.out.println("Heap is empty");
            return;
        }
        System.out.println("Heap structure (Parent -> Left Child, Right Child):");
        printHeap(root, 0);
    }

    // Método recursivo para imprimir la estructura del árbol
    private void printHeap(Node node, int level) {
        if (node != null) {
            String indent = " ".repeat(level * 4);
            System.out.println(indent + "Node " + node.value);
            if (node.leftChild != null || node.rightChild != null) {
                if (node.leftChild != null) {
                    System.out.println(indent + "  Left Child: " + node.leftChild.value);
                }
                if (node.rightChild != null) {
                    System.out.println(indent + "  Right Child: " + node.rightChild.value);
                }
            }
            printHeap(node.leftChild, level + 1);
            printHeap(node.rightChild, level + 1);
        }
    }

    // Método principal para extraer el máximo valor (raíz)
    public int extractMax() {
        if (root == null) {
            System.out.println("Heap is empty");
            return Integer.MIN_VALUE;
        }

        int maxValue = root.value;
        if (root.leftChild == null && root.rightChild == null) {
            root = null;
        } else {
            // Intercambiamos el valor de la raíz con el valor del último nodo
            Node lastNode = getLastNode();
            root.value = lastNode.value;
            deleteLastNode();
        }

        // Reorganizamos el árbol después de la extracción
        heapifyDown(root);
        return maxValue;
    }

    // Método para mantener la propiedad del heap (mueve hacia abajo)
    private void heapifyDown(Node node) {
        if (node == null) {
            return;
        }

        Node largest = node;
        if (node.leftChild != null && node.leftChild.value > largest.value) {
            largest = node.leftChild;
        }
        if (node.rightChild != null && node.rightChild.value > largest.value) {
            largest = node.rightChild;
        }

        if (largest != node) {
            swap(node, largest);
            heapifyDown(largest);
        }
    }

    // Método para obtener el último nodo (el nodo más profundo)
    private Node getLastNode() {
        return getLastNode(root);
    }

    // Método auxiliar para obtener el último nodo (el nodo más profundo)
    private Node getLastNode(Node node) {
        if (node == null) {
            return null;
        }
        if (node.rightChild != null) {
            return getLastNode(node.rightChild);
        }
        if (node.leftChild != null) {
            return node.leftChild;
        }
        return node;
    }

    // Método para eliminar el último nodo
    private void deleteLastNode() {
        deleteLastNode(root);
    }

    // Método recursivo para eliminar el último nodo
    private void deleteLastNode(Node node) {
        if (node == null) {
            return;
        }
        if (node.leftChild != null) {
            deleteLastNode(node.leftChild);
        }
        if (node.rightChild != null) {
            deleteLastNode(node.rightChild);
        }
    }

    // Obtener el tamaño del montículo
    public int getSize() {
        return size;
    }
}
