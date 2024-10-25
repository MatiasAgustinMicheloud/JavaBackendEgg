import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa 1) Para Círculo, 2) para un Cuadrado o 3) para un triángulo: ");
        int seleccion = input.nextInt();
        double total = 0;

        switch (seleccion) {
            case 1 -> {
                System.out.println("Ingresa el radio: ");
                double radio = input.nextDouble();
                total = Math.PI * (Math.pow(radio, 2));
            }
            case 2 -> {
                System.out.println("Ingresa un lado: ");
                double lado = input.nextDouble();
                total = Math.pow(lado, 2);
            }
            case 3 -> {
                System.out.println("Ingresa la base: ");
                double base = input.nextDouble();
                System.out.println("Ingresa la altura: ");
                double altura = input.nextDouble();
                total = (base * altura) / 2;
            }
            default -> System.out.println("Ingresa una opción válida.");
        }

        System.out.println("El valor del área de la figura seleccionada es: " + total);

        input.close();
    }
}
