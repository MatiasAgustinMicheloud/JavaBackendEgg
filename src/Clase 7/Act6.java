import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = input.nextLine();
        System.out.println("Ingrese dos caracteres:");
        char c1 = input.next().charAt(0);
        char c2 = input.next().charAt(0);

        System.out.println(frase.replace(c1, c2));

        input.close();
    }
}
