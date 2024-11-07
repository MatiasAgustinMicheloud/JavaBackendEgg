import java.util.*;

public class Act6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese una cadena: ");
        String cad = sc.nextLine();
        if (esSegura(cad))
            System.out.println("IUJUUUUU");
        else
            System.out.println("BUUUUUUUUU");

    }

    public static boolean esSegura(String cad) {
        boolean esSegura = false;
        if (tieneMayuscula(cad) && tieneMinuscula(cad) && tieneNumero(cad) && tieneLongitudCorrecta(cad)
                && tieneSpecial(cad)) {
            esSegura = true;
        } else
            esSegura = false;

        return esSegura;

    }

    public static boolean tieneLongitudCorrecta(String cad) {
        if (cad.length() < 8)
            return false;
        else
            return true;
    }

    public static boolean tieneMayuscula(String cad) {
        boolean tieneMayus = false;
        int i = 0;
        while (!tieneMayus && i < cad.length()) {
            if (Character.isUpperCase(cad.charAt(i)))
                tieneMayus = true;
            else
                i++;
        }
        return tieneMayus;
    }

    public static boolean tieneMinuscula(String cad) {
        boolean tieneMinus = false;
        int i = 0;
        while (!tieneMinus && i < cad.length()) {
            if (Character.isLowerCase(cad.charAt(i)))
                tieneMinus = true;
            else
                i++;
        }
        return tieneMinus;
    }

    public static boolean tieneNumero(String cad) {
        boolean tieneNumero = false;
        int i = 0;
        while (!tieneNumero && i < cad.length()) {
            if (Character.isDigit(cad.charAt(i)))
                tieneNumero = true;
            else
                i++;
        }
        return tieneNumero;
    }

    public static boolean tieneSpecial(String cad) {
        boolean tieneS = false;
        int i = 0;
        while (!tieneS && i < cad.length()) {
            if (!Character.isLetterOrDigit(cad.charAt(i)))
                tieneS = true;
            else
                i++;
        }
        return tieneS;
    }

}