import java.util.Arrays;
import java.util.Scanner;

public class Act4v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean estaBien = true;

        int[] original = { 5, 12, 23, 34, 45, 56, 67, 78, 89, 100 };

        System.out.println("Arreglo original:");
        for (int i = 0; i < original.length; i++) {
            System.out.println("Índice " + i + ": " + original[i]);
        }

        int inicio = 0;
        int fin = 0;

        while (estaBien) {
            System.out.print("índice inicial: ");
            inicio = scanner.nextInt();
            System.out.print("índice final: ");
            fin = scanner.nextInt();

            if (inicio >= 0 && fin < original.length && inicio <= fin) {
                estaBien = false;
            } else {
                System.out.println("Índices inválidos");
            }
        }

        int[] nuevoArreglo = Arrays.copyOfRange(original, inicio, fin + 1);

        System.out.println("Nuevo arreglo:");
        System.out.println(Arrays.toString(nuevoArreglo));

        scanner.close();
    }
}
