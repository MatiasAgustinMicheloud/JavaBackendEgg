import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = input.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = input.nextInt();

        System.out.println("El resultado de " + numero + " a la " + exponente + " es: " + Math.pow(numero, exponente));

        input.close();
    }
}
