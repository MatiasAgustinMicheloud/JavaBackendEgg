import java.util.InputMismatchException;
import java.util.Scanner;

public class Act2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
            int numero1 = pedirNumero();
            int numero2 = pedirNumero();
            switch (opcion) {
                case 1:
                    System.out.println(sumar(numero1, numero2));
                    break;
                case 2:
                    System.out.println(restar(numero1, numero2));
                    break;
                case 3:
                    System.out.println(multiplicar(numero1, numero2));
                    break;
                case 4:
                    System.out.println(dividir(numero1, numero2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }

    public static int menu() {
        System.out.println("\n Menu Principal");
        System.out.println("\n 1. Sumar");
        System.out.println("\n 2. Restar");
        System.out.println("\n 3. Multiplicar");
        System.out.println("\n 4. Dividir");
        System.out.println("\n 5. Salir");
        return sc.nextInt();
    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int dividir(int numero1, int numero2) {
        try {
            return numero1 / numero2;
        } catch (ArithmeticException e) {
            System.out.println("No se puede divir por cero");
            return 0;
        }

    }

    public static int pedirNumero() {
        try {
            System.out.println("Ingresa un numero: ");
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Valor ingresado invalido");
            return sc.nextInt();
        }

    }

}
