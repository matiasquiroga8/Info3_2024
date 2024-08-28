public class ejerc2_proyect1 {
    public static void main(String[] args) {
        // Crear una instancia de la clase SumaRecursiva
        SumaRecursiva sr = new SumaRecursiva();
        
        // Definir el número n para el cual queremos calcular la suma
        int n = 5; // Ejemplo: calcular la suma de los primeros 5 números naturales

        // Llamar al método suma de la clase SumaRecursiva y almacenar el resultado
        int resultado = sr.suma(n);
        
        // Imprimir el resultado
        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);
    }
}
