public class ejerc5_proyect1 {
    public static void main(String[] args) {
        // Crear una instancia de la clase PotenciaRecursiva
        PotenciaRecursiva pr = new PotenciaRecursiva();
        
        // Definir los valores de a y b para calcular a^b
        int a = 2; // Base
        int b = 3; // Exponente

        // Llamar al método potencia de la clase PotenciaRecursiva y almacenar el resultado
        int resultado = pr.potencia(a, b);
        
        // Imprimir el resultado
        System.out.println(a + " elevado a la potencia de " + b + " es: " + resultado);
    }
}
