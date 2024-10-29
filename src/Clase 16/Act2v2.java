import java.util.Scanner;

public class Act2v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un Numero: ");
        num = scanner.nextInt();
        int[] fibonacci = new int[num + 1];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < num + 1; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println(fibonacci[num]);

        scanner.close();
    }
}
