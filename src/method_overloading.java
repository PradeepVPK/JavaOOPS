class  multipy{
    public static int mul(int a, int b){
        return a*b;
    }

    public static double mul(double a, double b){
        return a*b;
    }

    public static double mul(double a, int b){
        return a*b;
    }

    public static int mul(int a){
        return a*a;
    }
}
public class method_overloading {
    public static void main(String[] args) {
        System.out.println(multipy.mul(5,10));
        System.out.println(multipy.mul(5.5,10.5));
        System.out.println(multipy.mul(5.5,10));
        System.out.println(multipy.mul(5));
    }
}
