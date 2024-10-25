import java.util.Scanner;

public class Clase3Actividad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        float numero1 = input.nextFloat();
        System.out.println("Ingrese el segundo numero:");
        float numero2 = input.nextFloat();


        System.out.print("""
                    1 - Sumar
                    2 - Restar
                    3 - Multiplicar
                    4 - Dividir
                """);
        int opcion = input.nextInt();

        float resultado = 0;

        // switch (opcion) {
        //     case 1:
        //         resultado = numero1+numero2;
        //         break;
        //     case 2:
        //         resultado = numero1-numero2;
        //         break;
        //     case 3:
        //         resultado = numero1*numero2;
        //         break;
        //     case 4:
        //         resultado = numero1/numero2;
        //         break;
        //     default:
        //         System.out.println("Opcion invalida!");
        //         break;
        // }

        resultado = (opcion == 1) ? numero1+numero2 :
        (opcion == 2) ? numero1-numero2 :
        (opcion == 3) ? numero1*numero2 :
        (opcion == 4) ? numero1/numero2 :
        null;

        System.out.println("El resultado es: "+ resultado);

        input.close();

    }
}
