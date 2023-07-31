import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(num + " X " + i + " = " + i * num);
        }
    }
}