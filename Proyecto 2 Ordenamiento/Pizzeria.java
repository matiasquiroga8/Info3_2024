package Ordenamiento;

import java.util.*;

public class Pizzeria {

    public final List<Pedido> pedidos = new ArrayList<>();

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    public void eliminarPedido(int numPedido) {
        if (numPedido >= 0 && numPedido < pedidos.size()) {
            pedidos.remove(numPedido);
        }
    }
    
    public void actualizarPedido(int numPedido, String nombre, String apellido, double tiempo, double precio) {
        if (numPedido >= 0 && numPedido < pedidos.size()) {
            Pedido pedido = pedidos.get(numPedido);
            pedido.nombre = nombre;
            pedido.apellido = apellido;
            pedido.tiempo = tiempo;
            pedido.precio = precio;
        }else {
            System.out.println("Número de pedido inválido.");
        }
    }
    
    public void mostrarPedidos() {
        pedidos.forEach(pedido -> {
            System.out.println(pedido);
        });
    }
    
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    
}
