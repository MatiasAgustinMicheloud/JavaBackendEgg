import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int i = 1;
        int factorial = 1;

        do {
            System.out.print("Ingrese un numero para calcular su factorial: ");
            numero = input.nextInt();
        } while (!(numero > 0));

        do {
            factorial *= i;
            i++;
        } while (i <= numero);

        System.out.println("El factorial de " + numero + " es igual a: " + factorial);

        input.close();

    }
}
