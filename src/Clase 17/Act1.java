import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");// Limpiar consola
        Scanner input = new Scanner(System.in);
        int opcion;
        boolean fraseCreada = false;
        String oracion = "";
        do {
            if (!fraseCreada) {
                System.out.print("""
                        MENU:
                            1- Crear oracion
                            2- Cantidad de caracteres
                            3- Cantidad de palabras
                            4- Ver Palabras ordenadas alfabeticamente
                            5- Ver palabra por posicion
                            6- Buscar palabra
                            7- Modificar palabra
                            8- Agregar contenido a la oracion
                            9- Salir
                        Elegir una opcion:  """);
                opcion = input.nextInt();
            } else {
                System.out.println("""
                        MENU:
                            1- Borrar oracion
                            2- Cantidad de caracteres
                            3- Cantidad de palabras
                            4- Ver Palabras ordenadas alfabeticamente
                            5- Ver palabra por posicion
                            6- Buscar palabra
                            7- Modificar palabra
                            8- Agregar contenido a la oracion
                            9- Salir
                        Elegir una opcion:  """);
                opcion = input.nextInt();
            }

            input.nextLine();// Limpiar buffer
            System.out.print("\033[H\033[2J");// Limpiar consola

            switch (opcion) {
                case 1:
                    if (!fraseCreada) {
                        System.out.println("Ingrese la oracion: ");
                        oracion = input.nextLine().trim();
                        fraseCreada = true;
                        System.out.println("Oracion creada!");
                        System.out.println("");
                    } else {
                        oracion = "";
                        fraseCreada = false;
                        System.out.println("Oracion eliminada!");
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("La cantidad de caracteres que contiene la oracion es: " + oracion.length());
                    System.out.println("");
                    break;
                case 3:
                    String[] arrayOracion = oracion.split("\\s+");// Crea un array con el String separando con los
                                                                  // espacios en blanco
                    System.out.println("La cantidad de palabras es: " + arrayOracion.length);

                    // int cantPalabras = 0;
                    // for (int i = 0; i < oracion.length(); i++) {
                    // if (oracion.charAt(i) == ' ') {
                    // cantPalabras++;
                    // }
                    // }
                    // if (fraseCreada) {
                    // System.out.println("La cantidad de palabras en la oracion es: " +
                    // (cantPalabras + 1));
                    // } else {
                    // System.out.println("La cantidad de palabras en la oracion es: " +
                    // cantPalabras);
                    // }

                    break;
                case 4:

                    break;
                // case 5:

                // break;
                // case 6:

                // break;
                // case 7:

                // break;
                // case 8:

                // break;
                case 9:
                    break;

                default:
                    System.out.println("Error! Opcion invalida");
                    break;
            }

        } while (opcion != 9);

        System.out.println("La oracion es: " + oracion);

        input.close();
    }
}