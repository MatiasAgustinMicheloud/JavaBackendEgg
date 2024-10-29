import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("Ingrese el valor del lado: ");
            N = sc.nextInt();
        } while (N <= 0);
        sc.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}
