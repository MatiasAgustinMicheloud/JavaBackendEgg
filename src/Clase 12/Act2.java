import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 20 + 1);
        int numing;

        do {
            System.out.println("Intente adivinar el numero del 1 al 20");
            numing = sc.nextInt();
            if (numing == random) {
                System.out.println("Eureka, has adivinado el numero");
            } else if (numing < random) {
                System.out.println("El numero ingresado es menor al secreto");
            } else {
                System.out.println("El numero ingresado es mayor al secreto");
            }

        } while (numing != random);
        sc.close();
    }
}
