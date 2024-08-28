public class SumaRecursiva {
    // Función recursiva para calcular la suma de los primeros n números naturales
    public int suma(int n) {
        // Caso base: si n es 0, la suma es 0
        if (n == 0) {
            return 0;
        } else {
            // Paso recursivo: n + suma de los números anteriores
            return n + suma(n - 1);
        }
    }
}
