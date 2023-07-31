import java.util.Scanner;

class calculations{
    public void add(){
        //No return type and without args
        Scanner in1 =new Scanner(System.in);
        System.out.print("\nEnter number 1 :");
        int a=in1.nextInt();
        System.out.print("\nEnter number 2 :");
        int b=in1.nextInt();
        System.out.println("Addition :"+(a+b));
    }
    public void sub(int x,int y){
        //No return type and with args
        System.out.println("Subtraction :"+(x-y));

    }
    public int mul(){
        //return type and without args
        Scanner in2 =new Scanner(System.in);
        System.out.print("\nEnter number 1 :");
        int a=in2.nextInt();
        System.out.print("\nEnter number 2 :");
        int b=in2.nextInt();

        return a*b;

    }
    public float div(float x,float y){
        return (x/y);

    }
    public void initial(){
        calculations c = new calculations();
        Scanner in =new Scanner(System.in);
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter your choice :");
        int ch=in.nextInt();
        switch (ch){
            case 1:
                c.add();
                break;
            case 2:
                Scanner in3 =new Scanner(System.in);
                System.out.print("\nEnter number 1 :");
                int a1=in3.nextInt();
                System.out.print("\nEnter number 2 :");
                int b1=in3.nextInt();
                c.sub(a1,b1);
                break;
            case 3:
                System.out.println("Multiplication :"+c.mul());
                break;
            case 4:
                Scanner in4 =new Scanner(System.in);
                System.out.print("\nEnter number 1 :");
                int num1=in4.nextInt();
                System.out.print("\nEnter number 2 :");
                int num2=in4.nextInt();
                System.out.println("Division :"+c.div(num1,num2));
                break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
        System.out.println("Do you want to continiue?");
        int choice=in.next().charAt(0);
        switch (choice){
            case  'y':
            case 'Y':
                c.initial();
                break;
            case 'n':
            case 'N':
                break;
        }
    }
}
public class calc_methods {
    public static void main(String[] args) {
        calculations c1 = new calculations();
        c1.initial();


    }
}
