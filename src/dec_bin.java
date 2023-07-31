import java.util.Scanner;

public class dec_bin {
    public static void dec2bin(int dec_number) {
        int[] binNum = new int[1000];
        int i = 0;
        while (dec_number > 0) {
            binNum[i] = dec_number % 2;
            i++;
            dec_number = dec_number / 2;
        }
        for (int j = i; j >= 0; j--) {
            System.out.print(binNum[j]);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the decimal number  ");
        int a = in.nextInt();
        System.out.println("Binary Number :");
        dec2bin(a);

    }
}
