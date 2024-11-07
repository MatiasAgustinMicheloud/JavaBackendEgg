public class Act3 {
    public static void main(String[] args) {
        int num = 97;

        boolean esPrimo = Primo(num, 2);

        System.out.printf("El numero %d %s", num, (esPrimo ? "es primo" : "no es primo"));
    }

    public static boolean PrimoNoRercursivo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean Primo(int num, int i) {
        if (i > Math.sqrt(num)) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return (Primo(num, i + 1));
    }
}
