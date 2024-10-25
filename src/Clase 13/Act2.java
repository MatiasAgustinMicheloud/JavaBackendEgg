import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int findNum;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Array inicial:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Array inicial ordenado:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("ingrese el numero a buscar");
        findNum = scanner.nextInt();

        int index = Arrays.binarySearch(numbers, findNum);

        if (index >= 0) {
            System.out.println("El numero " + findNum + " se encuentra en la posicion " + index);
        } else {
            System.out.println("El numero " + findNum + " no se encuentra en el array");
        }

        scanner.close();
    }
}