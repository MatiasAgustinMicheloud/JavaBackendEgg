import java.util.Scanner;

public class Act9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = input.nextLine();

        String sinEspacios = frase.replaceAll(" ", "");
        System.out.println(sinEspacios);

        System.out.println("La longitud de la frase sin espacios es: " + sinEspacios.length());

        input.close();
    }
}
