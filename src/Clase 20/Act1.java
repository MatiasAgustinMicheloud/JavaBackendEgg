import java.util.*;

public class Act1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(esPar(solicitarNumero()));
        sc.close();
    }

    public static int solicitarNumero() {
        try {
            System.out.println("ingrese un numero");
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("el valor ingresado no es correcto");
            return -1;
        }
    }

    public static boolean esPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}