import java.lang.reflect.Method;

//Ver todos los tukis de java
public class prueba {
    public static void main(String[] args) {
        // Definir una variable de tipo String
        String cadena = "mi cadena";

        // Obtener la clase del objeto cadena en tiempo de ejecución
        Class<?> clazz = cadena.getClass();

        // Obtener todos los métodos declarados en la clase String
        Method[] methods = clazz.getDeclaredMethods();

        // Imprimir los nombres de los métodos
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
