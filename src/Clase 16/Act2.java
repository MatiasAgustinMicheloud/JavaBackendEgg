import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pos1 = 0;
        int pos2 = 1;
        int suma = 0;

        System.out.println("Ingrese la posicion de Fibonacci que quiere conocer: ");
        int numero = input.nextInt();

        for (int i = 0; i < numero - 1; i++) {
            suma = pos1 + pos2;
            pos1 = pos2;
            pos2 = suma;
        }

        System.out.println("El numero en la posicion " + numero + " es: " + suma);

        input.close();

    }
}
