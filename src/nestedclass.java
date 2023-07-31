class outer{
    int a= 50;
    class inner{
        int b=35;
        void innerdisplay(){
            System.out.println("A :"+a);
            System.out.println("B :"+b);
        }
    }
    void outerdisplay(){
        System.out.println("A :"+a);
        inner o=new inner();
        System.out.println("B :"+o.b);
    }

}

public class nestedclass {
    public static void main(String[] args) {
        outer o=new outer();
        o.outerdisplay();
        outer.inner o1=new outer().new inner();
        o1.innerdisplay();
    }
}
