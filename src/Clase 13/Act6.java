import java.util.Arrays;
import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");
        int tamano = scan.nextInt();

        System.out.println("Ingrese un número con el que desee llenar el arreglo");
        int numero = scan.nextInt();

        System.out.println("Indice");
        int indice = scan.nextInt();

        int[] array1 = new int[tamano];
        Arrays.fill(array1, 0, indice, numero);

        System.out.println(Arrays.toString(array1));

        // Falta las validaciones.

        scan.close();
    }
}
