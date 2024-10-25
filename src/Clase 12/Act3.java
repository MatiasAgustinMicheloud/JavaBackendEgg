import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "secreto";
        System.out.println("Ingrese la contraseña");
        String passing = sc.nextLine();
        while (!pass.equals(passing)) {
            System.out.println("Contraseña incorrecta, intente de nuevo.");
            passing = sc.nextLine();
        }
        System.out.println("Usted ha ingresado la contraseña correcta.");
        sc.close();
    }
}
