import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act2v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        List<String> errores = new ArrayList<>();

        if (contraseña.length() < 8) {
            errores.add("La contraseña debe tener al menos 8 caracteres.");
        }

        boolean tieneMayuscula = false, tieneMinuscula = false, tieneNumero = false, tieneEspecial = false;

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c))
                tieneMayuscula = true;
            else if (Character.isLowerCase(c))
                tieneMinuscula = true;
            else if (Character.isDigit(c))
                tieneNumero = true;
            else if ("!@#$%^&*()-_+=<>?/{}[]|".contains(String.valueOf(c)))
                tieneEspecial = true;
        }

        if (!tieneMayuscula) {
            errores.add("La contraseña debe contener al menos una letra mayúscula.");
        }
        if (!tieneMinuscula) {
            errores.add("La contraseña debe contener al menos una letra minúscula.");
        }
        if (!tieneNumero) {
            errores.add("La contraseña debe contener al menos un número.");
        }
        if (!tieneEspecial) {
            errores.add("La contraseña debe contener al menos un carácter especial.");
        }

        if (errores.isEmpty()) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura:");
            for (String error : errores) {
                System.out.println("- " + error);
            }
        }

        scanner.close();
    }
}
