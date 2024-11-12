public class Pedido {
    private String nombreCliente;
    private double precio;
    private int tiempoPreparacion;

    public Pedido(String nombreCliente, double precio, int tiempoPreparacion) {
        this.nombreCliente = nombreCliente;
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCliente + ", Precio: " + precio + ", Tiempo de preparación: " + tiempoPreparacion + " mins";
    }
}

//Esta clase representa un pedido individual en la pizzería, 
//que contiene atributos básicos como el nombre del cliente, 
//el precio, y el tiempo de preparación.