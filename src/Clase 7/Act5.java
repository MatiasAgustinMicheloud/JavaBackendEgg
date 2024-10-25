import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = input.nextLine();

        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

        input.close();
    }
}
