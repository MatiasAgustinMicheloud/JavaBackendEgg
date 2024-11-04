import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        imprimirNombreYEdad(obtenerNombre(sc), obtenerEdad(sc));
        sc.close();
    }

    public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }

    public static String obtenerNombre(Scanner sc) {
        System.out.println("Por favor ingrese un nombre:");
        return sc.nextLine();
    }

    public static int obtenerEdad(Scanner sc) {
        System.out.println("Por favor ingrese una edad:");
        return sc.nextInt();
    }
}
