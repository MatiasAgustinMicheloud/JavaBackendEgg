import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Calculadora {
    public static void main(String[] args) {
        DoubleBinaryOperator[] operacion = {
                (double a, double b) -> a + b,
                (double a, double b) -> a - b,
                (double a, double b) -> a * b,
                (double a, double b) -> {
                    if (b != 0) {
                        return a / b;
                    } else {
                        throw new ArithmeticException("No se puede dividir entre cero.");
                    }
                }
        };
        Scanner scanner = new Scanner(System.in);
        double a, b;
        int opcion;
        System.out.println("Calculadora básica");
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("0. Salir");
        opcion = scanner.nextInt();
        while (opcion != 0) {
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                a = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                b = scanner.nextDouble();
                DoubleBinaryOperator resultado = operacion[opcion - 1];
                System.out.println("El resultado es: " + resultado.applyAsDouble(a, b));
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println();
            System.out.println("Seleccione una operación:");
            opcion = scanner.nextInt();
        }
        scanner.close();
    }
}