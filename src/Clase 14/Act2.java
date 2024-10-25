import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una cadena numerica: ");
        String cadena = input.nextLine();

        System.out.println("La cadena es: " + cadena);

        Integer numero = Integer.valueOf(cadena);

        System.out.println("El numero es: " + numero);

        input.close();

    }
}
