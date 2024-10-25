import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        final String PASSWORD = "hola123";
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la contraseña:");
        String contraseña = input.nextLine();

        if (PASSWORD.equals(contraseña)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso Denegado");
        }

        input.close();
    }
}
