import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la nota entre 1 y 100: ");
        int nota = input.nextInt();
        // if (nota>=90 && nota <= 100) {
        // System.out.println("Nota: A");
        // } else if (nota >= 80 && nota < 90) {
        // System.out.println("Nota: B");
        // } else if (nota >=70 && nota < 80) {
        // System.out.println("Nota: C");
        // } else if (nota >= 60 && nota < 70) {
        // System.out.println("Nota: D");
        // } else if (nota < 60 && nota >= 0) {
        // System.out.println("Nota: F");
        // } else {
        // System.out.println("Error! Nota fuera de rango");
        // }

        if (nota > 100 || nota < 0) {
            System.out.println("Error! Nota fuera de rango");
        } else if (nota >= 90) {
            System.out.println("Nota: A");
        } else if (nota >= 80) {
            System.out.println("Nota: B");
        } else if (nota >= 70) {
            System.out.println("Nota: C");
        } else if (nota >= 60) {
            System.out.println("Nota: D");
        } else {
            System.out.println("Nota: F");
        }

        input.close();
    }
}
