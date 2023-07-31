class outer_static {
    static int a = 50;
    static int b = 49;

    static class inner_static {
        void display() {
            System.out.println("A :" + a);
            System.out.println("B :" + b);
        }
    }
}
    public class staticinner {
    public static void main(String[] args) {
        outer_static.inner_static o=new outer_static.inner_static();
        o.display();
    }
}
