import java.util.Scanner;

public class bin_dec {
    public static int bin2dec(int binNUm){
        int dec=0,pow=0;
        while (binNUm!=0){
            int rem =binNUm%2;
            dec+=rem*Math.pow(2,pow);
            binNUm=binNUm/10;
            pow++;

        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the binary number  ");
        int a = in.nextInt();
        System.out.println("Decimal Number :"+bin2dec(a));


    }
}
