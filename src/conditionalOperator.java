import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class conditionalOperator {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number 1: ");
        int a = in.nextInt();
        System.out.println("Enter a Number 2: ");
        int b = in.nextInt();
        int c = a > b ? a : b;
        System.out.println("Greatest Number"+c);

    }
}