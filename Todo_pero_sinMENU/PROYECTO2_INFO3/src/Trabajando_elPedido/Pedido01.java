package PROYECTO2_INFO3.src.Trabajando_elPedido;


import java.time.LocalDateTime;

public class Pedido01 {
    private int id;
    private String clienteNombre;
    private LocalDateTime fechaHora;
    private double precioTotal;
    private int tiempoPreparacion; // en minutos
    private boolean completado;

    // Constructor
    public Pedido01(int id, String clienteNombre, LocalDateTime fechaHora, double precioTotal, int tiempoPreparacion) {
        this.id = id;
        this.clienteNombre = clienteNombre;
        this.fechaHora = fechaHora;
        this.precioTotal = precioTotal;
        this.tiempoPreparacion = tiempoPreparacion;
        this.completado = false; // Por defecto, el pedido no está completado
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    // Método para marcar el pedido como completado
    public void completarPedido() {
        this.completado = true;
    }
    

    @Override
    public String toString() {
        return "Pedido ID: " + id +
               "\nCliente: " + clienteNombre +
               "\nFecha y Hora: " + fechaHora +
               "\nPrecio Total: $" + precioTotal +
               "\nTiempo de Preparación: " + tiempoPreparacion + " minutos" +  
               "\n¿Ya salió el pedido?" + (completado ? "Sí" : "No");
    }
}

/* 
Este código muestra cómo se puede crear un pedido, imprimir su información inicial, marcarlo como registrado y luego imprimir la información actualizada. 
Con estos cambios, el atributo registrado refleja correctamente que el pedido ha sido completamente ingresado en el sistema.
*/