import java.util.Scanner;

public class enhanced_for {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter limit :");
        int limit=in.nextInt();
        int [] c =new int[limit];
        for (int i = 0; i <limit; i++) {
            System.out.println("enter the number "+(i+1));
            c[i]=in.nextInt();
        }
        for(int element : c){
            System.out.println("number :"+element);
        }
    }
}
