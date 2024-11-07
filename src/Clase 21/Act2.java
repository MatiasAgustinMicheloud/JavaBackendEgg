import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = sc.nextInt();

        int resultado = factorial(num);
        System.out.println("El factorial de " + num + " es: " + resultado);
        sc.close();
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return (n * factorial(n - 1));
    }
}
