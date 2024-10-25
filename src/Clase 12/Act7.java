import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numing;
        int suma = 0;
        String son;
        do {
            System.out.println("Ingrese un numero a sumar");
            numing = sc.nextInt();
            if (numing > 0) {
                suma = suma + numing;
            }
            System.out.println("Desea ingresar otro numero S/N");
            sc.nextLine();
            son = sc.nextLine();
        } while (son.equals("s"));
        System.out.println("La suma de los ingresados es " + suma);
        sc.close();
    }
}
