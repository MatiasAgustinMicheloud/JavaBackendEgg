import java.util.Scanner;

public class Clase2VerificarEdad {
    public static void main(String[] args) {
        // Declaro año actual como constante
        final int ANIO_ACTUAL = 2024;

        // Crear objeto Scanner para leer entrada
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese su fecha de nacimiento
        System.out.println("Ingrese su fecha de nacimiento: ");
        int anioNacimiento = input.nextInt();

        // Edad actual
        int edadActual = ANIO_ACTUAL - anioNacimiento;

        // Mostrar edad
        System.out.println("Tienes " + edadActual + " años de edad.");

        // Verificar si el usuario es mayor de edad
        if (edadActual >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        //System.out.println(String.format("%s", (calculoEdad>18? "Es mayor de edad" : "Es menor de edad")));

        //System.out.println("""
        //El número %d es mayor al número %d y el número %d es mayor al número %d? = %b
        //""".formatted(num3, num4, num5, num6, (num3>num4 && num5>num6)));

        // Cerramos el objeto Scanner previamente creado
        input.close();
    }
}



