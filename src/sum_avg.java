import java.util.Scanner;

public class sum_avg {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a limit");
    int limit = in.nextInt();
    int sum=0;
    for (int i = 1; i <= limit; i++) {
        System.out.println("Enter number"+i);
        int a=in.nextInt();
        sum+=a;
    }
    System.out.println("total  :"+sum);
        System.out.println("Average  :"+sum/limit);
}


}
