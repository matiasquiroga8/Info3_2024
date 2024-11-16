package Ordenamiento;

public class Pedido {

    int numPedido;
    String nombre;
    String apellido;
    double precio;
    double tiempo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public int getnumPedido() {
        return numPedido;
    }

    public void setnumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    
    public Pedido(String n, String a, double p, double t, int id) {
        this.nombre = n;
        this.apellido = a;
        this.precio = p;
        this.tiempo = t;
        this.numPedido = id;
    }
    
     @Override
    public String toString() {
        return nombre + " " + apellido + ", Tiempo de preparacion = " + tiempo + ", Precio total= " + precio + "$";
    }
}
