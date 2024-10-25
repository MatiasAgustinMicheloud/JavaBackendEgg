import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 30");
        int numeroLimite = sc.nextInt();
        int numAleatorio;
        sc.close();

        if (numeroLimite >= 1 && numeroLimite <= 30) {
            numAleatorio = (int) (Math.random() * (numeroLimite - 1) + 1);
            System.out.println("La raiz cuadrada de " + numAleatorio + " es: " + Math.sqrt(numAleatorio));

            // Hecho con un for
            // boolean esPrimo = true;
            // if (numAleatorio < 2) {
            // esPrimo = false;
            // }
            // Verificar divisores desde 2 hasta la raíz cuadrada del número
            // for (int i = 2; i <= Math.sqrt(numAleatorio); i++) {
            // if (numAleatorio % i == 0) {
            // esPrimo = false; // Si es divisible por algún número, no es primo
            // break;
            // }
            // }
            // if (esPrimo) {
            // System.out.println("El numero aleatorio generado " + numAleatorio + " es
            // primo");
            // } else {
            // System.out.println("El numero aleatorio generado " + numAleatorio + " no es
            // primo");
            // }

            // Hecho con un Switch
            if (numAleatorio == 1) {
                System.out.println("el numero no es primo");
            } else {
                switch (numAleatorio) {
                    case 2, 3, 5, 7, 11, 13, 17, 19, 23, 29:
                        System.out.println("Es primo");
                        break;
                    default:
                        System.out.println("No es primo");
                        break;
                }
            }

        } else {
            System.out.println("El numero ingresado no es valido.");
        }
    }
}
