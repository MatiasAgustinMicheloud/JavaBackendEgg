import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota del alumno: ");
        int nota = sc.nextInt();

        System.out.println("La calificacion es: " + obtenerNota(nota));

        sc.close();
    }

    public static String obtenerNota(int nota) {
        String calificacion = switch (nota / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            case 1, 2, 3, 4, 5 -> "F";

            default -> "Error";
        };
        return calificacion;
    }
}
