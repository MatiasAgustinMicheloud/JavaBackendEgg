import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 5");

        int opcion = miScanner.nextInt();

        String calificacion = switch (opcion) {
            case 1 -> "Muy deficiente";
            case 2 -> "Deficiente";
            case 3 -> "Suficiente";
            case 4 -> "Notable";
            case 5 -> "Sobresaliente";
            default -> "Opcion invalida";
        };

        miScanner.close();

        System.out.println("La calificacion es: " + calificacion);
    }
}
