package Proyecto4_PilaYColaConLista;

import java.util.*;

public class PalindromoCola {

    public static void main(String[] args) {
        
        String entrada = "Was it a car or a cat I saw";

        if (esPalindromo(entrada)) {
            System.out.println("La frase: " + entrada + ", es un palíndromo.");
        } else {
            System.out.println("La frase: " + entrada + ", NO es un palíndromo.");
        }
    }

    // Método para verificar si una palabra o frase es un palíndromo
    public static boolean esPalindromo(String texto) {
        // Normalizar el texto: eliminar espacios, puntuación y convertir a minúsculas
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Usar una cola para almacenar los caracteres
        Queue<Character> cola = new LinkedList<>();

        // Llenar la cola con los caracteres del texto limpio
        for (char c : textoLimpio.toCharArray()) {
            cola.add(c);
        }

        // Verificar si el texto es un palíndromo
        int tamaño = cola.size();
        for (int i = 0; i < tamaño / 2; i++) {
            // Extraer el frente y el final para comparar
            char frente = cola.poll();
            char finalCaracter = textoLimpio.charAt(tamaño - i - 1);

            if (frente != finalCaracter) {
                return false; // No es un palíndromo
            }
        }
        return true; // Es un palíndromo
    }
}
