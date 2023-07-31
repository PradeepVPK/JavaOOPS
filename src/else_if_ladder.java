import java.util.Scanner;

public class else_if_ladder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your marks");
        int marks = in.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("grade A");
        }
        else if(marks>=80 && marks<90){
            System.out.println("Grade B ");
        }
        else if(marks>=70 && marks<80){
            System.out.println("Grade C ");

        }
        else{
            System.out.println("fail");
        }
    }
}
