import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String texto = input.nextLine();
        System.out.println("La longitud del texto es de " + texto.length() + " caracteres.");
        input.close();
    }
}
