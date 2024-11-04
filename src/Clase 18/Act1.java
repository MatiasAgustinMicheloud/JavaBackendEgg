import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");// Limpiar consola
        Scanner input = new Scanner(System.in);
        int opcion;

        System.out.println("Cuantos alumnos tiene el curso: ");
        int cantidadAlumnos = input.nextInt();
        String[] arrayNombres = new String[cantidadAlumnos];// se inicializa con null
        Double[] arrayNotas = new Double[cantidadAlumnos];// se inicializa con 0
        input.nextLine();// limpia el buffer

        do {
            System.out.println("""
                    MENU:
                        1- Registrar Usuario
                        2- Mostrar todos los alumnos
                        3- Mostrar promedio notas
                        4- Buscar alumno por nombre
                        5- Modificar nota por nombre
                        6- Eliminar alumno por nombre
                        7- Salir
                    Seleccione una opcion: """);
            opcion = input.nextInt();
            input.nextLine();// limpia el buffer
            System.out.print("\033[H\033[2J");// Limpiar consola
            switch (opcion) {
                case 1:
                    String nombreAlumno;
                    boolean pasaValidacion = true;

                    do {
                        pasaValidacion = true;
                        System.out.println("Ingrese el nombre del alumno para registrar: ");
                        nombreAlumno = input.nextLine().trim();

                        for (char c : nombreAlumno.toCharArray()) {
                            if (!Character.isLetter(c)) {
                                pasaValidacion = false;
                                System.out.println("Error, ingrese solo letras");
                                break;
                            }
                        }

                        if (nombreAlumno.equals("")) {
                            pasaValidacion = false;
                            System.out.println("Error");
                        }

                    } while (!pasaValidacion);

                    Double nota = -1.0;

                    do {
                        try {
                            input.nextLine();
                            System.out.println("Ingrese la nota del alumno: ");
                            nota = input.nextDouble();

                        } catch (InputMismatchException e) {
                            System.out.println("Error ingrese solo numeros!");

                        }

                    } while (nota < 0.0 || nota > 10.0);

                    for (int i = 0; i < arrayNombres.length; i++) {
                        if (arrayNombres[i] == null) {
                            arrayNombres[i] = nombreAlumno;
                            break;
                        }
                    }

                    for (int i = 0; i < arrayNotas.length; i++) {
                        if (arrayNotas[i] == null) {
                            arrayNotas[i] = nota;
                            break;
                        }
                    }

                    break;
                case 2:
                    System.out.println(Arrays.toString(arrayNombres));
                    System.out.println(Arrays.toString(arrayNotas));

                    break;

                case 3:
                    Double sumaNotas = 0.0;
                    int j;
                    for (j = 0; j < arrayNotas.length; j++) {
                        if (arrayNotas[j] == null) {
                            break;
                        }
                        sumaNotas += arrayNotas[j];
                    }
                    System.out.printf("El promedio de las notas es de %.2f \n", sumaNotas / (j));
                    break;
                case 4:
                    do {
                        pasaValidacion = true;
                        System.out.println("Ingrese el nombre del alumno a buscar: ");
                        nombreAlumno = input.nextLine().trim().toLowerCase();

                        for (char c : nombreAlumno.toCharArray()) {
                            if (!Character.isLetter(c)) {
                                pasaValidacion = false;
                                System.out.println("Error, ingrese solo letras");
                                break;
                            }
                        }

                        if (nombreAlumno.equals("")) {
                            pasaValidacion = false;
                            System.out.println("Error");
                        }

                    } while (!pasaValidacion);
                    boolean existeAlumno = false;
                    for (int i = 0; i < arrayNombres.length; i++) {
                        if (!(arrayNombres[i] == null)) {
                            if (arrayNombres[i].toLowerCase().equals(nombreAlumno)) {
                                System.out.println("La nota del alumno: " + nombreAlumno + " es: " + arrayNotas[i]);
                                existeAlumno = true;
                            }

                        }

                    }
                    if (!existeAlumno) {
                        System.out.println("El alumno ingresado no se encuentra en la lista.");
                    }

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    break;
            }
        } while (opcion != 7);

        input.close();
    }
}
