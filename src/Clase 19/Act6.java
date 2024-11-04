import java.util.Scanner;

public class Act6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = pedirNumeros();
        imprimirTablaMultiplicar(nums);

    }

    public static int[] pedirNumeros() {
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un número: ");
            nums[i] = scanner.nextInt();
        }
        return nums;

    }

    public static void imprimirTablaMultiplicar(int[] nums) {
        for (int i : nums) {
            System.out.println("La tabla de multiplicar de " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (j * i));
            }
        }

    }

}
