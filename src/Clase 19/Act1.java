import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Por favor ingrese una edad:");
        int edad = scanner.nextInt();
        imprimirNombreYEdad(nombre, edad);
        scanner.close();

    }

    public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo: " + nombre + " y tengo " + edad + " años.");

    }
}
