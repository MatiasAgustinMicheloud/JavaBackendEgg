import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Ingresa un número: ");
            int numero = Integer.parseInt(input.nextLine());
            System.out.println("El número es: " + numero);
        } catch (NumberFormatException error) {
            System.out.println("Ingresa solo números: " + error.getMessage());
        }
        input.close();
    }
}
