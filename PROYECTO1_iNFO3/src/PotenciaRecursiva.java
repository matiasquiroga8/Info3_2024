public class PotenciaRecursiva {
    // Función recursiva para calcular a^b
    public int potencia(int a, int b) {
        // Caso base: cualquier número elevado a la potencia 0 es 1
        if (b == 0) {
            return 1;
        } else {
            // Paso recursivo: a * a^(b-1)
            return a * potencia(a, b - 1);
        }
    }
}
