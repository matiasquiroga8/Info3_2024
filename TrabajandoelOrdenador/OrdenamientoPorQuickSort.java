package TrabajandoelOrdenador;

import PROYECTO2_INFO3.src.Trabajando_elPedido.Pedido01;
import java.util.List;

public class OrdenamientoPorQuickSort {
    public static void ordenarPorIdCliente(List<Pedido01> lista) {
        quickSort(lista, 0, lista.size() - 1);
    }

    private static void quickSort(List<Pedido01> lista, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(lista, inicio, fin);
            quickSort(lista, inicio, indiceParticion - 1);
            quickSort(lista, indiceParticion + 1, fin);
        }
    }

    private static int particion(List<Pedido01> lista, int inicio, int fin) {
        Pedido01 pivote = lista.get(fin);
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (lista.get(j).getId() > pivote.getId()) { // Cambiar el signo de comparación
                i++;
                intercambiar(lista, i, j);
            }
        }
        intercambiar(lista, i + 1, fin);
        return i + 1;
    }

    private static void intercambiar(List<Pedido01> lista, int i, int j) {
        Pedido01 temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
}
