class factu {
    public int fact(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return (n*fact(n-1));
        }
    }
}
public class recursion {
    public static void main(String[] args) {
        factu a= new factu();
        System.out.println(a.fact(5));

    }
}
