import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.print("""
                    Menu
                        1- Comprar Producto
                        2- Realizar Devolucion
                        3- Ver mis productos
                        4- Preguntas Frecuentes
                        5- Salir
                    Seleccione una opcion: """);

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ver comprar productos");
                    break;
                case 2:
                    System.out.println("Ver Realizar Devoluciones");
                    break;
                case 3:
                    System.out.println("Ver mis productos");
                    break;
                case 4:
                    System.out.println("Ver preguntas frecuentes");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error, numero invalido!");
                    break;
            }
        }
        input.close();
    }
}
