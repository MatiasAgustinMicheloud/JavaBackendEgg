public class Act7 {
    public static void main(String[] args) {
        System.out.println("\033\143");// limpia la consola
        float suma = 0;
        float[] array = new float[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (Math.random() * (10 + 1));// (max-min)+1)+min;
            System.out.printf("%.2f ", array[i]);
        }

        for (float numero : array) {
            suma += numero;
        }

        System.out.println();
        System.out.println("El promedio es: " + suma / 20);
    }
}
