import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Especifique cuantos caracteres tendra la contraseña");
        int cantDigitos = input.nextInt();

        char[] contrasena = new char[cantDigitos];
        boolean digito = false;
        boolean mayuscula = false;
        boolean minuscula = false;
        int contador = 0;
        do {
            for (int i = 0; i < cantDigitos; i++) {
                int numRandom = (int) ((Math.random() * 94) + 33);
                contrasena[i] = (char) numRandom;
                if (Character.isDigit(contrasena[i])) {
                    digito = true;
                }
                if (Character.isUpperCase(contrasena[i])) {
                    mayuscula = true;
                }
                if (Character.isLowerCase(contrasena[i])) {
                    minuscula = true;
                }

            }
            contador++;

        } while (!digito || !mayuscula || !minuscula);

        System.out.println(contrasena);
        System.out.println("La cantidad de bucles realizados para obtener la contraseña es: " + contador);

        String contraFinal = "";

        for (int j = 0; j < contrasena.length; j++) {
            String c = Character.toString(contrasena[j]);
            contraFinal = contraFinal.concat(c);
        }

        System.out.println(contraFinal);

        input.close();
    }
}