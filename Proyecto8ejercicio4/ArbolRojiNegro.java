
package Proyecto8ejercicio4;

class ArbolRojinegro {
    private Nodo raiz;

    // Rotación a la izquierda en el nodo dado
    private void rotacionIzquierda(Nodo nodo) {
        Nodo derecho = nodo.derecho;
        nodo.derecho = derecho.izquierdo;
        
        if (derecho.izquierdo != null) {
            derecho.izquierdo.padre = nodo;
        }
        
        derecho.padre = nodo.padre;
        
        if (nodo.padre == null) {
            this.raiz = derecho;
        } else if (nodo == nodo.padre.izquierdo) {
            nodo.padre.izquierdo = derecho;
        } else {
            nodo.padre.derecho = derecho;
        }
        
        derecho.izquierdo = nodo;
        nodo.padre = derecho;
    }

    // Rotación a la derecha en el nodo dado
    private void rotacionDerecha(Nodo nodo) {
        Nodo izquierdo = nodo.izquierdo;
        nodo.izquierdo = izquierdo.derecho;
        
        if (izquierdo.derecho != null) {
            izquierdo.derecho.padre = nodo;
        }
        
        izquierdo.padre = nodo.padre;
        
        if (nodo.padre == null) {
            this.raiz = izquierdo;
        } else if (nodo == nodo.padre.derecho) {
            nodo.padre.derecho = izquierdo;
        } else {
            nodo.padre.izquierdo = izquierdo;
        }
        
        izquierdo.derecho = nodo;
        nodo.padre = izquierdo;
    }

    // Método para agregar un nodo al árbol
    public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        Nodo padre = null;
        Nodo actual = this.raiz;

        while (actual != null) {
            padre = actual;
            if (nuevoNodo.valor < actual.valor) {
                actual = actual.izquierdo;
            } else {
                actual = actual.derecho;
            }
        }

        nuevoNodo.padre = padre;

        if (padre == null) {
            this.raiz = nuevoNodo;
        } else if (nuevoNodo.valor < padre.valor) {
            padre.izquierdo = nuevoNodo;
        } else {
            padre.derecho = nuevoNodo;
        }

        nuevoNodo.esRojo = true; // Se inserta como rojo por defecto
        balancearInsercion(nuevoNodo);
    }

    // Método para balancear el árbol después de la inserción
    private void balancearInsercion(Nodo nodo) {
        Nodo padre, abuelo;
        
        while (nodo != raiz && nodo.padre.esRojo) {
            padre = nodo.padre;
            abuelo = padre.padre;

            if (padre == abuelo.izquierdo) {
                Nodo tio = abuelo.derecho;

                if (tio != null && tio.esRojo) {
                    abuelo.esRojo = true;
                    padre.esRojo = false;
                    tio.esRojo = false;
                    nodo = abuelo;
                } else {
                    if (nodo == padre.derecho) {
                        nodo = padre;
                        rotacionIzquierda(nodo);
                    }
                    padre.esRojo = false;
                    abuelo.esRojo = true;
                    rotacionDerecha(abuelo);
                }
            } else {
                Nodo tio = abuelo.izquierdo;

                if (tio != null && tio.esRojo) {
                    abuelo.esRojo = true;
                    padre.esRojo = false;
                    tio.esRojo = false;
                    nodo = abuelo;
                } else {
                    if (nodo == padre.izquierdo) {
                        nodo = padre;
                        rotacionDerecha(nodo);
                    }
                    padre.esRojo = false;
                    abuelo.esRojo = true;
                    rotacionIzquierda(abuelo);
                }
            }
        }
        raiz.esRojo = false;
    }

    // Método para visualizar el árbol (en orden)
    public void imprimirArbol(Nodo nodo, String indentacion, boolean ultimo) {
        if (nodo != null) {
            System.out.print(indentacion);
            if (ultimo) {
                System.out.print("R----");
                indentacion += "   ";
            } else {
                System.out.print("L----");
                indentacion += "|  ";
            }
            String color = nodo.esRojo ? "ROJO" : "NEGRO";
            System.out.println(nodo.valor + "(" + color + ")");
            imprimirArbol(nodo.izquierdo, indentacion, false);
            imprimirArbol(nodo.derecho, indentacion, true);
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }
}