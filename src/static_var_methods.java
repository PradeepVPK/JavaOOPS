class statictest {
    static int a = 50;
     int b = 49;

    void show() {
        System.out.println("A :" + a+"B :" + b);
    }
    static void display() {
        System.out.println("A :" + a);
    }
}
    public class static_var_methods {
    public static void main(String[] args) {
        statictest o1= new statictest();
        statictest o2= new statictest();
        o2.show();
        o1.show();
        statictest.a=200;
        o1.b=88;
        o2.show();
        o1.show();

    }
}
