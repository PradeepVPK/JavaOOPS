import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your marital status");
        char status = in.next().charAt(0);
        if(status=='m' || status=='M'){
            System.out.println("Enter Your Age :");
            int age=in.nextInt();
            System.out.println("Enter Your Gender M/F :");
            char Gender = in.next().charAt(0);
            if((Gender=='m' || Gender=='M') && age>30){
                System.out.println("You are eligible for Entry ");
            }
            else if ((Gender=='f' || Gender=='F') && age>25) {
                System.out.println("You are eligible for Entry ");
            }

        }
        else{
            System.out.println("You are not eligible for entry ");

        }
    }
}
