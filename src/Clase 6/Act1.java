import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros");
        int num1 = miScanner.nextInt();
        int num2 = miScanner.nextInt();

        int resultado = 0;
        try {
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error al ingresar el divisor. Ingrese un numero distinto de cero ");
        }
        miScanner.close();
    }
}
