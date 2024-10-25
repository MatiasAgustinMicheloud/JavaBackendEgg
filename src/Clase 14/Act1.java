import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Ingrese una cadena numerica: ");
            String cadena = input.nextLine();
            Double numero = Double.valueOf(cadena);
            System.out.println(numero);

        } catch (Exception e) {
            System.out.println("Error, la cadena no es un numero! " + e.getMessage());
        }

        input.close();
    }
}