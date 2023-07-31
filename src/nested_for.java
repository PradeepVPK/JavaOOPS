import java.util.Scanner;

public class nested_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println(" ");
        }
    }
}