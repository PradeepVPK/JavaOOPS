import java.util.Scanner;

public class add {
    public static void main(String[] args) {

       int num1,num2;

        Scanner  num= new Scanner(System.in);
        System.out.print("\nEnter a number1: ");
        num1 = num.nextInt();
        System.out.print("\nEnter a number2: ");
        num2 = num.nextInt();
        System.out.println("\n" + (num1 + num2));
    }
}
