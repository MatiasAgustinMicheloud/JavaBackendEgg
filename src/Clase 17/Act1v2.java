import java.util.Scanner;
import java.util.Arrays;

public class Act1v2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int opcion = 0;
            String oracion = "Hola Mundo";

            do {
                System.out.print("""
                        Menú de opciones:
                        1. Crear oración o borrar
                        2. Cantidad de caracteres de la oración
                        3. Cantidad de palabras de la oración
                        4. Mostrar palabras ordenadas alfabéticamente
                        5. Ingresar un número y devolver la palabra correspondiente
                        6. Buscar palabra dentro de la oración
                        7. Modificar palabra dentro de la oración
                        8. Agregar contenido a la oración
                        9. Salir
                        Ingresa unas de las opciones del menú:
                        """);
                opcion = scanner.nextInt();
                scanner.nextLine();

                System.out.println();

                switch (opcion) {
                    case 1:

                        /*
                         * Crear oración o Borrar oración: Si la oración está vacía,
                         * mostrar el mensaje "Crear oración". Si la oración tiene contenido,
                         * mostrar el mensaje "Borrar oración".
                         */
                        clean();
                        System.out.println("La oración es: " + oracion);
                        System.out.println("Deseas modificar la oración (y/n): ");
                        char respuesta = scanner.next().charAt(0);
                        scanner.nextLine();

                        if (respuesta == 'y') {
                            System.out.println("Ingresa una nueva oración: ");
                            oracion = scanner.nextLine().trim();
                        } else {
                            System.out.println("Ya cuentas con una oración");
                        }
                        break;

                    case 2:
                        // Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de
                        // caracteres en la oración (incluyendo espacios).
                        clean();
                        System.out.println("La oración contiene " + oracion.length() + " caracteres.");

                        break;
                    case 3:
                        clean();
                        // Cantidad de palabras de la oración: Calcular y mostrar la cantidad de
                        // palabras en la oración.

                        System.out.println("Hay " + oracion.split("\\s+").length + " palabras en la oración.");

                        break;
                    case 4:
                        clean();
                        String[] alfa = oracion.split("\\s+");
                        Arrays.sort(alfa, String.CASE_INSENSITIVE_ORDER);
                        System.out.println(Arrays.toString(alfa));
                        System.out.println(alfa.length);
                        break;
                    case 5:
                        clean();

                        String[] array = oracion.split("\\s+");
                        int numero = 1;
                        do {
                            System.out.println(
                                    "Ingrese un numero entre 1 y " + (array.length) + " para buscar una palabra");
                            numero = scanner.nextInt();
                            if (numero > array.length || numero <= 0) {
                                System.out.println("Numero Invalido, ingrese otro nuevamente");
                            }

                        } while (numero > array.length || numero <= 0);
                        System.out.println(array[numero - 1]);
                        break;
                    case 6:
                        clean();
                        String[] array1 = oracion.split("\\s+");
                        System.out.println("Ingrese la palabra que desea buscar: ");
                        String palabra = scanner.nextLine();

                        for (int i = 0; i < array1.length; i++) {
                            if (palabra.equals(array1[i])) {
                                System.out.println("Palabra encontrada en la posicion " + (i + 1));
                                break;
                            }
                        }

                        break;
                    case 7:
                        clean();

                        String[] array2 = oracion.split("\\s+");

                        boolean existePalabra = false;

                        do {
                            System.out.println("Ingrese la palabra que desea modificar: ");
                            String palabra1 = scanner.nextLine();
                            for (int i = 0; i < array2.length; i++) {
                                if (palabra1.equals(array2[i])) {
                                    System.out.println("Ingrese la nueva palabra o frase: ");
                                    String nuevaPalabra = scanner.nextLine();
                                    existePalabra = true;
                                    array2[i] = nuevaPalabra;
                                    break;
                                }
                            }

                            if (!existePalabra) {
                                System.out.println("La palabra no se encontro en el arreglo. Intente nuevamente");
                            }
                        } while (!existePalabra);

                        break;
                    case 8:
                        clean();
                        break;
                    case 9:
                        clean();
                        System.out.println("Saliendo del programa... \n");
                        break;
                    default:
                        System.out.println("Ingrese un número válido \n");
                        break;
                }

            } while (opcion != 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}