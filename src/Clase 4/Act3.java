import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = input.nextInt();
        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("El numero es divisible por 5 y por 3");
        } else if (numero % 5 == 0) {
            System.out.println("El numero es divisible por 5");
        } else if (numero % 3 == 0) {
            System.out.println("El numero es divisible por 3");
        } else {
            System.out.println("El numero no es divisible por 5 ni 3");
        }

        input.close();
    }
}
