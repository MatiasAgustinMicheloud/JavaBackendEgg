import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero = input.nextInt();

        System.out.println("El valor absoluto de " + numero + " es: " + Math.abs(numero));

        input.close();
    }
}
