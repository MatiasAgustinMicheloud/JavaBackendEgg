import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a contar");
        int numing = sc.nextInt();
        int par = 0;
        int impar = 0;
        while (numing != 0) {
            if (numing % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            System.out.println("Ingrese otro numero para contar");
            numing = sc.nextInt();
        }
        System.out.println(
                "La cantidad de pares ingresados es: " + par + " y la cantidad de impares ingresados es " + impar);
        sc.close();
    }
}
