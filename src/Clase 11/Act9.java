import java.util.Scanner;

public class Act9 {
    public static void main(String[] args) {
        char[] letras = { 'h', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '!', ' ', 54, 56, 54, 54, 54, 54, 61, 61,
                62, 89, 67 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el caracter a contar:");
        String caracter = sc.nextLine();
        char caracterUsuario = caracter.charAt(0);
        int contador = 0;
        for (char c : letras) {
            if (c == caracterUsuario) {
                contador++;
            }
        }
        System.out.printf("El caracter %c aparece %d veces", caracterUsuario, contador);
        sc.close();
    }
}
