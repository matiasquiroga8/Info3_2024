package TrabajandoelOrdenador;

import PROYECTO2_INFO3.src.Trabajando_elPedido.Pedido01;

import java.util.List;

public class OrdenamientoPorInsercion {

    public static void ordenarPorTiempoPreparacion(List<Pedido01> pedidos) {
        // Implementación del algoritmo de ordenamiento por inserción
        for (int i = 1; i < pedidos.size(); i++) {
            Pedido01 clave = pedidos.get(i);
            int j = i - 1;

            // Comparar el tiempo de preparación de los pedidos
            while (j >= 0 && pedidos.get(j).getTiempoPreparacion() > clave.getTiempoPreparacion()) {
                pedidos.set(j + 1, pedidos.get(j));
                j--;
            }
            pedidos.set(j + 1, clave);
        }
    }
}
