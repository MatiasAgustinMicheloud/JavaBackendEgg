import java.util.Scanner;

public class Act4 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        imprimirNombreYEdad(obtenerNombre(), obtenerEdad());
        sc.close();
    }

    public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }

    public static String obtenerNombre() {
        System.out.println("Por favor ingrese un nombre:");
        return sc.nextLine();
    }

    public static int obtenerEdad() {
        System.out.println("Por favor ingrese una edad:");
        return sc.nextInt();
    }
}
