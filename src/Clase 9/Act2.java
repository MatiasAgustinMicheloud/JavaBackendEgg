import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese su contraseña:");
            String pass = input.nextLine();

            try {
                if (pass.length() < 8) {
                    throw new Exception("La contraseña debe tener al menos 8 caracteres");
                }

                boolean tieneMayuscula = false, tieneMinuscula = false, tieneNumero = false, tieneEspecial = false;

                for (char c : pass.toCharArray()) {
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
                    throw new Exception("La contraseña debe tener al menos una letra mayuscula");
                }
                if (!tieneMinuscula) {
                    throw new Exception("La contraseña debe contener al menos una letra minúscula.");
                }
                if (!tieneNumero) {
                    throw new Exception("La contraseña debe contener al menos un número.");
                }
                if (!tieneEspecial) {
                    throw new Exception("La contraseña debe contener al menos un carácter especial.");
                }

                System.out.println("Contraseña segura!");
                break;
            } catch (Exception e) {
                System.out.println("Contraseña no segura!" + e.getMessage());
            }
        }

        input.close();
    }
}
