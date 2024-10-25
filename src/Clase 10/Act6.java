import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = { 1, 2, 3, 4, 5, 6 };

        int contador = 0;

        if (numeros[0] % 2 == 0) {
            contador++;
        }
        if (numeros[1] % 2 == 0) {
            contador++;
        }
        if (numeros[2] % 2 == 0) {
            contador++;
        }
        if (numeros[3] % 2 == 0) {
            contador++;
        }
        if (numeros[4] % 2 == 0) {
            contador++;
        }
        if (numeros[5] % 2 == 0) {
            contador++;
        }

        System.out.println("La cantidad de pares es: " + contador);

        input.close();
    }
}
