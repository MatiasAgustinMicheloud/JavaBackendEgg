import java.util.Arrays;
import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arregloInicial = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("El arreglo Inicial es : " + Arrays.toString(arregloInicial));

        for (int i = 0; i < arregloInicial.length; i++) {
            System.out.println("El indice es : " + i);
            System.out.println("Contiene el siguiente numero : " + arregloInicial[i]);
        }

        int indiceInicial, indiceFinal;

        do {
            System.out.println("Por favor ingrese el indice inicial : ");
            indiceInicial = scanner.nextInt();
        } while (indiceInicial < 0 || indiceInicial > arregloInicial.length - 1);

        do {
            System.out.println("Ingrese un número mayor al ingresado anteriormente y menor a " + arregloInicial.length);
            indiceFinal = scanner.nextInt();
        } while (indiceFinal <= indiceInicial || indiceFinal > arregloInicial.length - 1);

        int[] arregloCopia = Arrays.copyOfRange(arregloInicial, indiceInicial, indiceFinal + 1);

        for (int i = 0; i < arregloCopia.length; i++) {
            System.out.println("El indice es : " + i);
            System.out.println("Contiene el siguiente numero : " + arregloCopia[i]);
        }
        System.out.println("\n El arreglo copiado es : " + Arrays.toString(arregloCopia));

        scanner.close();

    }
}
