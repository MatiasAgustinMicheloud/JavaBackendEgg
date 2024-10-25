import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        int[] miArray = { 1, 2, 3 };

        // final int NUM1 = miArray[0];
        // final int NUM2 = miArray[1];
        // final int NUM3 = miArray[2];

        System.out.println("Ingrese un numero entero");

        int numeroIngresado = miScanner.nextInt();

        // switch (numeroIngresado) {
        // case miArray[0]:
        // System.out.println("El numero se encuentra en el array");
        // break;
        // case 2:
        // System.out.println("El numero se encuentra en el array");
        // break;
        // case 3:
        // System.out.println("El numero se encuentra en el array");
        // break;
        // default:
        // System.out.println("El numero no se encuentra en el array");
        // break;
        // }

        if (numeroIngresado == miArray[0]) {
            System.out.println("El numero se encuentra en el array");
        } else if (numeroIngresado == miArray[1]) {
            System.out.println("El numero se encuentra en el array");
        } else if (numeroIngresado == miArray[2]) {
            System.out.println("El numero se encuentra en el array");
        } else {
            System.out.println("El numero no se encuentra en el array");
        }

        miScanner.close();
    }
}
