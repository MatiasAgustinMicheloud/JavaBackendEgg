import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        boolean esPrimo;

        do {
            esPrimo = true;
            System.out.print("Ingrese un numero primo (0 para salir): ");
            numero = input.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero == 2) {
                esPrimo = true;
            }

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El numero " + numero + " es Primo");
            } else {
                System.out.println("Error! " + numero + " no es un numero Primo. Vuelva a intentarlo.");
            }

        } while (!esPrimo);

        input.close();
    }
}
