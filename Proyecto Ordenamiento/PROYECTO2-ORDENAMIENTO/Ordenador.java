package Ordenamiento;

public class Ordenador {

    private final Pizzeria gestion;

    // Constructor que recibe la referencia a la Pizzeria
    public Ordenador(Pizzeria gestion) {
        this.gestion = gestion;
    }

    public void ordenarPorPrecio() {
        long startTime = System.nanoTime();
        int n = gestion.pedidos.size();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Pedido temp = gestion.pedidos.get(i);
                int j;
                for (j = i; j >= gap && gestion.pedidos.get(j - gap).precio > temp.precio; j -= gap) {
                    gestion.pedidos.set(j, gestion.pedidos.get(j - gap));
                }
                gestion.pedidos.set(j, temp);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución (Shellsort): " + (endTime - startTime) + " ns");
    }

    public void ordenarPorTiempo() {
        long startTime = System.nanoTime();
        for (int i = 1; i < gestion.pedidos.size(); i++) {
            Pedido key = gestion.pedidos.get(i);
            int j = i - 1;
            while (j >= 0 && gestion.pedidos.get(j).tiempo > key.tiempo) {
                gestion.pedidos.set(j + 1, gestion.pedidos.get(j));
                j = j - 1;
            }
            gestion.pedidos.set(j + 1, key);
        }
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución (Inserción): " + (endTime - startTime) + " ns");
    }

    public void ordenarPorNombreCliente() {
        long startTime = System.nanoTime();
        quicksort(0, gestion.pedidos.size() - 1);
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución (Quicksort): " + (endTime - startTime) + " ns");
    }

    // Función auxiliar para Quicksort
    private void quicksort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quicksort(low, pi - 1);
            quicksort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        Pedido pivot = gestion.pedidos.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (gestion.pedidos.get(j).nombre.compareTo(pivot.nombre) < 0) {
                i++;
                Pedido temp = gestion.pedidos.get(i);
                gestion.pedidos.set(i, gestion.pedidos.get(j));
                gestion.pedidos.set(j, temp);
            }
        }
        Pedido temp = gestion.pedidos.get(i + 1);
        gestion.pedidos.set(i + 1, gestion.pedidos.get(high));
        gestion.pedidos.set(high, temp);

        return i + 1;
    }
    
}
