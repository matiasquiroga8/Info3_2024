public class InvertirCadena {
    // Función recursiva para invertir una cadena
    public String invertir(String cadena) {
        // Caso base: si la cadena está vacía o tiene un solo carácter, se devuelve tal cual
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        } else {
            // Paso recursivo: último carácter + inversión del resto de la cadena
            return invertir(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}
