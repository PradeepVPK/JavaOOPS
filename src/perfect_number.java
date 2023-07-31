import java.util.Scanner;

public class perfect_number{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int sum=0;
        for (int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if (sum==num){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
}