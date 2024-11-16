
package Proyecto9_MonticuloBinario;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de BinaryHeap
        BinaryHeap heap = new BinaryHeap();
        
        // Insertamos algunos elementos
        heap.insert(50);
        heap.insert(30);
        heap.insert(40);
        heap.insert(20);
        heap.insert(10);
        heap.insert(35);
        heap.insert(60);

        // Imprimimos el árbol detallado
        heap.printHeap();
        
        // Extraemos el máximo (raíz del heap)
        System.out.println("Max value extracted: " + heap.extractMax());
        
        // Imprimimos el árbol después de la extracción
        heap.printHeap();
    }
}