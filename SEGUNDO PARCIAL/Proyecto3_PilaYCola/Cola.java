
package Proyecto3_PilaYCola;

public class Cola {
    private int maxSize;     // Tamaño máximo de la cola
    private Object[] queueArray; // Arreglo para almacenar los elementos
    private int front;       // Índice del elemento al frente
    private int rear;        // Índice del último elemento
    private int currentSize; // Cantidad de elementos en la cola

    // Constructor para inicializar la cola
    public Cola(int size) {
        this.maxSize = size;
        this.queueArray = new Object[size];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    // Método para agregar un elemento al final (enqueue)
    public void enqueue(Object element) {
        if (isFull()) {
            throw new IllegalStateException("La cola está llena");
        }
        rear = (rear + 1) % maxSize; // Movimiento circular
        queueArray[rear] = element;
        currentSize++;
    }

    // Método para eliminar el elemento del frente (dequeue)
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        Object element = queueArray[front];
        front = (front + 1) % maxSize; // Movimiento circular
        currentSize--;
        return element;
    }

    // Método para ver el elemento al frente sin eliminarlo (top)
    public Object top() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return queueArray[front];
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Método para verificar si la cola está llena
    public boolean isFull() {
        return currentSize == maxSize;
    }

    // Método para imprimir el contenido de la cola
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
        } else {
            System.out.print("Contenido de la cola: ");
            for (int i = 0; i < currentSize; i++) {
                System.out.print(queueArray[(front + i) % maxSize] + " ");
            }
            System.out.println();
        }
    }

    // Programa principal para probar la implementación de la cola
    public static void main(String[] args) {
        // Crear una cola con capacidad para 5 elementos
        Cola queue = new Cola(5);

        // Agregar elementos a la cola
        System.out.println("Agregando elementos a la cola...");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.displayQueue();

        // Ver el elemento al frente
        System.out.println("Elemento al frente: " + queue.top());

        // Eliminar un elemento del frente
        System.out.println("Eliminando elemento: " + queue.dequeue());
        queue.displayQueue();

        // Agregar más elementos
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.displayQueue();

        // Intentar agregar un elemento adicional (cola llena)
        try {
            queue.enqueue(70);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // Vaciar la cola
        while (!queue.isEmpty()) {
            System.out.println("Eliminando elemento: " + queue.dequeue());
        }

        // Intentar ver el frente de una cola vacía
        try {
            queue.top();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}

