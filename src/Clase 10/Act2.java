import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[4];

        System.out.println("Ingrese 4 numeros enteros para agregar al arreglo: ");
        numeros[0] = input.nextInt();
        numeros[1] = input.nextInt();
        numeros[2] = input.nextInt();
        numeros[3] = input.nextInt();

        System.out.println(
                "El promedio es: " + ((float) (numeros[0] + numeros[1] + numeros[2] + numeros[3]) / numeros.length));

        input.close();

        // Scanner sc = new Scanner(System.in);
        // int[] elementos = new int[4];
        // System.out.println("Ingrese cuatro numeros enteros: ");
        // elementos[0] = sc.nextInt();
        // elementos[1] = sc.nextInt();
        // elementos[2] = sc.nextInt();
        // elementos[3] = sc.nextInt();
        // sc.close();
        // double promedio = ((elementos[0] + elementos[1] + elementos[2] +
        // elementos[3]) / (float) elementos.length);
        // System.out.println("El promedio de los cuatro numeros es : " + promedio);
    }

}