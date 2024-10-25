// int randomNum = (int) (Math.random() * (max - min + 1)) + min; <-- formula para indicar un rango con random()

import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero como limite inferior: ");
        int lim1 = sc.nextInt();
        System.out.println("Ingrese un numero como limite superior: ");
        int lim2 = sc.nextInt();
        int randomNum = lim1 + (int) (Math.random() * ((lim2 - lim1) + 1));

        System.out.println("El numero aleatorio generado es: " + randomNum);
        sc.close();
    }
}
