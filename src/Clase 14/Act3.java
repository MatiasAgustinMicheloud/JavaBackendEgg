import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una cadena: ");
        String cadena = input.nextLine();
        boolean bandera = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i))) {
                bandera = true;
            } else {
                bandera = false;
                break;
            }
        }

        if (bandera) {
            System.out.println("El mensaje solo contiene letras.");
        } else {
            System.out.println("El mensaje contiene caracteres que no son letras.");
        }

        input.close();

    }
}
