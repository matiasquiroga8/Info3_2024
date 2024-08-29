import java.util.*;

public class RecursividadInversionCadena {
    /*
    Escribir una función recursiva que invierta una cadena de caracteres.
    Ejemplo: invertir("Hola") = "aloH".
     */
    
    public static String inversionCadena(String x) {
        if (x.isEmpty()) {
            return x;
        } else {
            return inversionCadena(x.substring(1)) + x.charAt(0);
        }
    }
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese la cadena que desea invertir: ");
        String cadena = consola.nextLine();
        String resultado = inversionCadena(cadena);
        System.out.println("La cadena antes de invertir -" + cadena + "- despues de invertirla -" + resultado + "-");
    }
}
