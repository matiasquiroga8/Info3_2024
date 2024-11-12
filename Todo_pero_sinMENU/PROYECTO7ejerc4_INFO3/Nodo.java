package PROYECTO7ejerc4_INFO3;

class Nodo {
    int valor;
    Nodo izquierdo, derecho, padre;
    boolean esRojo; // True si el nodo es rojo, false si es negro

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
        this.padre = null;
        this.esRojo = true; // Por defecto, los nodos nuevos se insertan como rojos
    }
}
