import java.util.Arrays;
import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");
        int tamanoArreglo = scan.nextInt();

        int[] arreglo = new int[tamanoArreglo];

        System.out.println("Ingrese el número con el que quiera llenar el arreglo");
        int numero = scan.nextInt();

        Arrays.fill(arreglo, numero);
        System.out.println("El arreglo creado es: " + Arrays.toString(arreglo));

        scan.close();
    }
}
