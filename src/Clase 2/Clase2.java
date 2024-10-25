import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        System.out.println("Su nombre es "+nombre+" y su edad es "+edad);
        teclado.close();
        
    }
}
