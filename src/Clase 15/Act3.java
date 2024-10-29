public class Act3 {
    public static void main(String[] args) {
        int pos1 = 0;
        int pos2 = 1;
        int suma = 0;

        System.out.println("Los 8 primeros terminos de la serie de Fibonacci son: ");

        System.out.println(pos1); // 0
        System.out.println(pos2); // 1

        while (pos2 < 13) {
            suma = pos1 + pos2;
            System.out.println(suma);
            pos1 = pos2;
            pos2 = suma;
        }

    }
}
