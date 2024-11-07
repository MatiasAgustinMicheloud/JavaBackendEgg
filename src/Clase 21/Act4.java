import java.util.Scanner;
import java.util.Arrays;

public class Act4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

        scanner.close();
    }

    public static void menu() {
        System.out.println("\033\143");

        int option = 0;
        String sentence = "";

        do {
            System.out.println("");
            System.out.println("Elija la opción que desea realizar:");
            System.out.println("");
            System.out.println("1- Crear oración o Borrar oración");
            System.out.println("2- Cantidad de caracteres de la oración");
            System.out.println("3- Cantidad de palabras de la oración");
            System.out.println("4- Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5- Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6- Buscar palabra dentro de la oración");
            System.out.println("7- Modificar palabra dentro de la oración");
            System.out.println("8- Agregar contenido a la oración");
            System.out.println("9- Salir");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    sentence = agregar_borrar_oracion(sentence);
                }
                case 2 -> {
                    cantCaracteres(sentence);
                }
                case 3 -> {
                    cantPalabras(sentence);
                }
                case 4 -> {
                    palabrasOrdenadas(sentence);
                    arr = sentence.split(" ");
                    Arrays.sort(arr);

                    System.out.println("Las palabras ordenadas alfabéticamente son: " + Arrays.toString(arr));
                }
                case 5 -> {
                    System.out.print("Ingrese un número entero:");
                    int index = scanner.nextInt();
                    arr = sentence.split(" ");

                    if ((index - 1) < 0 || index > arr.length) {
                        System.out.println("Número inválido. Intente nuevamente");
                    } else {
                        System.out.println("Palabra correspondiente: " + arr[index - 1]);
                    }
                }
                case 6 -> {
                    arr = sentence.split(" ");
                    System.out.println("Ingrese palabra a buscar");
                    String search = scanner.nextLine();

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].equals(search)) {
                            System.out.println("La palabra se encontro en la posicion: " + (i + 1));
                            break;
                        } else if (i == (arr.length - 1))
                            System.out.println("La palabra no se encontro");

                    }

                }
                case 7 -> {
                    String wordToChange;

                    while (true) {
                        System.out.println("Ingrese la palabra que quiera cambiar");
                        wordToChange = scanner.nextLine();

                        if (sentence.contains(wordToChange)) {
                            break;
                        } else {
                            System.out.println("La palabra no se encuentra");
                        }
                    }

                    String newWord;

                    while (true) {
                        System.out.println("Ingrese la nueva palabra");
                        newWord = scanner.nextLine();
                        if (newWord.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                            break;
                        } else {
                            System.out.println("La palabra ingresada no es valida");
                        }
                    }

                    String newSentence = sentence.replace(wordToChange, newWord);
                    System.out.println("La vieja frase es: " + sentence + " y la nueva frase es: " + newSentence);
                }
                case 8 -> {
                    System.out.println("Ingrese la parte nueva: ");
                    String parteNueva = scanner.nextLine();
                    sentence += " " + parteNueva;
                    System.out.println(sentence);
                }
                case 9 -> {
                    System.out.println("Saliendo del menú...");
                }
                default -> {
                    System.out.println("La opción ingresada no es valida");
                }
            }

        } while (option != 9);
    }

    public static String agregar_borrar_oracion(String sentence) {
        System.out.println(sentence.isEmpty() ? "Introduce la nueva oración " : "Borrando la oración..\n");
        return sentence = sentence.isEmpty() ? scanner.nextLine() : ""; // Esto crea o borra según contenido
    }

    public static void cantCaracteres(String sentence) {
        if (!sentence.isEmpty()) {
            System.out.println("la cantidad de caracteres de la oracion es " + sentence.length());
        } else {
            System.out.println("La cadena esta vacia");
        }
    }

public static void cantPalabras(String sentence){
String[] arr = sentence.split(" ");

System.out.println("la cantidad de palabras de la oracion es " + arr.length);
}

public static void palabrasOrdenadas(sentence){

}
