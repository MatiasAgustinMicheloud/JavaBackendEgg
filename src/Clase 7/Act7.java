import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese una frase con espacios en blanco al principio y al final");
        String frase = miScanner.nextLine();

        String fraseFinal = frase.trim();

        System.out.println(" Su frase modificada es: " + fraseFinal);
        miScanner.close();
    }
}
