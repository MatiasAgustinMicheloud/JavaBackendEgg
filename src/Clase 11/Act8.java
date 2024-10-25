public class Act8 {
    public static void main(String[] args) {
        System.out.println("\033\143");// limpia la consola
        int cont = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 1) + 1) + 1;// (max-min)+1)+min;
            System.out.print(array[i] + " ");
        }

        for (int numero : array) {
            if (numero % 2 == 0) {
                cont++;
            }
        }
        System.out.println();
        System.out.println("Total de números pares: " + cont);
    }
}
