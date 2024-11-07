import java.util.Arrays;

public class Act1 {
    public static void main(String[] args) {
        int cantidadTerminos = 15;
        int[] array = new int[cantidadTerminos];

        // fibonacci(array);
        fibonacci_recursivo(array, 2);

        System.out.println("Los primeros " + cantidadTerminos + " términos de la serie de Fibonacci son:"
                + Arrays.toString(array));
    }

    public static void fibonacci(int[] array) {
        array[0] = 0;
        if (array.length > 1) {
            array[1] = 1;

            int i = 2;
            while (i < array.length) {
                array[i] = array[i - 1] + array[i - 2];
                i++;
            }
        }
    }

    public static int fibonacci_recursivo(int[] array, int i) {
        if (i > array.length - 1) {
            return 0;
        }
        if (i == 2) {
            array[0] = 0;
            array[1] = 1;
        }
        array[i] = array[i - 1] + array[i - 2];
        return fibonacci_recursivo(array, i + 1);
    }
}
