public class Act4 {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, -5, 7, 10 };
        int[] aux = new int[numeros.length];
        int j = 0;
        for (int i = numeros.length - 1; i >= 0; i--) {
            aux[j] = numeros[i];
            j++;
        }

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aux[i];
            System.out.print(numeros[i] + " ");
        }
    }
}

// Con un solo for.
// int[] datos2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// int aux = 0;
// for (int i = 0; i < datos2.length / 2; i++) {
// aux = datos2[i];
// datos2[i] = datos2[datos2.length - 1 - i];
// datos2[datos2.length - 1 - i] = aux;
// }