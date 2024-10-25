import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        opcion = miScanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El número ingresado no es válido");
                break;
        }

        miScanner.close();

    }
}
