import java.util.Arrays;
import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantPrimos, primos = 0, contador = 2;
        boolean es_primo;

        do {
            System.out.print("Ingrese la cantida de numeros primos que desea obtener: ");
            cantPrimos = sc.nextInt();
        } while (cantPrimos <= 0);
        int[] vect_primos = new int[cantPrimos];

        while (primos < cantPrimos) {
            es_primo = true;
            for (int i = 2; i < contador; i++) {
                if (contador % i == 0) {
                    es_primo = false;
                    break;
                }
            }
            if (es_primo) {
                vect_primos[primos] = contador;
                primos++;
            }
            contador++;
        }

        System.out.printf("Los primeros %d numeros primos son %s", cantPrimos, Arrays.toString(vect_primos));
        sc.close();
    }
}
