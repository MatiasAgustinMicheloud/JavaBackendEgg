import java.util.Scanner;

public class Act5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaMultiplicar(numero);
    }

    public static int pedirNumero() {
        System.out.println("Ingrese el numero:");
        return sc.nextInt();
    }

    public static void imprimirTablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + numero + " = " + (numero * i));
        }
    }
}
