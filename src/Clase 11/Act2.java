public class Act2 {
    public static void main(String[] args) {
        int[] numeros = { 160, 25, 55, 91, 33 };
        int min = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("El minimo numero es: " + min);
    }
}
