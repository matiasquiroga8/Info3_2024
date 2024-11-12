import java.util.Scanner;

public class pruebavscode {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Por favor, ingrese su nombre: ");
        
        // Leer el nombre ingresado por el usuario
        String nombre = scanner.nextLine();

        // Imprimir el nombre ingresado
        System.out.println("Hola, " + nombre + "!");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
