import java.util.Arrays;

public class Act8 {
    public static void main(String[] args) {
        String[] arregloNombres = { "Laura", "Eduardo", "Camila", "Florencia" };

        // if (arregloNombres[0].compareTo(arregloNombres[1])) {}

        Arrays.sort(arregloNombres);
        System.out.println("nombres ordenados: " + Arrays.toString(arregloNombres));
    }
}
