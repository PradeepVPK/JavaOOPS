import java.util.Scanner;

public class do_while { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = in.nextInt();
    int reverse=0;
    do{
        int rem=num%10;
        reverse=(reverse*10)+rem;
        num=num/10;
    }while (num>0);
    System.out.println("Reverse"+reverse);
}

}
