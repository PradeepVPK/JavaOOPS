import java.util.Scanner;
public class ant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //input
        int n=in.nextInt();
        int index=0;
        //calc square root
        int sqrt =(int)Math.sqrt(n);
        //declaring an array
        int[] primes=new int[sqrt];
        //finding prime numbers within the range
        for (int i=2;i<=sqrt;i++){
            int k=0;
            for (int j=2;j<i;j++) {
                if (i % j == 0) {
                    k++;
                }
            }
           if (k==0){
            primes[index]=i;
            index++;
           }
        }
        System.out.println("THE PRIME NUMBERS WITHIN "+sqrt+" ARE ");
        //printing prime numbers within the range
        for (int i=0;i<index;i++){
            System.out.print(primes[i]+" ");
        }
        System.out.println();
        int x=1;
        //prime or not prime
        for (int i=0;i<index;i++){
            if (n%primes[i]==0){
                x++;
                System.out.println(primes[i]+" divides "+n);
                break;
            }
        }
        if (x>1){

            System.out.println(n+" is not prime number");
        }
        else
            System.out.println(n+" is  prime number");

    }
}
