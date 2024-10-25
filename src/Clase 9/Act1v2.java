import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Act1v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        try {
            System.out.print("Ingrese la temperatura: ");
            double temperatura = scanner.nextDouble();

            System.out.print("Ingrese la unidad de medida (C/F): ");
            String unidad = scanner.next().toUpperCase();

            switch (unidad) {
                case "C" -> {
                    double fahrenheit = (temperatura * 9 / 5) + 32;
                    System.out.println(temperatura + " grados Celsius equivale a " + df.format(fahrenheit)
                            + " grados Fahrenheit.");
                }
                case "F" -> {
                    double celsius = (temperatura - 32) * 5 / 9;
                    System.out.println(
                            temperatura + " grados Fahrenheit equivale a " + df.format(celsius) + " grados Celsius.");
                }
                default -> System.out
                        .println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        }

        scanner.close();
    }
}
