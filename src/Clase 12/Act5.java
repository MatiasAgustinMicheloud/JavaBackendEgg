import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver su tabla de multiplicar");
        int numing = sc.nextInt();
        while (numing != 0) {
            for (int i = 1; i < 11; i++) {
                System.out.println(numing + " x " + i + " = " + (numing * i));
            }
            System.out.println("Ingrese un numero para ver su tabla de multiplicar");
            numing = sc.nextInt();
        }
        sc.close();
    }
}
