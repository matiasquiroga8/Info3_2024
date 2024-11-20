package Proyecto3_PilaYCola;

import java.util.*;

public class Palindromo {

    // Método para verificar si una cadena es un palíndromo
    public static boolean isPalindrome(String input) {
        // Preprocesar la cadena: eliminar espacios y convertir a minúsculas
        String cleanString = input.replaceAll("\\s+", "").toLowerCase();

        // Calcular la longitud de la cadena
        int length = cleanString.length();
        int halfLength = length / 2;

        // Crear una pila para almacenar la primera mitad de la cadena
        Stack<Character> stack = new Stack<>();

        // Llenar la pila con los caracteres de la primera mitad
        for (int i = 0; i < halfLength; i++) {
            stack.push(cleanString.charAt(i));
        }

        // Calcular el índice de inicio para la segunda mitad
        int startIndex = (length % 2 == 0) ? halfLength : halfLength + 1;

        // Comparar los caracteres de la segunda mitad con los de la pila
        for (int i = startIndex; i < length; i++) {
            if (stack.isEmpty() || stack.pop() != cleanString.charAt(i)) {
                return false; // No es un palíndromo
            }
        }

        // Si se recorrió toda la segunda mitad y coincidieron los caracteres, es un palíndromo
        return true;
    }

    // Programa principal para probar el método
    public static void main(String[] args) {
        String[] testCases = {
            "A man a plan a canal Panama",
            "racecar",
            "Was it a car or a cat I saw",
            "No lemon no melon",
            "Marcelo agachate y conocelo"
        };

        for (String testCase : testCases) {
            System.out.printf("¿Es \"%s\" un palíndromo? %b%n", testCase, isPalindrome(testCase));
        }
    }
}
