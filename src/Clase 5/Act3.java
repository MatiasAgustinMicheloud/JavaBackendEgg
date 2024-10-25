import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Menu
                    1- Guardar
                    2- Cargar
                    3- Salir
                Seleccione una opcion: """);

        int opcion = scanner.nextInt();
        String opcionUsuario = switch (opcion) {
            case 1 -> "Guardar";
            case 2 -> "Cargar";
            case 3 -> "Salir";
            default -> "Opción no válida";
        };
        System.out.println("La opción seleccionada es: " + opcionUsuario);
        scanner.close();
    }
}
