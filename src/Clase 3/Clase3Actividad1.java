import java.util.Scanner;

public class Clase3Actividad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = input.nextInt();
        String resultado = (numero % 2 == 0)? "Par": "Impar";
        System.out.println("El numero es "+ resultado);
        input.close();
    }
}
