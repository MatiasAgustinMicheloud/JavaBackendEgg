import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un numero positivo: ");
            numero = input.nextInt();
            if (numero < 0) {
                System.out.println("Error! Por favor ingrese un numero positivo.\n");
            }
        } while (numero < 0);

        System.out.println("La raiz cuadrada de " + numero + " es: " + Math.sqrt(numero));

        input.close();
    }
}
