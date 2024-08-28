public class ejerc3_proyect1 {
    public static void main(String[] args) {
        // Crear una instancia de la clase FibonacciRecursivo
        FibonacciRecursivo fr = new FibonacciRecursivo();
        
        // Definir el número n para el cual queremos calcular el número de Fibonacci
        int n = 6; // Ejemplo: calcular el 6-ésimo número de Fibonacci

        // Llamar al método fibonacci de la clase FibonacciRecursivo y almacenar el resultado
        int resultado = fr.fibonacci(n);
        
        // Imprimir el resultado
        System.out.println("El " + n + "-ésimo número de Fibonacci es: " + resultado);
    }
}
