import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your marks");
        int marks = in.nextInt();
        int ch=marks/10;
        switch (ch){
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C ");
                break;
            default:
                System.out.println("Better luck  next time" );

        }
    }
}
