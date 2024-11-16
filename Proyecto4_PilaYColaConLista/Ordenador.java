
package Proyecto4_PilaYColaConLista;

import java.util.List;

public class Ordenador {

    // Método de ordenamiento por inserción
    public static void ordenamientoPorInsercion(List<Pedido> pedidos) {
        for (int i = 1; i < pedidos.size(); i++) {
            Pedido clave = pedidos.get(i);
            int j = i - 1;
            while (j >= 0 && pedidos.get(j).getTiempoPreparacion() > clave.getTiempoPreparacion()) {
                pedidos.set(j + 1, pedidos.get(j));
                j--;
            }
            pedidos.set(j + 1, clave);
        }
    }

    // Método de ordenamiento Shell
    public static void ordenamientoShell(List<Pedido> pedidos) {
        int n = pedidos.size();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Pedido temp = pedidos.get(i);
                int j;
                for (j = i; j >= gap && pedidos.get(j - gap).getTiempoPreparacion() > temp.getTiempoPreparacion(); j -= gap) {
                    pedidos.set(j, pedidos.get(j - gap));
                }
                pedidos.set(j, temp);
            }
        }
    }

    // Método de ordenamiento Quicksort
    public static void ordenamientoQuicksort(List<Pedido> pedidos, int low, int high) {
        if (low < high) {
            int pi = partition(pedidos, low, high);
            ordenamientoQuicksort(pedidos, low, pi - 1);
            ordenamientoQuicksort(pedidos, pi + 1, high);
        }
    }

    private static int partition(List<Pedido> pedidos, int low, int high) {
        Pedido pivot = pedidos.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (pedidos.get(j).getTiempoPreparacion() <= pivot.getTiempoPreparacion()) {
                i++;
                Pedido temp = pedidos.get(i);
                pedidos.set(i, pedidos.get(j));
                pedidos.set(j, temp);
            }
        }
        Pedido temp = pedidos.get(i + 1);
        pedidos.set(i + 1, pedidos.get(high));
        pedidos.set(high, temp);
        return i + 1;
    }
}