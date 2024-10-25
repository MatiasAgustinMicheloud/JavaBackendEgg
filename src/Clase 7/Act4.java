import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = input.nextLine();
        System.out.println("Ingrese el caracter que desea buscar: ");
        char caracter = input.next().charAt(0);

        String resultado = (palabra.indexOf(caracter) != -1) ? "Existe" : "No existe";

        System.out.println("El caracter '" + caracter + "' " + resultado + " en la palabra " + palabra);

        input.close();
    }
}
