class test{
    final int MIN=10;
    final int MEDIUM;
    final int MAX;

    test(int MED) {
        MEDIUM=MED;
        MAX=100;
    }
    void display(){
        System.out.println(MIN);
        System.out.println(MEDIUM);
        System.out.println(MAX);
    }

}
public class finalvariable {
    public static void main(String[] args) {
        test o=new test(50);
        o.display();
    }
}
