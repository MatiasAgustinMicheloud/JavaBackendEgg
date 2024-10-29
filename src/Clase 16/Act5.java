import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            do {
                System.out.print("Ingrese el numero: ");
                numeros[i] = s.nextInt();
            } while (1 > numeros[i] || numeros[i] > 20);
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i]);
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        s.close();
    }
}
