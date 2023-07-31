import java.util.Scanner;

public class strong_number {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = in.nextInt();
            int temp = num;
            int sum=0;
            while (num>0){
                int rem =num%10;
                int fact=1;
                for (int i=1;i<=rem;i++){
                    fact*=i;
                }
                sum+=fact;
                num=num/10;
            }
            if (temp == sum) {
                System.out.println("Strong Number ");
            }
            else {
                System.out.println(" not Strong Number ");
            }
        }

}
