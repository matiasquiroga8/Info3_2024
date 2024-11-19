package Proyecto4_PilaYColaConLista;

import java.util.*;

public class ExpresionMatematica {

    // Método para verificar si los paréntesis están balanceados
    public static boolean verificarParentesis(String expresion) {
        Stack<Character> pila = new Stack<>();

        // Recorrer cada carácter de la expresión
        for (char c : expresion.toCharArray()) {
            // Si es un paréntesis de apertura, agregarlo a la pila
            if (c == '(') {
                pila.push(c);
            } // Si es un paréntesis de cierre
            else if (c == ')') {
                // Verificar si la pila está vacía (sin paréntesis de apertura)
                if (pila.isEmpty()) {
                    return false; // Desbalanceado
                }
                // Quitar el paréntesis de apertura correspondiente
                pila.pop();
            }
        }

        // Si la pila está vacía al final, los paréntesis están balanceados
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        // Ejemplos de prueba
        String[] expresiones = {
            "((3+2)*5)",
            "((3+2)*5))",
            "((3+2)*(5-2))",
            "(3+2)*5)",
            "(3+2)*5",
            "((3+2)*(5-3)"
        };

        // Verificar cada expresión
        for (String expresion : expresiones) {
            boolean balanceado = verificarParentesis(expresion);
            System.out.printf("Expresión: %s -> %s%n",
                    expresion,
                    balanceado ? "Paréntesis balanceados" : "Paréntesis desbalanceados");
        }
    }
}
