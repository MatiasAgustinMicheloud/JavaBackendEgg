import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese su nombre: ");
        String apellido = input.nextLine();

        String nombreCompleto = "";

        // nombreCompleto = nombreCompleto.concat(nombre);
        // nombreCompleto = nombreCompleto.concat(" "); // Agrego un espacio para
        // separar el NyA
        // nombreCompleto = nombreCompleto.concat(apellido);

        nombreCompleto = nombreCompleto.concat(nombre).concat(" ").concat(apellido);

        System.out.println("Nombre completo: " + nombreCompleto);
        input.close();
    }
}
