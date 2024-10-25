
public class Act6 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random() * 100) + 1);
            System.out.print(numeros[i] + " ");
        }

        int pares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            }
        }
        System.out.println(" ");
        System.out.println("La cantidad de numeros pares es: " + pares);
    }
}
