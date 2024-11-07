public class Act4 {
    public static void main(String[] args) {
        int[] vector = { 1, 2, 3, 4 };
        String[] vectorS = { "Mati", "Valen", "Mar", "Luigi" };
        int[][] matriz = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        imprimirArray(vector);
        System.out.println();
        imprimirArray(vectorS);
        System.out.println();
        imprimirArray(matriz);

    }

    public static void imprimirArray(int array[]) {
        int tam = array.length;
        for (int i = 0; i < tam; i++)
            System.out.printf("%d ", array[i]);
    }

    public static void imprimirArray(String array[]) {
        int tam = array.length;
        for (int i = 0; i < tam; i++)
            System.out.printf("%s ", array[i]);

    }

    public static void imprimirArray(int array[][]) {
        int tam = array.length;
        int col = array[0].length;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < col; j++)
                System.out.printf("%d ", array[i][j]);
            System.out.println();

        }
    }

    public static void arrayAleatorio(int array[]) {
        int tam = array.length;
        for (int i = 0; i < tam; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}