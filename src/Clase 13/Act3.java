import java.util.Arrays;

public class Act3 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5 };
        int[] arr2 = { 1, 3, 4, 5 };

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son diferentes");
        }
    }
}
