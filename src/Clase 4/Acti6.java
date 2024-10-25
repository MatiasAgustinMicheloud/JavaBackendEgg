import java.util.Scanner;

public class Acti6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la edad:");
        int edad = input.nextInt();

        if (edad < 0 || edad > 122) {
            System.out.println("Error! rango de edad invalido");
        } else if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad <= 64 ) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
         input.close();
    }
}
