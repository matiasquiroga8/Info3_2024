import java.math.BigInteger;

public class Factorial {

    // Función recursiva para calcular el factorial de un número utilizando BigInteger
    public static BigInteger calcularFactorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE; // Caso base: factorial de 0 es 1
        } else {
            return n.multiply(calcularFactorial(n.subtract(BigInteger.ONE))); // Llamada recursiva
        }
    }
}