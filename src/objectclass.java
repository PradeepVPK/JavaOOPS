class rectangle{
    int length,width;
    void getdetails(int x,int y){
        length=x;
        width=y;
    }
    int area(){
        return length*width;
    }
}
public class objectclass {
    public static void main(String[] args) {
        rectangle o =new rectangle();
        o.length=10;
        o.width=20;
        System.out.println("Area  :"+o.area());
        rectangle o1 =new rectangle();
        o1.getdetails(100,200);
        System.out.println("Area  :"+o1.area());
    }
}
