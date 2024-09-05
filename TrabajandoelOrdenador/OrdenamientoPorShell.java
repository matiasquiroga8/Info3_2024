package TrabajandoelOrdenador;

import PROYECTO2_INFO3.src.Trabajando_elPedido.Pedido01;

import java.util.List;

public class OrdenamientoPorShell {

    public static void ordenarPorPrecio(List<Pedido01> listaPedidos) {
        int n = listaPedidos.size();
        
        // Inicializar el intervalo
        int intervalo = 1;
        while (intervalo < n / 3) {
            intervalo = intervalo * 3 + 1; // Secuencia de Knuth
        }

        // Realizar el ordenamiento
        while (intervalo >= 1) {
            for (int i = intervalo; i < n; i++) {
                Pedido01 temp = listaPedidos.get(i);
                int j = i;
                while (j >= intervalo && listaPedidos.get(j - intervalo).getPrecioTotal() > temp.getPrecioTotal()) {
                    listaPedidos.set(j, listaPedidos.get(j - intervalo));
                    j -= intervalo;
                }
                listaPedidos.set(j, temp);
            }
            intervalo /= 3;
        }
    }
}
