import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = input.nextLine();

        System.out.println("Ingrese dos numeros(indice inicial y indice final): ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("La subcadena resultate es '" + frase.substring(num1, num2) + "'");

        input.close();
    }
}
