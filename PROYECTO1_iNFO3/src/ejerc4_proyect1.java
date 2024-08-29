public class ejerc4_proyect1 {
    public static void main(String[] args) {
        // Crear una instancia de la clase InvertirCadena
        InvertirCadena ic = new InvertirCadena();
        
        // Definir la cadena a invertir
        String cadena = "Hola"; // Ejemplo: invertir la cadena "Hola"

        // Llamar al método invertir de la clase InvertirCadena y almacenar el resultado
        String resultado = ic.invertir(cadena);
        
        // Imprimir el resultado
        System.out.println("La cadena invertida de '" + cadena + "' es: '" + resultado + "'");
    }
}
