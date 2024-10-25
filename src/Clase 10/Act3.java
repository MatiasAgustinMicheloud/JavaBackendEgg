import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] elementos = new int[5];
        System.out.println("Ingrese 5 numeros enteros");
        elementos[0] = sc.nextInt();
        elementos[1] = sc.nextInt();
        elementos[2] = sc.nextInt();
        elementos[3] = sc.nextInt();
        elementos[4] = sc.nextInt();
        sc.close();

        int max = elementos[0];

        if (max < elementos[1]) {
            max = elementos[1];
        }
        if (max < elementos[2]) {
            max = elementos[2];
        }
        if (max < elementos[3]) {
            max = elementos[3];
        }
        if (max < elementos[4]) {
            max = elementos[4];
        }
        System.out.println("El numero maximo es: " + max);
    }
}
