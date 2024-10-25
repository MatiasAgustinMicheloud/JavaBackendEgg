import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero decimal: ");
        float decimal = input.nextFloat();

        System.out.println("El numero redondeado es: " + Math.round(decimal));

        input.close();
    }
}
