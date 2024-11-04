import java.util.Scanner;

public class Act1v2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantAlumnos = scanner.nextInt();
        scanner.nextLine();

        String[] name = new String[cantAlumnos];
        Double[] nota = new Double[cantAlumnos];
        int menu;

        do {
            System.out.println("-- Menú --");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Mostrar promedio");
            System.out.println("4. Buscar alumno");
            System.out.println("5. Modificar nota");
            System.out.println("6. Eliminar alumno");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    addStudentGrade(name, nota);
                    break;
                case 2:
                    showStudent(name, nota);
                    break;
                case 3:
                    showAverage(nota);
                    break;
                case 4:
                    findStudent(name, nota);
                    break;
                case 5:
                    modifyGrade(name, nota);
                    break;
                case 6:
                    deleteStudent(name, nota);
                    break;
                case 10:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (menu != 10);

        scanner.close();
    }

    // option 1
    public static void addStudentGrade(String[] name, Double[] nota) {
        for (int i = 0; i < name.length; i++) {
            do {
                System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
                name[i] = scanner.nextLine();
            } while (name[i].isEmpty());

            do {
                System.out.print("Ingrese la nota: ");
                nota[i] = scanner.nextDouble();
                scanner.nextLine();
            } while (nota[i] < 0 || nota[i] > 10);

        }

    }

    // option 2
    public static void showStudent(String[] name, Double[] nota) {

        System.out.println("- Lista de Alumnos -");
        for (int i = 0; i < name.length; i++) {
            System.out.println("Alumno: " + name[i] + " - Nota: " + nota[i]);
        }
    }

    // option 3
    public static void showAverage(Double[] nota) {
        double sum = 0;
        for (int i = 0; i < nota.length; i++) {
            sum += nota[i];
        }
        double average = sum / nota.length;
        System.out.printf("El promedio es: %.2f/n", average);
    }

    // option 4
    public static void findStudent(String[] name, Double[] nota) {
        System.out.print("Ingrese el nombre del estudiante que desea buscar: ");
        String studentName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(studentName)) {
                System.out.println("Estudiante encontrado: " + name[i] + " - Nota: " + nota[i]);
                found = true;

            }
        }
        if (!found) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // option 5
    public static void modifyGrade(String[] name, Double[] nota) {
        System.out.print("Ingrese el nombre del estudiante que desea buscar: ");
        String studentName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(studentName)) {
                System.out.print("Ingrese la nueva nota: ");
                nota[i] = scanner.nextDouble();
                scanner.nextLine();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // option 6
    public static void deleteStudent(String[] name, Double[] nota) {
        System.out.print("Ingrese el nombre del estudiante que desea borrar: ");
        String studentName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(studentName)) {
                System.out.println(name[i] + " ha sido borrado.");
                name[i] = null;
                nota[i] = null;
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Estudiante no encontrado.");
        }
    }

}