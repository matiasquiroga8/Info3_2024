package Proyecto3_PilaYCola;

import java.util.*;

public class ExpresionMatematica {
    // Método para verificar si una expresión está equilibrada

    public static boolean isBalanced(String expression) {
        // Crear una pila para almacenar los paréntesis de apertura
        Stack<Character> stack = new Stack<>();

        // Recorrer la expresión carácter por carácter
        for (char ch : expression.toCharArray()) {
            // Si es un paréntesis de apertura, añadirlo a la pila
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } // Si es un paréntesis de cierre, verificar con la pila
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No hay un paréntesis de apertura correspondiente
                }

                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // El paréntesis no coincide
                }
            }
        }

        // Si la pila está vacía, la expresión está equilibrada
        return stack.isEmpty();
    }

    // Método para verificar si los paréntesis coinciden
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }

    // Programa principal para probar el método
    public static void main(String[] args) {
        String[] testCases = {
            "((a + b) * c)",
            "{[a + b] * (c + d)}",
            "[a + b * (c / d)]",
            "(a + b) * (c + d",
            "{a + [b * (c + d)]}",
            "(a + b)) + c",
            "[(a + b])"
        };

        for (String testCase : testCases) {
            System.out.printf("¿Está equilibrada la expresión \"%s\"? %b%n", testCase, isBalanced(testCase));
        }
    }
}
