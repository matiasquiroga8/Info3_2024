public class FibonacciRecursivo {
    // Función recursiva para calcular el n-ésimo número de Fibonacci
    public int fibonacci(int n) {
        // Caso base: si n es 0 o 1, devolver n
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Paso recursivo: F(n) = F(n-1) + F(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
