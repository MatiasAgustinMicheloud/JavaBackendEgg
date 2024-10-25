import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese dos palabras:");
        String palabra1 = input.nextLine();
        String palabra2 = input.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println(palabra1 + " y " + palabra2 + " Son iguales!");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " No son iguales!");
        }

        input.close();
    }
}
