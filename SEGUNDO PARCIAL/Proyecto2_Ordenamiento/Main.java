package Proyecto2_Ordenamiento;

import java.util.*;

public class Main {

    // 1. Implementación de los algoritmos de ordenación
    // a) Ordenamiento por Inserción
    public static void insertionSort(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            Comparable key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // b) Shellsort
    public static void shellSort(Comparable[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Comparable key = array[i];
                int j = i;
                while (j >= gap && array[j - gap].compareTo(key) > 0) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
    }

    // c) Quicksort
    public static void quickSort(Comparable[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(Comparable[] array, int low, int high) {
        Comparable pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(Comparable[] array, int i, int j) {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // 2. Mostrar un array en pantalla
    public static void displayArray(Comparable[] array) {
        System.out.println(Arrays.toString(array));
    }

    // 3. Generar un array aleatorio
    public static Integer[] generateRandomArray(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000); // Números aleatorios entre 0 y 9999
        }
        return array;
    }

    // 4. Captura de tiempos para cada algoritmo
    public static void measureExecutionTime(Comparable[] array, String method) {
        Comparable[] arrayCopy = Arrays.copyOf(array, array.length);
        long startTime = System.nanoTime();

        switch (method) {
            case "insertion" ->
                insertionSort(arrayCopy);
            case "shell" ->
                shellSort(arrayCopy);
            case "quick" ->
                quickSort(arrayCopy, 0, arrayCopy.length - 1);
        }

        long endTime = System.nanoTime();
        System.out.printf("Tiempo de %s: %.3f ms%n", method, (endTime - startTime) / 1e6);
    }

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        for (int size : sizes) {
            System.out.printf("\nArray de tamaño %d:\n", size);
            Integer[] array = generateRandomArray(size);

            System.out.println("Ordenando enteros:");
            measureExecutionTime(array, "insertion");
            measureExecutionTime(array, "shell");
            measureExecutionTime(array, "quick");

            System.out.println("\nOrdenando números reales:");
            Double[] doubleArray = Arrays.stream(array).mapToDouble(i -> i * 1.0).boxed().toArray(Double[]::new);
            measureExecutionTime(doubleArray, "insertion");
            measureExecutionTime(doubleArray, "shell");
            measureExecutionTime(doubleArray, "quick");

            System.out.println("\nOrdenando cadenas de caracteres:");
            String[] stringArray = Arrays.stream(array).map(Object::toString).toArray(String[]::new);
            measureExecutionTime(stringArray, "insertion");
            measureExecutionTime(stringArray, "shell");
            measureExecutionTime(stringArray, "quick");
        }
    }
}
