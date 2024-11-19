
package Proyecto3_PilaYCola;

public class Pila {
    private int maxSize;   // Capacidad máxima de la pila
    private Object[] stackArray; // Arreglo que almacena los elementos de la pila
    private int top;       // Índice del elemento en la cima

    // Constructor para inicializar la pila con un tamaño máximo
    public Pila(int size) {
        this.maxSize = size;
        this.stackArray = new Object[size];
        this.top = -1; // Indica que la pila está vacía
    }

    // Método para agregar un elemento (push)
    public void push(Object element) {
        if (isFull()) {
            throw new StackOverflowError("La pila está llena");
        }
        stackArray[++top] = element;
    }

    // Método para eliminar y retornar el elemento en la cima (pop)
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return stackArray[top--];
    }

    // Método para ver el elemento en la cima sin eliminarlo (top)
    public Object top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return stackArray[top];
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == -1;
    }

    // Método para verificar si la pila está llena
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Método para imprimir el contenido de la pila
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.print("Contenido de la pila: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    // Programa principal para probar la pila
    public static void main(String[] args) {
        // Crear una pila con capacidad para 5 elementos
        Pila stack = new Pila(5);

        // Agregar elementos a la pila
        System.out.println("Apilando elementos...");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack();

        // Ver el elemento en la cima
        System.out.println("Elemento en la cima: " + stack.top());

        // Eliminar un elemento
        System.out.println("Desapilando elemento: " + stack.pop());
        stack.displayStack();

        // Agregar más elementos
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.displayStack();

        // Intentar agregar un elemento adicional (desbordar la pila)
        try {
            stack.push(70);
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }

        // Vaciar la pila
        while (!stack.isEmpty()) {
            System.out.println("Desapilando elemento: " + stack.pop());
        }

        // Intentar ver la cima de una pila vacía
        try {
            stack.top();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}

