
package Proyecto5_ArbolBinario;

import java.util.*;

public class ArbolBinario {
    Node root;

    public ArbolBinario () {
        this.root = null;
    }

    // Método para insertar un valor sin permitir duplicados
    public void insertNoDuplicates(int value) {
        root = insertNoDuplicatesRec(root, value);
    }

    private Node insertNoDuplicatesRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertNoDuplicatesRec(root.left, value);
        } else if (value > root.value) { // Evita duplicados
            root.right = insertNoDuplicatesRec(root.right, value);
        }
        return root;
    }

    // Método para insertar un valor permitiendo duplicados
    public void insertAllowDuplicates(int value) {
        root = insertAllowDuplicatesRec(root, value);
    }

    private Node insertAllowDuplicatesRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value <= root.value) {  // Permite duplicados (<=)
            root.left = insertAllowDuplicatesRec(root.left, value);
        } else {
            root.right = insertAllowDuplicatesRec(root.right, value);
        }
        return root;
    }

    // Método para generar un árbol aleatorio con la opción de permitir o no duplicados
    public void generateRandomTree(int count, boolean allowDuplicates) {
        Random random = new Random();
        while (count > 0) {
            int num = random.nextInt(26); // Generar número entre 0 y 25
            if (allowDuplicates) {
                insertAllowDuplicates(num); // Inserta duplicados
            } else {
                insertNoDuplicates(num); // No inserta duplicados
            }
            count--;
        }
    }

    // Método de recorrido inorder para mostrar el árbol en forma ordenada y regenerarlo ordenado
    public void inorder() {
        List<Integer> sortedValues = new ArrayList<>();
        inorderRec(root, sortedValues);
        // Regenerar el árbol ordenado
        root = rebuildTreeFromSortedValues(sortedValues, 0, sortedValues.size() - 1);
        System.out.println("Árbol regenerado ordenado:");
        printTree(); // Mostrar el árbol ordenado
    }

    private void inorderRec(Node root, List<Integer> sortedValues) {
        if (root != null) {
            inorderRec(root.left, sortedValues); // Recorre el subárbol izquierdo
            sortedValues.add(root.value); // Agrega el valor al arreglo
            inorderRec(root.right, sortedValues); // Recorre el subárbol derecho
        }
    }

    private Node rebuildTreeFromSortedValues(List<Integer> sortedValues, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node node = new Node(sortedValues.get(mid)); // Crear nodo con el valor medio
        node.left = rebuildTreeFromSortedValues(sortedValues, start, mid - 1); // Subárbol izquierdo
        node.right = rebuildTreeFromSortedValues(sortedValues, mid + 1, end); // Subárbol derecho
        return node;
    }

    // Función para imprimir un árbol binario de manera detallada
    public void printTree() {
        printTreeRec(root, 0);
    }

    private void printTreeRec(Node node, int level) {
        if (node != null) {
            // Imprimir el hijo derecho primero
            printTreeRec(node.right, level + 1);

            // Imprimir el nodo actual con indentación
            String indent = " ".repeat(level * 4); // Cada nivel se indentará 4 espacios
            System.out.println(indent + "Nodo: " + node.value);

            // Si tiene hijos, imprimirlos explícitamente
            if (node.left != null || node.right != null) {
                if (node.left != null) {
                    System.out.println(indent + "   Hijo izquierdo: " + node.left.value);
                } else {
                    System.out.println(indent + "   Hijo izquierdo: null");
                }

                if (node.right != null) {
                    System.out.println(indent + "   Hijo derecho: " + node.right.value);
                } else {
                    System.out.println(indent + "   Hijo derecho: null");
                }
            } else {
                System.out.println(indent + "   Hijo izquierdo: null");
                System.out.println(indent + "   Hijo derecho: null");
            }

            // Imprimir el hijo izquierdo
            printTreeRec(node.left, level + 1);
        }
    }

    // Método para calcular la profundidad del árbol
    public int depth() {
        return depthRec(root);
    }

    private int depthRec(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = depthRec(node.left);
        int rightDepth = depthRec(node.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    // Función para eliminar un nodo
    public void dtree(int value) {
        root = deleteRec(root, value); // Llamar a la función recursiva para eliminar el nodo
        if (root != null) {
            inorder(); // Mostrar el árbol ordenado después de la eliminación
        } else {
            System.out.println("El árbol está vacío.");
        }
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) {
            System.out.println("El valor " + value + " no se encuentra en el árbol.");
            return root; // Retorna null si no encuentra el valor
        }

        // Encontrar el nodo a eliminar
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else { // Nodo encontrado
            // Caso 1: No tiene hijos
            if (root.left == null && root.right == null) {
                return null;
            }
            // Caso 2: Solo tiene un hijo
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Caso 3: Tiene dos hijos
            root.value = minValue(root.right); // Conseguir el valor mínimo en el subárbol derecho
            root.right = deleteRec(root.right, root.value); // Eliminar el nodo que tiene el valor mínimo
        }
        return root;
    }

    // Método para encontrar el valor mínimo en un árbol
    private int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    // Clase para los nodos del árbol
    class Node {
        int value;
        Node left;
        Node right;

        // Constructor de la clase Node
        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    // Método principal para interactuar con el usuario
    public static void main(String[] args) {
        ArbolBinario tree = new ArbolBinario();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Llenar el árbol con algunos valores
        tree.insertNoDuplicates(10);
        tree.insertNoDuplicates(5);
        tree.insertNoDuplicates(20);
        tree.insertNoDuplicates(15);
        tree.insertNoDuplicates(30);
        
        System.out.println("Árbol original:");
        tree.printTree();
        
        // Pedir al usuario que ingrese un valor para eliminar
        System.out.print("Ingresa el valor del nodo que deseas eliminar: ");
        int valueToDelete = scanner.nextInt();
        
        // Eliminar el nodo
        tree.dtree(valueToDelete);
    }
}