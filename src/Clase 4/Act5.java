import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        int precio = input.nextInt();

        if (precio >= 100) {
            System.out.println("El preci con descuento es: " + ((float) precio * 0.9));
        } else {
            System.out.println("Precio completo: " + precio);
        }
        input.close();
    }
}
