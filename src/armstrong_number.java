import java.util.Scanner;
import java.lang.Math;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int temp=num;
        int temp2=num;
        int digit =0,sum=0;
        while (temp>0){
            digit+=1;
            temp=temp/10;

        }
        while(num>0){
            int rem=-num%10;
            sum+=Math.abs(Math.pow(rem,digit));
            num=num/10;
        }
        System.out.println(sum);
        if (temp2==sum){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not Armstrong number");
        }
    }
}