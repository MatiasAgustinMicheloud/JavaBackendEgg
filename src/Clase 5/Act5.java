import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Menu
                    1-circulo
                    2-rectangulo
                Seleccione una opcion:  """);

        int numero = input.nextInt();

        double resultado = switch (numero) {
            case 1 -> {
                System.out.println("Ingrese el radio: ");
                double radio = input.nextDouble();
                yield CalculoCirculo(radio);
            }
            default -> {
                System.out.println("Opcion invalida");
                yield -1;
            }
        };

        System.out.println(resultado);

        input.close();
    }

    public static double CalculoCirculo(double radio) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-Area o 2-Perimetro:");
        int opcion = input.nextInt();
        double resultado = -1;
        switch (opcion) {
            case 1:
                resultado = Math.PI * Math.pow(radio, 2);

                break;

            case 2:
                resultado = 2 * Math.PI * radio;
                break;
        }

        input.close();
        return resultado;
    }
}
