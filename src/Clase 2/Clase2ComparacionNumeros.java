import java.util.Scanner;
public class Clase2ComparacionNumeros {

    public static void main(String[] args){
        int num1,num2;
        Scanner cap = new Scanner(System.in);
        System.out.println("Please type number 1: ");
        num1=cap.nextInt();
        System.out.println("Please type number 2: ");
        num2=cap.nextInt();

        // (condicion) ? true execute : false execute
        String res=(num1>num2)?"is greater ":(num1==num2)?"is equal":"is less ";
        //String
        System.out.println("The number 1: "+num1+" "+res+ " than the number 2: "+num2);
        cap.close();
    }
}