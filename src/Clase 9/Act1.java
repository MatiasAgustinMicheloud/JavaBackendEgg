import java.util.Scanner;
import java.util.InputMismatchException;

public class Act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Ingrese una temperatura: ");
            double temperatura = input.nextDouble();
            input.nextLine(); // Vaciar buffer
            System.out.print("Ingrese la unidad de medida: Celcius (C) o Fahrenheit (F): ");
            char unidadMedida = input.next().charAt(0);

            if (unidadMedida == 'C' || unidadMedida == 'c') {
                System.out.printf(temperatura + " °C a Fahrenheit es: %.2f%n", (temperatura * 9 / 5) + 32);
                // String.format("%.3f", (temperatura * 9 / 5) + 32)
            } else if (unidadMedida == 'F' || unidadMedida == 'f') {
                System.out.printf(temperatura + " F a grados Celcius es: %.2f °C %n", ((temperatura - 32) * 5 / 9));
            } else {
                System.out.println("Error! Ingrese una unidad valida.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        } catch (Exception e) {
            System.out.println("Ocurrio un Error!");
        }

        input.close();
    }
}
